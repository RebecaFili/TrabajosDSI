import java.util.*;

public class RepositorioEmpresa {
  private static ArrayList<Empresa> listadoEmpresas = new ArrayList<Empresa>();
  
  public void AgregarEmpresa(Empresa nueva){
    listadoEmpresas.add(nueva);
  }
  
  public Empresa ObtenerEmpresa(String razonSocial){
    for (Empresa empresa: listadoEmpresas){
      if(empresa.getRazonSocial().equalsIgnoreCase(razonSocial)){
        return empresa;
      }
    }
    return null;
  }
  
}
