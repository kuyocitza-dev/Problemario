import java.util.Scanner;

public class Triangulo extends Figura {

    private float base;
    private float altura;

    public Triangulo() {
        super("Triángulo");
    }

    public Triangulo(float base, float altura) throws ExceptionFigura {
        super("Triángulo");
        if (altura > base) {
            throw new ExceptionFigura("La base debe ser mayor o igual a la altura.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void pide_Datos() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Ingresa la base del triángulo: ");
                base = sc.nextFloat();
                System.out.print("Ingresa la altura del triángulo: ");
                altura = sc.nextFloat();
                if (altura > base) {
                    throw new ExceptionFigura("La base debe ser mayor o igual a la altura.");
                }
                valido = true;
            } catch (ExceptionFigura e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
                sc.next(); // limpiar buffer
            }
        }
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
