import java.util.*;

public class RepositorioPersona {
  private static ArrayList<Persona> listadoPersonas = new ArrayList<Persona>();
  
  public void AgregarPersona(Persona nueva){
    listadoPersonas.add(nueva);
  }
  
  public Persona VerificarAutorizacion(int dni){
    for (Persona i : listadoPersonas){
      if(i.getDni() == (dni)){
        return i;
      }
    }
    return null;
  }
  
}
