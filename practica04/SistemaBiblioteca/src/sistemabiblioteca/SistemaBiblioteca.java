
package sistemabiblioteca;

public class SistemaBiblioteca {

    public static void main(String[] args) {

        Biblioteca b =
                new Biblioteca("UMSA");

        Autor a1 =
                new Autor(
                        "Mario Vargas Llosa",
                        "Peruano"
                );

        b.agregarAutor(a1);

        String[] paginas = {
                "Introduccion",
                "Capitulo 1",
                "Capitulo 2"
        };

        Libro l1 =
                new Libro(
                        "Programacion II",
                        "INF121",
                        paginas
                );

        b.agregarLibro(l1);

        Estudiante e1 =
                new Estudiante("Marcelo");

        b.prestarLibro(e1, l1);

        b.mostrarEstado();

        l1.leer();

        b.cerrarBiblioteca();
    }
}
