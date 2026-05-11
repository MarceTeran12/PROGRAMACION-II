
package sistemabiblioteca;

import java.util.ArrayList;

class Biblioteca {

    private String nombre;

    // AGREGACIÓN
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;

    // ASOCIACIÓN
    private ArrayList<Prestamo> prestamos;

    // COMPOSICIÓN
    private Horario horario;

    public Biblioteca(String nombre) {

        this.nombre = nombre;

        libros = new ArrayList<>();
        autores = new ArrayList<>();
        prestamos = new ArrayList<>();

        // COMPOSICIÓN
        horario = new Horario(
                "Lunes a Viernes",
                "08:00",
                "20:00"
        );
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void prestarLibro(
            Estudiante estudiante,
            Libro libro
    ) {

        Prestamo p =
                new Prestamo(
                        "01/04/2026",
                        "10/04/2026",
                        estudiante,
                        libro
                );

        prestamos.add(p);
    }

    public void mostrarEstado() {

        System.out.println(
                "\n===== BIBLIOTECA " + nombre + " ====="
        );

        System.out.println("\nHORARIO:");
        horario.mostrarHorario();

        System.out.println("\nLIBROS:");
        for (Libro l : libros) {
            System.out.println(l);
        }

        System.out.println("\nAUTORES:");
        for (Autor a : autores) {
            System.out.println(a);
        }

        System.out.println("\nPRESTAMOS:");
        for (Prestamo p : prestamos) {
            p.mostrarInfo();
        }
    }

    public void cerrarBiblioteca() {

        System.out.println(
                "\nCerrando biblioteca..."
        );

        prestamos.clear();

        System.out.println(
                "Los prestamos dejaron de existir."
        );
    }
}