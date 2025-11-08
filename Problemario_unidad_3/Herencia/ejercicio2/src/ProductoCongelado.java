public class ProductoCongelado extends Producto{
    private int tempMant; //temperatura mantenimiento recomendada

    public ProductoCongelado(String numLote, String paisOrigen, int tempMant){
        super(numLote, paisOrigen);
        this.tempMant = tempMant;
    }
    public int getTempMant(){
        return tempMant;
    }
    public void setTempMant(int tempMant){
        this.tempMant = tempMant;
    }

}
