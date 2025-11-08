public class ProductoCongeladoNitrogeni extends ProductoCongelado{
    private String infoMetCongelacion; //informacion del metodo de congelacion

    public ProductoCongeladoNitrogeni(String numLote, String paisOrigen, int tempMant, String infoMetCongelacion){
        super(numLote, paisOrigen, tempMant);
        this.infoMetCongelacion =infoMetCongelacion;
    }

    public String getInfoMetCongelacion(){
        return infoMetCongelacion;
    }
    public void setInfoMetCongelacion(String infoMetCongelacion){
        this.infoMetCongelacion = infoMetCongelacion;
    }

}
