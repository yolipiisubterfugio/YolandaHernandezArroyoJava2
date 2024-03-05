class Empleado {
    String nombre;
    String apellidos;

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String nombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String tipo() {
        return "Empleado normal";
    }

    public float salarioTotal(float ventasTotales) {
        return 0; // Método por implementar en las subclases
    }

    public float salarioTotal(float horasTrabajadas, float horasExtra) {
        return 0; // Método por implementar en las subclases
    }

    @Override
    public String toString() {
        return String.format("%-20s %-18s %10s %12s %10s", nombreCompleto(), tipo(), "-", "-", "-");
    }
}