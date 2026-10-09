
import java.util.Random;
import java.util.Scanner;

// Activitat 12 — Comptar parells i senars, aleatoris
public class ParellsISenarsAleatoris {
    public static void main(String[] args) {
        // TODO: demana quants números vol generar l'usuari (N)
        //   genera N números aleatoris (per exemple, entre 1 i 100, amb Random)
        //   compta'n quants són parells (numero % 2 == 0) amb un comptador
        //   i calcula els senars com N - parells
        //   Mostra: "Han sortit X números parells i Y senars"
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();

        System.out.println("Quants números vols generar? ");
        int numeros = teclat.nextInt();
        int i = 0;
        int parell = 0;
        while (i<numeros) {

        int numero = generador.nextInt(1,101);
        if (numero % 2 == 0) {
            parell++;
        }
       
    
        i++;
        
        }
         int senar = numeros - parell;
         System.out.println("Han sortit " + parell + " numeros parells y " + senar + " numeros senar.");

    }
}
