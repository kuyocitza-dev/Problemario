import java.util.Scanner;

public class Cuadrado extends Figura {

    private float lado;

    public Cuadrado() {
        super("Cuadrado");
    }

    public Cuadrado(float lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public void pide_Datos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el lado del cuadrado: ");
        lado = sc.nextFloat();
    }

    @Override
    public void imprime_Area() {
        float area = lado * lado;
        System.out.println(toString() + " - Área: " + area);
    }

    @Override
    public String toString() {
        return super.toString() + ", lado = " + lado;
    }
}
