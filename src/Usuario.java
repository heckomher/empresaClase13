
public class Usuario {
        public String nombre;
        public String fechaNacimiento;
        public String run;

        public Usuario(String nombre, String fechaNacimiento, String run) {
                this.nombre = nombre;
                this.fechaNacimiento = fechaNacimiento;
                this.run = run;
        }

        public Usuario() {
        }

        public String toString() {
                return "Usuario{" +
                        "nombre='" + nombre + '\'' +
                        ", fechaNacimiento='" + fechaNacimiento + '\'' +
                        ", run='" + run + '\'' +
                        '}';
        }
}
