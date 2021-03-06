import java.util.*;
import java.time.LocalDate;

public class RepositorioPersona {
  private static ArrayList<Persona> listadoPersonas = new ArrayList<Persona>();
  
  public void AgregarPersona(Persona nueva){
    listadoPersonas.add(nueva);
  }
  
  public int CantidadPersonas(){
    return listadoPersonas.size();
  }
  
  public Persona ObtenerPersona(String apellido){
    for (Persona persona : listadoPersonas){
      if(persona.getApellido().equalsIgnoreCase(apellido)){
        return persona;
      }
    }
    return null;
  }
  
  public Persona VerificarAutorizacion(int dni){
    for (Persona i : listadoPersonas){
      if(i.getDni() == (dni)){
        return i;
      }
    }
    return null;
  }
  
  //public boolean Verificar(){
    //boolean i = false;
    //if(this.getFechaFin().isAfter(LocalDate.now())){
      //i = true;
    //}
    //return i;
  //}
  
}
