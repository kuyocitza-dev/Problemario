public class ProductoRefrigerado extends Producto{
    private String CodOrgSup; //codig0 organismo de supervicion

    public ProductoRefrigerado(String numLote, String paisOrigen, String codOrgSup ){
        super(numLote, paisOrigen);
        this.CodOrgSup = codOrgSup;
    }

    public String getCodOrgSup(){
        return CodOrgSup;
    }
    public void setCodOrgSup(String codOrgSup){
        this.CodOrgSup = codOrgSup;
    }

}
