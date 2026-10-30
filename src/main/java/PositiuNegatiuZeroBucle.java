
import java.util.Scanner;

// Activitat 03 — Positiu, negatiu o zero (en bucle)
public class PositiuNegatiuZeroBucle {
    public static void main(String[] args) {
        // TODO: llegeix 8 números per teclat (amb un bucle) i, per cadascun, mostra:
        //   "Entra el número <i>: " (amb print, sense salt de línia)
        //   i a la línia següent: "és positiu" / "és negatiu" / "és un zero"
        Scanner teclat = new Scanner(System.in);

        int i = 0;
        while (i<8) {  
            
        System.out.print("Entra el número " + (i + 1) + ": ");
        int num = teclat.nextInt();

         if (num > 0) {
            System.out.println("És positiu");
         }
         else if (num < 0) {
            System.out.println("És negatiu");
         }
         else if (num == 0) {
            System.out.println("És zero");
         }
         i++;
        }


    }
}
