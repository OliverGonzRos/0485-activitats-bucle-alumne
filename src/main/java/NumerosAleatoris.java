// Activitat 02 — Números aleatoris

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatoris {
    public static void main(String[] args) {
        // TODO: genera 50 números aleatoris entre 1 i 15 (tots dos inclosos, amb Random)
        //   i mostra'ls per pantalla, un per línia (amb un bucle)
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();

         int i = 0;
         while (i<50) {
        int numero = generador.nextInt(1,16);
        System.out.println("El numero generat és: " + numero);
        i++;
         }
    }
}
