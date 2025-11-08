import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args){
        ArrayList<Villano> lista= new ArrayList<>();
        lista.add(new Villano(13, "Emma"));
        lista.add(new Malvado(9,"Mango", true));
        lista.add(new Malvado(11,"tu", true));

        for (int i = 0; i < lista.size(); i++){
            System.out.println("Nombre:" + lista.get(i).getNombre() + " Edad: "+ lista.get(i).getEdad());
        }

    }

}
