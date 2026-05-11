
package sistemabiblioteca;

import java.util.ArrayList;

class Libro {

    private String titulo;
    private String isbn;

    // COMPOSICIÓN
    private ArrayList<Pagina> paginas;

    public Libro(String titulo, String isbn, String[] contenidoPaginas) {

        this.titulo = titulo;
        this.isbn = isbn;

        paginas = new ArrayList<>();

        for (int i = 0; i < contenidoPaginas.length; i++) {

            paginas.add(
                    new Pagina(i + 1, contenidoPaginas[i])
            );
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void leer() {

        System.out.println("\nLibro: " + titulo);

        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }

    @Override
    public String toString() {
        return titulo + " - " + isbn;
    }
}