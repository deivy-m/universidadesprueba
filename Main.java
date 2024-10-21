public class Main {
    public static void main(String[] args) {
        Estudiante es1 = new Estudiante("Deivy",2356,8.5);

        Curso c1 = new Curso("Matematicas", "N34A");

        Universidad u1 = new Universidad("park");

        System.out.println("" + es1.detallesEtudiante() + "\t" + c1.detallesCurso() + "\t" + u1.detalleUni());

    }

}