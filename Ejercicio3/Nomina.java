class Nomina {
    Empleado empleado;
    float salario;

    public Nomina(Empleado empleado, float salario) {
        this.empleado = empleado;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Nomina del Mes %tB / %tY\nEmpleado.........: %s\nTipo.............: %s\nTotal a percibir.: %.2f\n", 
                             empleado, empleado, empleado.tipo(), salario);
    }
}

