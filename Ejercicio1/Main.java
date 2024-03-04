public class Main {
    public static void main(String[] args) {
        java.util.List<Alumno> alumnos = new java.util.ArrayList<>();

        Alumno alumno1 = new Alumno("Juan", "Pérez");
        alumno1.añadirAsignatura(new Asignatura("Matemáticas", 8.5));
        alumno1.añadirAsignatura(new Asignatura("Lengua", 9.0));
        alumnos.add(alumno1);

        BoletinNotas boletinNotas = new BoletinNotas(alumnos);
        for (Alumno alumno : alumnos) {
            boletinNotas.mostrarBoletin(alumno);
        }
    }

    @Override
    public String toString() {
        return "Main []";
    }
}