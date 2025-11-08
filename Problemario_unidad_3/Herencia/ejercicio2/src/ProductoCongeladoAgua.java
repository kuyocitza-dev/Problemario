public class ProductoCongeladoAgua extends ProductoCongelado{
    private int salinidad;

    public ProductoCongeladoAgua(String numLote, String paisOrigen, int tempMant, int salinidad){
        super(numLote, paisOrigen, tempMant);
        this.salinidad = salinidad;
    }

    public int getSalinidad(){
        return salinidad;
    }
    public void setSalinidad(int salinidad){
        this.salinidad = salinidad;
    }

}
