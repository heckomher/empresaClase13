public class Cliente {

    private int rut;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String afp;
    private int salud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }
    public Cliente(int rut, String nombres, String apellidos, int telefono, String afp, int salud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.salud = salud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }


    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", salud=" + salud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }
}
