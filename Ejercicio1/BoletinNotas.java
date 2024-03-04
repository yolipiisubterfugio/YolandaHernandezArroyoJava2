public class BoletinNotas {
    public BoletinNotas(java.util.List<Alumno> alumnos) {
    }

    public void mostrarBoletin(Alumno alumno) {
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellidos());
        System.out.println("Asignatura\tNota");
        System.out.println("--------------------");
        for (Asignatura asignatura : alumno.getAsignaturas()) {
            System.out.println(asignatura.getNombre() + "\t\t" + asignatura.getNota());
        }
        System.out.println("--------------------");
        System.out.println("Nota Media: " + alumno.calcularPromedio());
    }

    // Otros métodos para interactuar con los alumnos y asignaturas
}

