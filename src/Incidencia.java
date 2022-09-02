import java.util.Date;

public class Incidencia {
    Date fecha;
    Double costo;
    String restriccion;
    String tipo;
    public Incidencia(){

    }

    public Incidencia(Date fecha, Double costo, String restriccion, String tipo) {
        this.fecha = fecha;
        this.costo = costo;
        this.restriccion = restriccion;
        this.tipo = tipo;
    }
}
