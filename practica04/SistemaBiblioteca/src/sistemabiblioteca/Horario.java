
package sistemabiblioteca;

class Horario {

    private String dias;
    private String horaApertura;
    private String horaCierre;

    public Horario(
            String dias,
            String apertura,
            String cierre
    ) {

        this.dias = dias;
        this.horaApertura = apertura;
        this.horaCierre = cierre;
    }

    public void mostrarHorario() {

        System.out.println(
                dias
                        + " | "
                        + horaApertura
                        + " - "
                        + horaCierre
        );
    }
}