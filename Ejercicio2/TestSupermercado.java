public class TestSupermercado {
    public static void main(String[] args) {
        CuentaSupermercado cuenta = new CuentaSupermercado();

        
        cuenta.añadirProducto(new Producto("Manzanas", 1.50, 3));
        cuenta.añadirProducto(new Producto("Leche", 0.80, 2));
        cuenta.añadirProducto(new Producto("Pan", 1.20, 1));
        cuenta.añadirProducto(new Producto("Manzanas", 1.50, 2)); // Se deberían sumar las unidades de manzanas

       
        cuenta.mostrarTicket();
    }
}

