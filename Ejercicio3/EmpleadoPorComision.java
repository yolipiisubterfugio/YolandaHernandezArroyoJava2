class EmpleadoPorComision extends Empleado {
    float porcentajeComision;

    public EmpleadoPorComision(String nombre, String apellidos, float porcentajeComision) {
        super(nombre, apellidos);
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String tipo() {
        return "Empleado A Comisión";
    }

    public float salarioTotal(float ventasTotales) {
        return porcentajeComision * ventasTotales;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-18s %10s %12s %10.2f", nombreCompleto(), tipo(), "-", "-", porcentajeComision);
    }
}
