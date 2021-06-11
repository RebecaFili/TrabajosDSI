import java.util.*;
  
public class Empresa {
  private String razonSocial;
  private long cuit;
  private String domicilio;
  private String localidad;
  private String email;
  private long telefono;
  private static ArrayList<Persona> listadoEmpleado = new ArrayList<Persona>();
  
  public Empresa(String razonSocial){
    this.razonSocial = razonSocial;
  }
  
  public String getRazonSocial(){
    return this.razonSocial;
  }
  
  public void AgregarEmpleado(Persona apellido){
    this.listadoEmpleado.add(apellido);
  }
}
