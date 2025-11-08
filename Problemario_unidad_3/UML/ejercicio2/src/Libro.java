public class Libro extends Publicacion{
    private String isbn, autor;

    public Libro(){}

    public void ponerISBN(String nota){}
    public void ponerAutor(String nombre){}

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
