// Activitat 13 — Taula de multiplicar, amb comptador d'errors

import java.util.Scanner;

public class TaulaMultiplicarErrors {
    public static void main(String[] args) {
        // TODO: llegeix un número per teclat i, amb un bucle, pregunta la seva taula
        //   de multiplicar (de l'1 al 10): mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta de l'usuari i digues si és "correcte!"
        //   o "incorrecte!" (comptant els errors amb un comptador que s'incrementi
        //   ell mateix d'un en un)
        //   Al final, mostra: "Has comès X errors!"
    Scanner teclat = new Scanner(System.in);
    System.out.println("Escriu un numero enter del 1 al 10: ");
    int numero1 = teclat.nextInt();

    int i = 1;
    int errors = 0;
        while (i<=10) {
    
             System.out.print(numero1 + " x " + i + " = " );
            int numero2 = teclat.nextInt();

          
           if (numero2 == (numero1 * i)) {
            System.out.println("Correcte!");
        
           }
           else {System.out.println("Incorrecte.");
            
            errors++;
           }
           
           i++;
    }
    System.out.println("Has comès " + errors + " errors.");
}

}