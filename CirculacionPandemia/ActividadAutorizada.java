import java.time.LocalTime;

public class ActividadAutorizada {
  private String descripcionActividad;
  private LocalTime horaInicioCirculacion;
  private LocalTime horaFinCirculacion;
  private String localizacion;
  
  public ActividadAutorizada(String descripcionActividad){
    this.descripcionActividad = descripcionActividad;
    this.horaInicioCirculacion = horaInicioCirculacion;
    this.horaFinCirculacion = horaFinCirculacion;
    this.localizacion = localizacion;
  }
  
  public String getDescripcionActividad(){
    return this.descripcionActividad;
  }
  public void setDescripcionActividad(String descripcionActividad){
    this.descripcionActividad = descripcionActividad;
  }
  
}
