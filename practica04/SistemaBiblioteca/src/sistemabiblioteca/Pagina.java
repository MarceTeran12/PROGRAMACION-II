
package sistemabiblioteca;

class Pagina {

    private int numero;
    private String contenido;

    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

    public void mostrarPagina() {

        System.out.println("Pagina " + numero);
        System.out.println(contenido);
    }
}