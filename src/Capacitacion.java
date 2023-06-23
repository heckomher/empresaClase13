public class Capacitacion {

    private int identificador;
    private String rut_cliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion; //horas:minutos
    private int cantidad_asistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, String rut_cliente, String dia, String hora, String lugar, String duracion, int cantidad_asistentes) {
        this.identificador = identificador;
        this.rut_cliente = rut_cliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidad_asistentes = cantidad_asistentes;
    }

    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rut_cliente='" + rut_cliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidad_asistentes=" + cantidad_asistentes +
                '}';
    }
}
