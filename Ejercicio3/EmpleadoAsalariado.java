class EmpleadoAsalariado extends Empleado {
    float salarioMensual;

    public EmpleadoAsalariado(String nombre, String apellidos, float salarioMensual) {
        super(nombre, apellidos);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String tipo() {
        return "Empleado Asalariado";
    }

    public float salarioTotal() {
        return salarioMensual;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-18s %10s %12s %10.2f", nombreCompleto(), tipo(), "-", "-", salarioMensual);
    }
}
