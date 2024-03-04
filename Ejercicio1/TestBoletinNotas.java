import java.util.ArrayList;
import java.util.List;

public class TestBoletinNotas {
    public static void main(String[] args) {
        // Crear algunos alumnos
        Alumno alumno1 = new Alumno("Juan", "Pérez");
        Alumno alumno2 = new Alumno("María", "García");

        // Añadir asignaturas con notas a los alumnos
        alumno1.añadirAsignatura(new Asignatura("Matemáticas", 8.5));
        alumno1.añadirAsignatura(new Asignatura("Lengua", 9.0));
        alumno1.añadirAsignatura(new Asignatura("Historia", 7.5));

        alumno2.añadirAsignatura(new Asignatura("Matemáticas", 7.0));
        alumno2.añadirAsignatura(new Asignatura("Lengua", 8.0));
        alumno2.añadirAsignatura(new Asignatura("Historia", 6.5));

        // Crear una lista de alumnos
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);

        // Mostrar los boletines de notas de los alumnos antes de modificar alguna nota
        System.out.println("Boletín de notas antes de modificar alguna nota:");
        BoletinNotas boletinNotas = new BoletinNotas(listaAlumnos);
        boletinNotas.mostrarBoletin(alumno1);
        boletinNotas.mostrarBoletin(alumno2);

        // Modificar algunas notas
        alumno1.modificarNota("Matemáticas", 9.0);
        alumno2.modificarNota("Historia", 7.0);

        // Mostrar los boletines de notas de los alumnos después de modificar las notas
        System.out.println("\nBoletín de notas después de modificar algunas notas:");
        boletinNotas.mostrarBoletin(alumno1);
        boletinNotas.mostrarBoletin(alumno2);
    }
}

