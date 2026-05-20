public class Main{
    public static void main(String[] args) {
        double[] cien1 = {6.2, 6.4, 6.8};
        double[] hist1 = {5.5, 5.8, 6.1};
        double[] mate1 = { 6.0, 5.0, 5.1};
        double[] leng1 = {5.1, 5.7, 5.8};
        // Notas estudiante 2
        double[] mate2 = {4.5, 5.8, 5.5};
        double[] leng2 = {6.8, 6.5, 6.8};
        double[] cien2 = {5.5, 5.7, 6.0};
        double[] hist2 = {6.0, 6.2, 6.5};

        //Crear objetos
        Estudiante e1 = new Estudiante("Ana", "3 Medio", mate1, leng1, cien1, hist1);
        Estudiante e2 = new Estudiante("Luis", "3 Medio", mate2, leng2, cien2, hist2 );
        Estudiante e3 = new Estudiante("Juan", "4 Medio");
        Estudiante e4 = new Estudiante();

    }
}
