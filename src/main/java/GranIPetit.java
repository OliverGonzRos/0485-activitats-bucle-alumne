
import java.util.Scanner;

// Activitat 17 — Gran i petit, apropant-se
public class GranIPetit {
    public static void main(String[] args) {
        // TODO: llegeix dos números per teclat: gran i petit
        //   amb un bucle while, mentre gran sigui més gran que petit:
        //     mostra "Gran = <gran>   Petit = <petit>"
        //     divideix gran entre 2 i multiplica petit per 2
        Scanner teclat = new Scanner(System.in);
        int i = 0;

         System.out.println("Introdueix el número gran: ");
    double num1 = teclat.nextDouble();

        System.out.println("Introdueix el número petit: ");
    double num2 = teclat.nextDouble();

        while (i==0) {

            if (num1>num2) {
            System.out.print("Gran = " + num1);
            System.out.println("  Petit = " + num2);
            num1 = num1 /2;
            num2 = num2 *2; }
            }
        
    }
}