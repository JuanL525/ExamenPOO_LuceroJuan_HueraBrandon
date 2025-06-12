package Clases;

public class Estudiante {
    private String nombre;
    private String cedula;
    private int edad;

    public Estudiante(String nombre, String cedula, int edad){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getCedula(){return this.cedula;}
    public void setCedula(String cedula){this.cedula = cedula;}

    public int getEdad(){return this.edad;}
    public void setEdad(int edad){this.edad = edad;}

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n Cédula: " + cedula + "\n Edad: " + edad;
    }

}
