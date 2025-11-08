public class VillanoDeUltratumba extends Villano implements SerDeUltratumba{
    String legion;

    public VillanoDeUltratumba(int edad, String nombre, String legion){
        super(edad, nombre);
        this.legion = "";
    }

    @Override
    public void gritar() {
        System.out.println("buuuuu!!!!!!");
    }

    @Override
    public void asustar() {
        System.out.println("uaaaaay!!!");
    }
}
