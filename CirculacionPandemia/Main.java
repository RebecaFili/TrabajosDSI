import java.util.Scanner;
import java.time.LocalDate;

public class Main {
  
  
  public static void main(String[] args) { 
    System.out.println("Ingrese una de las siguientes opciones");
    System.out.println("1 --> Registrar persona");
    System.out.println("2 --> Registrar actividades autorizadas");
    System.out.println("3 --> Registrar empresa");
    System.out.println("4 --> Registrar empleado a la empresa");
    System.out.println("5 --> Autorizar ingreso");
    System.out.println("6 --> Registrar baja de empleado"); 
    
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
        RegistrarEmpresa();
      break;
      case 4:
        RegistrarPersona();
        RegistrarEmpresa();
        AgregarEmpleado();
      break;
      case 5:
        RegistrarPersona();
        RegistrarEmpresa();
        AutorizarIngreso();
      break;
      case 6:
        RegistrarPersona();
        RegistrarBajaEmpleado();
    }
  }
  
  public static void RegistrarPersona(){
    RepositorioPersona listadoPersonas = new RepositorioPersona();
       
    System.out.println("Ingrese apellido");
    Scanner scanner = new Scanner(System.in);
    String apellido = scanner.nextLine();
    
    System.out.println("Ingrese dni");
    int dni = scanner.nextInt();

    Persona persona1 = new Persona(dni, apellido);
    listadoPersonas.AgregarPersona(persona1);
    System.out.println(persona1.getApellido() + " se ha registrado correctamente");
    
    Persona persona2 = new Persona(17070650, "Rodriguez");
    listadoPersonas.AgregarPersona(persona2);
    System.out.println(persona2.getApellido() + " se ha registrado correctamente");
    
    Persona persona3 = new Persona(39125670, "Sanchez");
    listadoPersonas.AgregarPersona(persona3);
    System.out.println(persona3.getApellido() + " se ha registrado correctamente");
    
    System.out.println("Cantidad de personas " + listadoPersonas.CantidadPersonas());
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
  
  public static void RegistrarEmpresa(){
    RepositorioEmpresa listadoEmpresas = new RepositorioEmpresa();
      
    System.out.println("Ingrese razon social");
    Scanner scanner = new Scanner(System.in);
    String razonSocial = scanner.nextLine();
    
    Empresa empresa1 = new Empresa(razonSocial);
    listadoEmpresas.AgregarEmpresa(empresa1);
    System.out.println("La empresa " + empresa1.getRazonSocial() + " se registro correctamente");
    
    Empresa empresa2 = new Empresa("Hermanos S.A.");
    listadoEmpresas.AgregarEmpresa(empresa2);
    System.out.println("La empresa " + empresa2.getRazonSocial() + " se registro correctamente");
    
    Empresa empresa3 = new Empresa("Servicios S.A.");
    listadoEmpresas.AgregarEmpresa(empresa3);
    System.out.println("La empresa " + empresa3.getRazonSocial() + " se registro correctamente");
    
  }
  
  public static void AgregarEmpleado(){
    RepositorioEmpresa listadoEmpresas = new RepositorioEmpresa();
    RepositorioPersona listadoPersonas = new RepositorioPersona();
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Para registrar al empleado en la empresa, primero ingrese la razon social");
    String razonSocial = scanner.nextLine();
    Empresa empresa = listadoEmpresas.ObtenerEmpresa(razonSocial);
    
    if(empresa == null){
      System.out.println("Lo sentimos! La empresa no existe");
    }
    else{
      System.out.println("Ingrese el apellido del empreado que desea registrar");
      String apellido = scanner.nextLine();
      Persona persona = listadoPersonas.ObtenerPersona(apellido);
      if(persona == null){
        System.out.println("Persona no encontrada");
      }
      else{
        empresa.AgregarEmpleado(persona);  
        System.out.println("Registrado correctamente");
      }
    }
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
      System.out.println("Persona autorizada encontrada");
      
      System.out.println("Ingrese la tempertura tomada");
      int temperatura = scanner.nextInt();
      
      if(temperatura >37){
        System.out.println("Acceso denegado");
      }
      else{
        System.out.println("Acceso concedido");
      }
    }   
  }
  
  public static void RegistrarBajaEmpleado(){
    RepositorioPersona listadoPersonas = new RepositorioPersona();
    
    System.out.println("Para dar de baja, ingrese el apellido del empleado");
    Scanner scanner = new Scanner(System.in);
    String apellido = scanner.nextLine();
    Persona persona = listadoPersonas.ObtenerPersona(apellido);
    
    if (persona == null){
      System.out.println("La persona no existe en el registro");
    }
    else{
      System.out.println("Baja del empleado " + persona + " registrada");
   }
}

}