// Activitat 28 — Endevina el número, 10 intents

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 100 (Random)
        //   amb un bucle while, la condició del qual combini "intents < 10" I
        //   "encara no s'ha encertat":
        //     demana un número, i digues si el número generat és més gran o més
        //     petit que el que ha entrat l'usuari, o si l'ha encertat
        //   Si s'esgoten els 10 intents sense encertar, informa'n l'usuari
        //   (mostrant, per exemple, quin era el número)
          Random generador = new Random();
          Scanner teclat = new Scanner(System.in);
          int numero = generador.nextInt(1,101);
          int intents = 1;
          boolean encertat = false;

          System.out.println("Endevina un número que he generat comprès entre 1 i 100");
          while (intents<=10 && !encertat) {
            System.out.println("Entra un número (intent " +intents+ "): ");
            int numero2 = teclat.nextInt();
            if (numero>numero2) {
                System.out.println("El número que he generat és més gran que el que has pensat");
            } 
            else if (numero<numero2)  {
                System.out.println("El número que he generat és més petit que el que has pensat");
            } else {
                System.out.println("L'has encertat!!");
                encertat = true;
            }
            intents++;
          }
          if (!encertat) {
    System.out.println("S'han esgotat els intents! El número era " + numero);
}
    }
}
