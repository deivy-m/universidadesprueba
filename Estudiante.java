public class Estudiante {
    private String nombre;
    private int id;
    private double prom;

    public Estudiante(){

    }
    public Estudiante(String nombre){

        this.nombre = nombre;
    }
    public Estudiante(String nombre, int id){
        this(nombre);
        this.id = id;
    }
    public Estudiante(String nombre, int id, double prom){
        this(nombre,id);
        this.prom = prom;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getProm() {

        return prom;
    }

    public void setProm(double prom) {

        this.prom = prom;
    }

    public String detallesEtudiante(){
        String dE = "" + this.nombre + "\t"
                + "" + this.id + "\t"
                + "" + this.prom;
        return dE;
    }
}
