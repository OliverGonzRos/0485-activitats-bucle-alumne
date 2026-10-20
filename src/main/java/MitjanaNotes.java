
import java.util.Scanner;

// Activitat 22 — Mitjana de notes
public class MitjanaNotes {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) amb un bucle, demana la nota de cada alumne i vés acumulant la suma
        //      en una variable (suma = suma + nota)
        //   3) calcula la mitjana dividint la suma entre N
        //   4) mostra: "La mitjana de les notes és: <mitjana>"
        Scanner teclat = new Scanner(System.in);
        System.out.println("Quants alumnes hi ha al grup?");
        int alumnes = teclat.nextInt();
        int i=1;
        double suma = 0;

        while (i<=alumnes) {
            System.out.println("Entra la nota de l'alumne " +i+ ":");
            double nota = teclat.nextDouble();
            suma = suma + nota;
            if (i==alumnes) {
                double mitjana = suma / alumnes;
                System.out.println("La mitjana de les notes és: " +mitjana);
            }
            i++;
        }
    }
}
