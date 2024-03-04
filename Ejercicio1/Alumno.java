public class Alumno {
    private String nombre;
    private String apellidos;
    private java.util.List<Asignatura> asignaturas;

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignaturas = new java.util.ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public java.util.List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(java.util.List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void añadirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void modificarNota(String nombreAsignatura, double nuevaNota) {
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                asignatura.setNota(nuevaNota);
                break;
            }
        }
    }

    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Asignatura asignatura : asignaturas) {
            sumaNotas += asignatura.getNota();
        }
        return sumaNotas / asignaturas.size();
    }
}
