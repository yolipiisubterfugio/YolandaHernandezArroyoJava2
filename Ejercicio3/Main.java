import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Empleado[] empleados = new Empleado[10]; // Tamaño del array a modo de ejemplo
    static Nomina[] nominas = new Nomina[10]; // Tamaño del array a modo de ejemplo
    static int contadorEmpleados = 0;
    static int contadorNominas = 0;

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de gestión de empleados y nóminas.");

        String respuesta = "S";
        while (!respuesta.equals("N")) {
            altaEmpleado();
            System.out.print("¿Quieres dar de alta otro empleado (S/N)? ");
            respuesta = scanner.nextLine();
        }

        calcularNominas();
        visualizarNominas();
    }

    static void altaEmpleado() {
        System.out.println("\n--- Alta de Empleado ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Tipo de empleado (1. Empleado, 2. EmpleadoPorHora, 3. EmpleadoAsalariado, 4. EmpleadoPorComision): ");
        int tipoEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (tipoEmpleado) {
            case 1:
                empleados[contadorEmpleados] = new Empleado(nombre, apellidos);
                break;
            case 2:
                System.out.print("Tarifa por hora: ");
                float tarifaPorHora = scanner.nextFloat();
                System.out.print("Tarifa por hora extra: ");
                float tarifaHoraExtra = scanner.nextFloat();
                scanner.nextLine(); // Limpiar el buffer de entrada
                empleados[contadorEmpleados] = new EmpleadoPorHora(nombre, apellidos, tarifaPorHora, tarifaHoraExtra);
                break;
            case 3:
                System.out.print("Salario mensual: ");
                float salarioMensual = scanner.nextFloat();
                scanner.nextLine(); // Limpiar el buffer de entrada
                empleados[contadorEmpleados] = new EmpleadoAsalariado(nombre, apellidos, salarioMensual);
                break;
            case 4:
                System.out.print("Porcentaje de comisión: ");
                float porcentajeComision = scanner.nextFloat();
                scanner.nextLine(); // Limpiar el buffer de entrada
                empleados[contadorEmpleados] = new EmpleadoPorComision(nombre, apellidos, porcentajeComision);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        contadorEmpleados++;
    }

    static void calcularNominas() {
        for (int i = 0; i < contadorEmpleados; i++) {
            Empleado empleado = empleados[i];
            System.out.println("\n--- Datos para el cálculo de la nómina de " + empleado.nombreCompleto() + " ---");
            float salario = 0;

            if (empleado instanceof Empleado) {
                System.out.print("Número de horas trabajadas: ");
                float horasTrabajadas = scanner.nextFloat();
                salario = empleado.salarioTotal(horasTrabajadas);
            } else if (empleado instanceof EmpleadoPorHora) {
                System.out.print("Número de horas trabajadas: ");
                float horasTrabajadas = scanner.nextFloat();
                System.out.print("Número de horas extra trabajadas: ");
                float horasExtra = scanner.nextFloat();
                salario = empleado.salarioTotal(horasTrabajadas, horasExtra);
            } else if (empleado instanceof EmpleadoPorComision) {
                System.out.print("Ventas totales: ");
                float ventasTotales = scanner.nextFloat();
                salario = empleado.salarioTotal(ventasTotales);
            } else if (empleado instanceof EmpleadoAsalariado) {
                salario = empleado.salarioTotal(i, i);
            }

            nominas[contadorNominas++] = new Nomina(empleado, salario);
        }
    }

    static void visualizarNominas() {
        System.out.println("\n--- Nóminas ---");
        for (int i = 0; i < contadorNominas; i++) {
            Nomina nomina = nominas[i];
            System.out.println(nomina);
        }
    }
}





    
    