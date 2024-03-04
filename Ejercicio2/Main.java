import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Compras en Supermercado");
            System.out.print("Introduce el número total de productos: ");
            int totalProductos = scanner.nextInt();
            scanner.nextLine(); 

            CuentaSupermercado cuenta = new CuentaSupermercado();

            for (int i = 0; i < totalProductos; i++) {
                System.out.print("Nombre del producto: ");
                String nombre = scanner.nextLine();
                System.out.print("Precio unitario: ");
                double precio = scanner.nextDouble();
                System.out.print("Cantidad: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); 

                Producto producto = new Producto(nombre, precio, cantidad);
                cuenta.añadirProducto(producto);

                System.out.print("¿Desea introducir otro producto? (S/N): ");
                String respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("S")) {
                    break;
                }
            }

            cuenta.mostrarTicket();
        }
    }
}