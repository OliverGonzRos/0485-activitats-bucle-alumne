
import java.util.Scanner;

// Activitat 37 — Taula de divisors i dividends (bucles encaixats)
public class TaulaDivisors {

    public static void main(String[] args) {
        // TODO: llegeix l'inici i el final dels dividends per teclat
        //   mostra una capçalera amb els dividends (de l'inici al final)
        //   amb dos bucles for encaixats (divisors de l'1 al 10, i dividends de
        //   l'inici al final), mostra una taula: "*" si el dividend és divisible
        //   pel divisor, "-" si no ho és
        //   (pots fer servir System.out.printf amb "%4d" / "%4s" per alinear les
        //   columnes)
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra l'inici dels dividends: ");
        int iniciDividends = teclat.nextInt();
        System.out.print("Entra el final dels dividends: ");
        int finalDividends = teclat.nextInt();

        System.out.printf("%4s", "");
        for (int i = iniciDividends; i <= finalDividends; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int divisor = 1; divisor <= 10; divisor++) {
            System.out.printf("%4d", divisor);
            for (int dividend = iniciDividends; dividend <= finalDividends; dividend++) {
                if (dividend % divisor == 0) {
                    System.out.printf("%4s", "*");
                } else {
                    System.out.printf("%4s", "-");
                }
            }
            System.out.println();
        }
    }
}
