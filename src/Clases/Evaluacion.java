package Clases;

public class Evaluacion {

    private double notaFinal;

    public Evaluacion (double notaFinal){
        this.notaFinal = notaFinal;
    }
    @Override
    public String toString(){
        return  "Nota final: " + notaFinal + ".";
    }
}