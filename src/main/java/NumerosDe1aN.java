
import java.util.Scanner;

// Activitat 06 — Números d'1 fins a N
public class NumerosDe1aN {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números d'1 fins a N (un per línia)
        Scanner teclat = new Scanner(System.in);

        System.out.println("Escriu un numero enter: ");
        int numero = teclat.nextInt();
        int i = 1;
        while (i<=numero) {
            System.out.println(i);
            i++;
        }
    }
}
