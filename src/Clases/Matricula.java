package Clases;

public class Matricula {
    protected Curso curso;
    protected Docente docente;
    protected Estudiante estudiante;

    public Matricula(Curso curso, Estudiante estudiante){
        this.curso = curso;
        this.estudiante = estudiante;
    }

    public double calcularPrecioFinal(){
        return curso.getPrecioBase();
    }

    public void mostrarDetalles(){
        System.out.println("====MATRICULA=====");
        System.out.println(estudiante);
        System.out.println("Curso asignado: "+curso);
        System.out.println("Costo: $"+ calcularPrecioFinal());
    }

}