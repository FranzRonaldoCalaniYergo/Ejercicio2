import java.util.List;

public class Linea {
    String nombre;
    List<Autobus> autobuses;
    List<Parada> paradas;
    public Linea(){

    }
    public Linea(String nombre, List<Autobus> autobuses, List<Parada> paradas) {
        this.nombre = nombre;
        this.autobuses = autobuses;
        this.paradas = paradas;
    }
}
