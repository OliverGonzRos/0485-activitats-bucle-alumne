
import java.util.Random;
import java.util.Scanner;

// Activitat 11 — Cara o creu, 100 llançaments
public class CaraCreu {
    public static void main(String[] args) {
        // TODO: simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb una variable que
        //   s'incrementi ella mateixa d'un en un (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();
        int i = 0;
        int cara = 0;
        while (i<100) {
            int numero = generador.nextInt(0,2);
            if (numero == 0) {
                cara++;
            }
            i++;
        }
        int creu = 100 - cara;
        System.out.println("Cares: " + cara);
        System.out.println("Creus: " + creu);

    }
}
