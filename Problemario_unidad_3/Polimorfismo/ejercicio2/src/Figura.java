public abstract class Figura {
    protected String nombreFigura;

    public Figura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public abstract void pide_Datos();
    public abstract void imprime_Area();

    @Override
    public String toString() {
        return "Figura: " + nombreFigura;
    }
}

