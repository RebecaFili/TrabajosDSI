/**
 * Auto Generated Java Class.
 */
public class Persona {
  private int dni;
  private String nombre;
  private String apellido;
  private String domicilio;
  private long telefono;
  private String email;
  
  public Persona (int dni, String apellido){
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.domicilio = domicilio; 
    this.telefono = telefono;
    this.email = email;
  }
  
  public int getDni(){
    return this.dni;
  }
  public void setDni(int dni){
    this.dni = dni;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String getApellido(){
    return this.apellido;
  }
  public void setApellido(String apellido){
    this.apellido = apellido;
  }
  
  public String getDomicilio(){
    return this.domicilio;
  }
  public void setDomicilio(String domicilio){
    this.domicilio = domicilio;
  }
  
  public long getTelefono(){
    return this.telefono;
  }
  public void setTelefono(long telefono){
    this.telefono = telefono;
  }
  
  public String getEmail(){
    return this.email;
  }
  public void setEmail(String email){
    this.email = email;
  }
  
  public String toString() {
    return this.apellido;
  }
  
}
