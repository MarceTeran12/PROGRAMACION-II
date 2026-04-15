package basejuego;

import java.util.Scanner;

public class JuegoAdivinaNumero extends BaseJuego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);

        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11);

        System.out.println("Adivina un número entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Intenta otra vez.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡¡Acertaste!!");
                actualizaRecord();
                break;
            } else {
                boolean quedanVidas = quitaVida();

                if (!quedanVidas) break;

                if (intento < numeroAAdivinar) {
                    System.out.println("El número es MAYOR");
                } else {
                    System.out.println("El número es MENOR");
                }
            }
        }
    }
}
