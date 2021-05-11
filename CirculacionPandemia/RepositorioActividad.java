import java.util.*;

public class RepositorioActividad {
  private static ArrayList<ActividadAutorizada> listadoActividades = new ArrayList<ActividadAutorizada>();
  
  public void AgregarActividad(ActividadAutorizada nueva){
    listadoActividades.add(nueva);
  }
  
}
