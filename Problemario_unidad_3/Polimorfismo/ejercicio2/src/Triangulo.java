import java.util.Scanner;

public class Triangulo extends Figura {

    private float base;
    private float altura;

    public Triangulo() {
        super("Triángulo");
    }

    public Triangulo(float base, float altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void pide_Datos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        base = sc.nextFloat();
        System.out.print("Ingresa la altura del triángulo: ");
        altura = sc.nextFloat();
    }

    @Override
    public void imprime_Area() {
        float area = (base * altura) / 2;
        System.out.println(toString() + " - Área: " + area);
    }

    @Override
    public String toString() {
        return super.toString() + ", base = " + base + ", altura = " + altura;
    }
}

