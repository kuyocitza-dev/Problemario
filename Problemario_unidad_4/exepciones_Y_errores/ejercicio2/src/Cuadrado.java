import java.util.Scanner;

public class Cuadrado extends Figura {

    private float lado;

    public Cuadrado() {
        super("Cuadrado");
    }

    public Cuadrado(float lado) throws ExceptionFigura {
        super("Cuadrado");
        if (lado > 5) {
            throw new ExceptionFigura("El lado debe ser menor o igual a 5.");
        }
        this.lado = lado;
    }

    @Override
    public void pide_Datos() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Ingresa el lado del cuadrado (<=5): ");
                lado = sc.nextFloat();
                if (lado > 5) {
                    throw new ExceptionFigura("El lado debe ser menor o igual a 5.");
                }
                valido = true;
            } catch (ExceptionFigura e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
                sc.next();
            }
        }
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
