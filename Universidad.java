public class Universidad {
    static String nombre= "Udla";
    private String ubi;

    public Universidad(String ubi){
        this.ubi = ubi;

    }


    public String getUbi() {

        return ubi;
    }

    public void setUbi(String ubi) {

        this.ubi = ubi;
    }

    public String detalleUni(){
        String dU = "" + Universidad.nombre +
                "\t" + this.ubi;
        return dU;
    }
}
