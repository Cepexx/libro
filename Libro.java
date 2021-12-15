
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
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
    }
    
    // Getter para el autor del libro
    public String getAutor(){
        return autor;
    }
    
    // Getter para el t�tulo del libro
    public String getTitulo(){
        return titulo;
    }
    
    // Getter para el n�mero de p�ginas
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    // Getter para el n�mero de referencia del libro
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    // Getter para el n�mero de prestaciones del libro
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    // Setter para el n�mero de referencia del libro
    
    public void setNumeroReferencia(String numeroReferenciaLibro){
        if(numeroReferenciaLibro.length() >= 3){
            numeroReferencia = numeroReferenciaLibro;
        }else{
            System.out.println("ERROR, n�mero de referencia demasiado corto");
        }
        
    }
    
    // A�ade 1 al contador de prestaciones
    public void libroPrestado(){
        vecesPrestado++;
    }
    
    //  Imprime el autor del libro
    public void imprimeAutor(){
        System.out.println(autor);
    }
    
    //  Imprime el t�tulo del libro
    public void imprimeTitulo(){
        System.out.println(titulo);
    }
    
    // Imprime los detalles por pantalla
    public void imprimeDetalles(){
        String detalles;
        String numeroReferenciaDetalles = numeroReferencia;
        if(numeroReferenciaDetalles == ""){
            numeroReferenciaDetalles = "ZZZ";
        }
        detalles = "Autor: " + autor + " T�tulo: " + titulo + " N�mero de p�ginas: " + numeroPaginas + " N�mero de referencia: " + numeroReferenciaDetalles + " Ha sido prestado " + vecesPrestado + " veces";
        System.out.println(detalles);
    }
    
    // Devuelve un String con los detalles
    public String getDetalles(){
        String detalles;
        String numeroReferenciaDetalles = numeroReferencia;
        if(numeroReferenciaDetalles == ""){
            numeroReferencia = "ZZZ";
        }
        detalles = "Autor: " + autor + " T�tulo: " + titulo + " N�mero de p�ginas: " + numeroPaginas + " N�mero de referencia: " + numeroReferenciaDetalles + " Ha sido prestado " + vecesPrestado + " veces";
        return detalles;
    }
}
