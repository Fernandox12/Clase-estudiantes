import org.w3c.dom.ls.LSOutput;

public class Estudiante {
    private String nombre;
    private String curso;
    private double[] matematicas;
    private double[] lenguaje;
    private double[] ciencias;
    private double[] historia;

    public Estudiante(){

    }
    public Estudiante(String nombre, String curso){
        this.nombre = nombre;
        this.curso= curso;
    }

    public Estudiante(String nombre, String curso, double[] matematicas, double[] lenguaje, double[] ciencias, double[] historia ){
        this.nombre = nombre;
        this.curso= curso;
        this.matematicas = matematicas;
        this.lenguaje= lenguaje;
        this.ciencias= ciencias;
        this.historia= historia;

    }
    public String getnombre(String nombre) {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre= nombre;
    }
    public String getcurso(String curso) {
        return curso;
    }
    public void setcurso(String curso) {
        this.curso= curso;
    }
    public double[] getmatematicas(double[] matematicas) {
        return matematicas;
    }
    public void setmatematicas(double[] matematicas) {
        this.matematicas= matematicas;
    }
    public double[] getlenguaje(double[] lenguaje) {
        return lenguaje;
    }
    public void setlenguaje(double[] lenguaje) {
        this.lenguaje= lenguaje;
    }
    public double[] getciencias(double[] ciencias) {
        return ciencias;
    }
    public void setciencias(double[] ciencias) {
        this.ciencias= ciencias;
    }
    public double [] gethistoria(double[] historia) {
        return historia;
    }
    public void sethistoria(double[] historia) {
        this.historia = historia;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
    }
   public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        return suma / notas.length;
   }
    public double calcularPromedioGeneral() {
        double promMate = calcularPromedio(matematicas);
        double promLeng = calcularPromedio(lenguaje);
        double promCien = calcularPromedio(ciencias);
        double promHist = calcularPromedio(historia);
        double promGeneral = (promMate + promLeng + promCien + promHist) / 4;

        return promGeneral;
    }



}


