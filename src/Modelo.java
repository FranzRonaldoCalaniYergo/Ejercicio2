import java.util.List;

public class Modelo {
    int capacidad;
    Double consumo;
    List<Autobus> autobuses;
    public Modelo (){

    }
    public Modelo (int capacidad,Double consumo){
        this.capacidad = capacidad;
        this.consumo =consumo;
    }
}
