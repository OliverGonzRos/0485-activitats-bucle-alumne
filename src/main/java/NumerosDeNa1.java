// Activitat 10 — Números de N fins a 1

import java.util.Scanner;

public class NumerosDeNa1 {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números des de N fins a 1 (un per línia)

         Scanner teclat = new Scanner(System.in);

        System.out.println("Escriu un numero enter: ");
        int numero = teclat.nextInt();
        int i = 0;
        while (i<=numero) {
            System.out.println(numero - i);
            i++;
        }
    }
}
