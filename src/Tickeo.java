public class Tickeo {
    Autobus autobus;
    Parada parada;
    String horario;
    Integer sube;
    Integer baja;
    public Tickeo(){

    }

    public Tickeo(Autobus autobus, Parada parada, String horario, Integer sube, Integer baja) {
        this.autobus = autobus;
        this.parada = parada;
        this.horario = horario;
        this.sube = sube;
        this.baja = baja;
    }
}
