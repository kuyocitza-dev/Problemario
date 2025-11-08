public class Revista extends Publicacion{
    private int numerosPorAnio;
    private long circulacion;

    public Revista(){}

    public void fijarNumerosAnio(int n){}
    public void fiarCirculacion(long n){}

    @Override
    public String toString() {
        return "Revista{" +
                "numerosPorAnio=" + numerosPorAnio +
                ", circulacion=" + circulacion +
                '}';
    }
}
