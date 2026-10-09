// Activitat 19 — Taula de multiplicar amb comptador d'errors, amb for

import java.util.Scanner;

public class TaulaMultiplicarErrorsFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 13, però implementat fent servir un bucle for.
        //   Llegeix un número per teclat i, amb un for (de l'1 al 10), pregunta la
        //   seva taula de multiplicar: mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta i digues "correcte!" o "incorrecte!"
        //   (comptant els errors). Al final: "Has comès X errors!"
        Scanner teclat = new Scanner(System.in);
    System.out.println("Escriu un numero enter del 1 al 10: ");
    int numero1 = teclat.nextInt();

    int errors = 0;
        for (int i=1; i<11; i++) {
    
             System.out.print(numero1 + " x " + i + " = " );
            int numero2 = teclat.nextInt();

          
           if (numero2 == (numero1 * i)) {
            System.out.println("Correcte!");
        
           }
           else {System.out.println("Incorrecte.");
            
            errors++;
           }
           
    
    }
    System.out.println("Has comès " + errors + " errors.");
    }
}
