package Clases;

public class CursoCertificado extends CursoNormal{
    private Evaluacion evaluacion;

    public CursoCertificado(Curso curso, Estudiante estudiante, Evaluacion evaluacion) {
        super(curso, estudiante);
        this.evaluacion = evaluacion;
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() * 1.25;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(evaluacion);
    }
}

