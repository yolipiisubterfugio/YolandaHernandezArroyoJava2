public class TestMain {
    public static void main(String[] args) {
        // Caso de prueba para Empleado
        Empleado empleado1 = new Empleado("Juan", "González");
        assert empleado1.nombreCompleto().equals("Juan González");
        assert empleado1.tipo().equals("Empleado normal");

        // Caso de prueba para EmpleadoPorHora
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("María", "López", 15.0f, 20.0f);
        assert empleado2.nombreCompleto().equals("María López");
        assert empleado2.tipo().equals("Empleado Por Horas");
        assert empleado2.salarioTotal(40, 5) == 700.0f;

        // Caso de prueba para EmpleadoAsalariado
        EmpleadoAsalariado empleado3 = new EmpleadoAsalariado("Pedro", "Martínez", 2500.0f);
        assert empleado3.nombreCompleto().equals("Pedro Martínez");
        assert empleado3.tipo().equals("Empleado Asalariado");
        assert empleado3.salarioTotal() == 2500.0f;

        // Caso de prueba para EmpleadoPorComision
        EmpleadoPorComision empleado4 = new EmpleadoPorComision("Laura", "Rodríguez", 0.1f);
        assert empleado4.nombreCompleto().equals("Laura Rodríguez");
        assert empleado4.tipo().equals("Empleado A Comisión");
        assert empleado4.salarioTotal(10000.0f) == 1000.0f;

        System.out.println("Todos los casos de prueba han pasado exitosamente.");
    }
}
