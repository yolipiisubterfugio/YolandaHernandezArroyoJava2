class EmpleadoAsalariado extends Empleado {
    private float salarioMensual;

    public EmpleadoAsalariado(String nombre, String apellidos, float salarioMensual) {
        super(nombre, apellidos);
        this.salarioMensual = salarioMensual;
    }

    public String tipo() {
        return "Asalariado";
    }

    public Object getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
}
