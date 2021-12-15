
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
    }
    
    // Getter para el autor del libro
    public String getAutor(){
        return autor;
    }
    
    // Getter para el título del libro
    public String getTitulo(){
        return titulo;
    }
    
    // Getter para el número de páginas
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    //  Imprime el autor del libro
    public void imprimeAutor(){
        System.out.println(autor);
    }
    
    //  Imprime el título del libro
    public void imprimeTitulo(){
        System.out.println(titulo);
    }
}
