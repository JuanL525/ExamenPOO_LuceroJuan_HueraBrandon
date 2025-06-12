package Clases;

public class Curso {
    private String nombre;
    private String horario;
    private double precioBase;

    public Curso (String nombre, String horario, double precioBase) {
        this.nombre= nombre;
        this.horario = horario;
        this.precioBase = precioBase;
    }
    public String getNombre(){return nombre;}
    public void setNombre(String nombre) {this.nombre= nombre;}

    public String getHorario(){return horario;}
    public void setHorario(String horario) {this.horario = horario;}

    public double getPrecioBase(){return precioBase;}
    public void setPrecioBase(double precioBase) {this.precioBase = precioBase;}



    @Override
    public String toString(){
        return nombre + "-" + horario + " ($" + precioBase + ")";
    }
}