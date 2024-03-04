class EmpleadoPorHora extends Empleado {
    public EmpleadoPorHora(String nombre, String apellidos, float tarifaPorHora, float tarifaHoraExtra) {
        super(nombre, apellidos);
        setTarifaPorHora(tarifaPorHora);
        setTarifaHoraExtra(tarifaHoraExtra);
    }

    public String tipo() {
        return "Por Horas";
    }
}