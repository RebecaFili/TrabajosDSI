import java.time.LocalTime;
import java.time.LocalDate;

public class Control {
  private LocalTime horaIngreso;
  private LocalTime horaEgreso;
  private int temperatura;
  private int patente;
  private String lugarDestino;
  
  public Control(int temperatura){
    this.horaIngreso = horaIngreso;
    this.horaEgreso = horaEgreso;
    this.temperatura = temperatura;
    this.patente = patente;
    this.lugarDestino = lugarDestino;
  }
  
  public int getTemperatura(){
    return this.temperatura;
  }
  public void setTemperatura(int temperatura){
    this.temperatura = temperatura;
  }
  
}
