// Activitat 16 — Positiu o negatiu, fins al 0

import java.util.Scanner;

public class PositiuNegatiuFinsZero {
    public static void main(String[] args) {
        // TODO: llegeix una seqüència de números per teclat (amb un bucle) fins
        //   que l'usuari entri un 0. Per cada número (que no sigui 0), mostra
        //   "És positiu" o "És negatiu". Quan s'entri el 0, mostra "Adeu!" i acaba.
          Scanner teclat = new Scanner(System.in);
          int num = 1;

        while (num<0 || num>0) {  
            
        System.out.println("Introdueix un número: ");
        num = teclat.nextInt();

         if (num > 0) {
            System.out.println("Es positiu");
         }
        else if (num < 0) {
            System.out.println("Es negatiu");
         }
         else  {
            System.out.println("Adeu!");
         }
         
        }
    }
}
