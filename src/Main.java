//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        //System.out.println("pelicula matrix");
        //Declaracion de variables

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "matrix";
        String sinopsis = """
                 Lamejor pelicula del fin de milenio
                """;

        System.out.println("pelicula " + nombre);

        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double madiaEvaluacion = (4.5 + 4.8 + 3)/ 3;

        System.out.println("media de evaluacion de matriz " + madiaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("pelicula popular del momento");

        } else {
            System.out.println("pelicula retro");

        }
    }
}