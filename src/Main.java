public class Main {
    public static void main(String[] args) {

        Capacitacion nueva_capacitacion = new Capacitacion(
        1 , "77.758.364-8" , "2023-06-15" , "20:00" , "Campus Bootcamp"
            , "03:30" , 31
        );

        Cliente nuevo_cliente = new Cliente( 144568971 , "Juan" , "Perez Gonzalez" , 985587665 , "Capital" , 1 , "Los Arrayanes 1658",
              "Talca" , 45  );

        Usuario nuevo_usuario = new Usuario( "administraitor" , "1995-01-18" , "18.158.987-7" );

        System.out.println( nueva_capacitacion.toString());
        System.out.println( nuevo_cliente.toString());
        System.out.println( nuevo_usuario.toString());

    }
}