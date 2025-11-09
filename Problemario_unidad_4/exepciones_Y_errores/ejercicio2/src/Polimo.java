public class Polimo {

    public static void Imprime(Figura f) {
        f.imprime_Area();
    }

    public static void main(String[] args) {
        Figura figuras[] = new Figura[2];
        figuras[0] = new Cuadrado();
        figuras[1] = new Triangulo();

        for (Figura f : figuras) {
            f.pide_Datos();
        }

        System.out.println("\n--- Áreas Calculadas ---");
        for (Figura f : figuras) {
            Imprime(f);
        }
    }
}

