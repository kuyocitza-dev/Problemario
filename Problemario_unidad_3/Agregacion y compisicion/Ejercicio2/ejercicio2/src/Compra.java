public class Compra {
    private  String claveTransaccion;
    private Hora hora;
    private Fecha fecha;

    public Compra(String claveTransaccion) {
        this.claveTransaccion = claveTransaccion;
        this.hora = new Hora(12,12, 30);
        this.fecha = new Fecha(06, 11, 2025);
    }
}
