public class ProductoFresco extends Producto{
    private String anioEnvasado;

    public ProductoFresco(String numLote, String paisOrigen, String anioEnvasado){
        super(numLote, paisOrigen);
        this.anioEnvasado = anioEnvasado;
    }

    public String getAnioEnvasado(){
        return anioEnvasado;
    }
    public void setAnioEnvasado(String anioEnvasado){
        this.anioEnvasado = anioEnvasado;
    }


}
