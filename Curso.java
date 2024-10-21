public class Curso {
    private String nom;
    private String nrc;

    public Curso(){

    }
    public Curso(String nom){
        this.nom = nom;
    }
    public Curso(String nom, String nrc){
        this(nom);
        this.nrc = nrc;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String detallesCurso(){
        String dC = "" + this.nom + "\t"
                + "" + this.nrc;
        return dC;
    }
}
