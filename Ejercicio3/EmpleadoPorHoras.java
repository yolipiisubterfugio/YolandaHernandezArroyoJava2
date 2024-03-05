class EmpleadoPorHora extends Empleado {
    float tarifaPorHora;
    float tarifaHoraExtra;

    public EmpleadoPorHora(String nombre, String apellidos, float tarifaPorHora, float tarifaHoraExtra) {
        super(nombre, apellidos);
        this.tarifaPorHora = tarifaPorHora;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    @Override
    public String tipo() {
        return "Empleado Por Horas";
    }

    public float salarioTotal(float horasTrabajadas, float horasExtra) {
        return (tarifaPorHora * horasTrabajadas) + (tarifaHoraExtra * horasExtra);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-18s %10.2f %12.2f %10s", nombreCompleto(), tipo(), tarifaPorHora, tarifaHoraExtra, "-");
    }
    
}