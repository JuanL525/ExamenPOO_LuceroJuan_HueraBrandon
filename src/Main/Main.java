package Main;
import java.util.*;
import Clases.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Matricula> matriculas = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("======Sistema matriculacion EPN-PLUS =========");
            System.out.println("1. Comprar Curso Normal");
            System.out.println("2. Comprar Curso con certificacion");
            System.out.println("3. Ver cursos matriculados");
            System.out.println("4. SALIR");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> comprarCursoNormal();
                case 2 -> comprarCursoCertificado();
                case 3 -> mostrarCursos();
                case 4 -> System.out.println("Gracias por usar el sistema");
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 4);
    }
    private static Curso seleccionarCurso() {
        System.out.println("Cursos disponibles:");
        System.out.println("1. POO - YadiraFranco ($20.00) (Mañana)");
        System.out.println("2. Interfaces - Byron Loarte ($17.00) (Tarde)");
        System.out.println("3. Analisis de datos - Juan Pablo Zaldimbide ($16.00) (Mañana)");
        System.out.println("4. Arquitectura - Sergio Granizo ($17.00) (Tarde)");
        System.out.print("Seleccione ruta (1-4): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        return switch (opcion) {
            case 1 -> new Curso("POO", "Mañana", 20);
            case 2 -> new Curso("Interfaces", "Tarde", 17.00);
            case 3 -> new Curso("Analisis de datos", "Mañana", 16.00);
            case 4 -> new Curso("Arquitectura", "Tarde", 17.00);
            default -> {
                System.out.println("Ruta no válida. Seleccionando POO por defecto.");
                yield new Curso("POO", "Mañana", 20);
            }
        };
    }

    private static Estudiante crearEstudiante () {
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        return new Estudiante(nombre, cedula, edad);
    }

    private static void comprarCursoNormal() {
        System.out.println("\n--- Comprar Curso Normal ---");
        Curso ruta = seleccionarCurso();
        Estudiante estudiante = crearEstudiante();

        Matricula matricula = new CursoNormal(ruta, estudiante);
        Main.matriculas.add(matricula);
        System.out.println("Curso comprado exitosamente.");
    }


    private static void comprarCursoCertificado() {
        System.out.println("\n--- Comprar Curso Certificado ---");
        Curso curso = seleccionarCurso();
        Estudiante estudiante = crearEstudiante();

        System.out.println("Se le entregara un certificado al finalizar el curso");
        System.out.println("Su curso costará un 25% mas");
        System.out.print("¿Cual fue su nota de curso?: ");
        double notaFinal = sc.nextDouble();

        Evaluacion evaluacion = new Evaluacion(notaFinal);
        Matricula matricula = new CursoCertificado(curso, estudiante, evaluacion);
        Main.matriculas.add(matricula);
        System.out.println("Curso comprado exitosamente.");
    }


    private static void mostrarCursos() {
        if (matriculas.isEmpty()) {
            System.out.println("No hay matriculas compradas aún.");
        } else {
            System.out.println("\n--- Matriculas Compradas ---");
            for (Matricula matricula : matriculas) {
                matricula.mostrarDetalles();
                System.out.println("--------------------------");
            }
        }
    }

}