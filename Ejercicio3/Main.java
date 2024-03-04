import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5]; // Tamaño del array a modo de ejemplo

        System.out.println("=== Alta de Empleados ===");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Tipo de empleado (1 - Por Horas, 2 - Asalariado, 3 - Por Comision, Otro - Normal): ");
            int tipo = Integer.parseInt(scanner.nextLine());

            Empleado empleado;
            switch (tipo) {
                case 1:
                    System.out.print("Tarifa por Hora: ");
                    float tarifaPorHora = Float.parseFloat(scanner.nextLine());
                    System.out.print("Tarifa por Hora Extra: ");
                    float tarifaHoraExtra = Float.parseFloat(scanner.nextLine());
                    empleado = new EmpleadoPorHora(nombre, apellidos, tarifaPorHora, tarifaHoraExtra);
                    break;
                case 2:
                    System.out.print("Salario Mensual: ");
                    float salarioMensual = Float.parseFloat(scanner.nextLine());
                    empleado = new EmpleadoAsalariado(nombre, apellidos, salarioMensual);
                    break;
                case 3:
                    System.out.print("Porcentaje de Comisión: ");
                    float porcentajeComision = Float.parseFloat(scanner.nextLine());
                    empleado = new EmpleadoPorComision(nombre, apellidos, porcentajeComision);
                    break;
                default:
                    empleado = new Empleado(nombre, apellidos);
            }

            empleados[i] = empleado;

            System.out.println("Empleado registrado correctamente.");
            System.out.println();
        }

        System.out.println("=== Listado de Empleados ===");
        System.out.println("Nombre\t\tTipo\t\tTarifa Hora\tTarifa H.Extra\tSalario\tPorcentaje");
        System.out.println("-----------------------------------------------------------------");
        for (Empleado empleado : empleados) {
            System.out.printf("%-15s %-15s %.2f\t\t%.2f\t\t%.2f\t%.2f%%\n",
                    empleado.getNombreCompleto(), empleado.tipo(), empleado.getTarifaPorHora(),
                    empleado.getTarifaHoraExtra(), empleado.getSalarioMensual(), empleado.getPorcentajeComision());
        }
    }
}




    
    