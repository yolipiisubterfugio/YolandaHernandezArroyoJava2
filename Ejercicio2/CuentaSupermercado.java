import java.util.ArrayList;
import java.util.List;

public class CuentaSupermercado {
    private List<Producto> productos;

    public CuentaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getNombre().equals(producto.getNombre())) {
                p.setCantidad(p.getCantidad() + producto.getCantidad());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            productos.add(producto);
        }
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Producto p : productos) {
            precioTotal += p.getPrecioUnitario() * p.getCantidad();
        }
        return precioTotal;
    }

    public void mostrarTicket() {
        System.out.println("TICKET");
        System.out.println("Producto\tUn.\tPU\tTotal");
        System.out.println("------------------------------------------");
        for (Producto p : productos) {
            System.out.printf("%-10s\t%d\t%.2f\t%.2f\n", p.getNombre(), p.getCantidad(), p.getPrecioUnitario(), p.getPrecioUnitario() * p.getCantidad());
        }
        System.out.println("------------------------------------------");
        System.out.printf("Total: %.2f\n", calcularPrecioTotal());
    }
}

