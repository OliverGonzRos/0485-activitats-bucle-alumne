// Activitat 35 — Diagonal amb E (bucles encaixats)

public class DiagonalAmbE {

    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats (files i columnes, de l'1 al 9),
        //   mostra una graella 9x9 amb "*" a totes les posicions, excepte a la
        //   diagonal (quan fila == columna), on hi ha d'anar una "E"
        int E = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j > 1) {
                    System.out.print(" ");
                }
                if (j == E) {
                    System.out.print("E");
                } else {
                    System.out.print("*");
                }
            }
            E++;
            System.out.println();
        }
    }
}
