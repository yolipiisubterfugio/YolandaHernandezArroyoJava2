class Empleado {
    private String nombre;
    private String apellidos;
    private float tarifaPorHora;
    private float tarifaHoraExtra;

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String tipo() {
        return "Normal";
    }

    public float getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public float getTarifaHoraExtra() {
        return tarifaHoraExtra;
    }

    public void setTarifaHoraExtra(float tarifaHoraExtra) {
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    public String getApellidos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getApellidos'");
    }

    public Object getSalarioMensual() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalarioMensual'");
    }

    public Object getPorcentajeComision() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPorcentajeComision'");
    }

    // Otros métodos y getters y setters necesarios
}