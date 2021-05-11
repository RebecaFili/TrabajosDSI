import java.util.Scanner;

public class Main {
  
  
  public static void main(String[] args) { 
    System.out.println("Ingrese una de las siguientes opciones");
    System.out.println("1 --> Registrar Persona");
    System.out.println("2 --> Registrar actividades autorizadas");
    System.out.println("3 --> Autorizar ingreso");
    
    Scanner scanner = new Scanner(System.in);
    int opcion = scanner.nextInt();
    switch(opcion){
      case 1:
        RegistrarPersona();
      break; 
      case 2:
        RegistrarActividad();
      break;
      case 3:
        RegistrarPersona();
        AutorizarIngreso();
      break;
    }
  }
  
  public static void RegistrarPersona(){
    RepositorioPersona listadoPersonas = new RepositorioPersona();
    
    System.out.println("Ingrese apellido");
    Scanner scanner = new Scanner(System.in);
    String apellido = scanner.nextLine();
    
    System.out.println("Ingrese dni");
    int dni = scanner.nextInt();

    //Autorizada
    Persona persona1 = new Persona(dni, apellido);
    listadoPersonas.AgregarPersona(persona1);
    System.out.println(persona1.getApellido() + " se ha registrado correctamente");
    
    //Autorizada
    Persona persona2 = new Persona(17070650, "Rodriguez");
    listadoPersonas.AgregarPersona(persona2);
    System.out.println(persona2.getApellido() + " se ha registrado correctamente");
    
    //No Autorizada
    Persona persona3 = new Persona(39125670, "Sanchez");
    System.out.println(persona3.getApellido() + " se ha registrado correctamente");
    
  }
  
  public static void RegistrarActividad(){
    RepositorioActividad listadoActividades = new RepositorioActividad();
    
    System.out.println("Ingrese la actividad");
    Scanner scanner = new Scanner(System.in);
    String descripcionActividad = scanner.nextLine();
    
    ActividadAutorizada actividad1 = new ActividadAutorizada(descripcionActividad);
    listadoActividades.AgregarActividad(actividad1);
    System.out.println("La actividad autorizada " + actividad1.getDescripcionActividad() + " se ha registrado correctamente");
    
  }
  
  public static void AutorizarIngreso(){
    RepositorioPersona listadoPersonas = new RepositorioPersona();
    
    System.out.println("\nPara verificar la autorizacion ingrese el dni");
    Scanner scanner = new Scanner(System.in);
    int dni = scanner.nextInt();
    Persona i = listadoPersonas.VerificarAutorizacion(dni);
    
    if(i == null){
      System.out.println("Acceso denegado");
    }else {
      System.out.println("Acceso concedido");
    }
   }
  
}

