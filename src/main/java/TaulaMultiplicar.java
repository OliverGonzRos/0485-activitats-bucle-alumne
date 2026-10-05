
import java.util.Scanner;

// Activitat 08 — Taula de multiplicar d'un número (per teclat)
public class TaulaMultiplicar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter per teclat i, amb un bucle,
        //   mostra la seva taula de multiplicar (de l'1 al 10)
        //   amb el format: "numero × 1 = ...", ..., "numero × 10 = ..."

    Scanner teclat = new Scanner(System.in);
    System.out.println("Escriu un numero enter: ");
    int numero1 = teclat.nextInt();

     int i = 1;
        while (i<=10) {
            int numero2 = numero1 * i;

            System.out.println(+ numero1 + " x " + i + " = " + numero2);
            i++;
        }
    
    }
}
