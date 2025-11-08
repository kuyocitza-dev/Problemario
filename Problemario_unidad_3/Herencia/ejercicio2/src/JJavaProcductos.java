import java.util.ArrayList;

public class JJavaProcductos {
    public static void main(String[] args){
        ArrayList<Producto>lista = new ArrayList<>();
        lista.add(new ProductoFresco("01", "Mexico", "2025"));
        lista.add(new ProductoFresco("02", "Mexico", "2025"));
        lista.add(new ProductoRefrigerado("03", "USA", "090765"));
        lista.add(new ProductoRefrigerado("04", "USA", "0009721"));
        lista.add(new ProductoRefrigerado("05", "USA", "52461"));
        lista.add(new ProductoCongeladoAgua("06", "Rusia",10, 10));
        lista.add(new ProductoCongeladoAgua("07","Rusia",8, 2));
        lista.add(new ProductoCongeladoNitrogeni("08","Groelandia",6, "Criogenia Alimentaria"));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("numero de lote: "+ lista.get(i).getNumLote() + " pais de origen: " + lista.get(i).getPaisOrigen());
        }
    }
}
