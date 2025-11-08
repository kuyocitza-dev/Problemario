public class Producto {
    private String numLote, paisOrigen;

    public Producto(String numLote,String paisOrigen ){
        this.numLote = numLote;
        this.paisOrigen = paisOrigen;
    }

    public String getNumLote(){
        return numLote;
    }
    public  String getPaisOrigen(){
        return paisOrigen;
    }

    public void setNumLote(String numLote){
        this.numLote = numLote;
    }
    public void setPaisOrigen(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "numLote='" + numLote + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
