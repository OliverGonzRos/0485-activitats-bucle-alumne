
import java.util.Scanner;

// Activitat 26 — Mitjana, nota més gran i nota més petita
public class NotesMitjanaMaxMin {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) llegeix la primera nota i inicialitza amb ella suma, notaMajor i notaMenor
        //   3) amb un bucle, per a la resta d'alumnes: llegeix la nota, acumula-la a
        //      suma, i actualitza notaMajor/notaMenor si cal (comparant-la)
        //   4) calcula la mitjana (suma / N)
        //   5) mostra la mitjana, la nota més gran i la nota més petita
        Scanner teclat = new Scanner(System.in);
        System.out.println("Quants alumnes hi ha al grup?");
        int alumnes = teclat.nextInt();
        int i = 1;
        double suma = 0;
        double notaMenor = Integer.MAX_VALUE;
        double notaMajor = Integer.MIN_VALUE;
        while (i<=alumnes) {
            System.out.println("Entra la nota de l'alumne " +i);
            double nota = teclat.nextDouble();
            suma = nota + suma;
            if (notaMajor<nota) {
                notaMajor = nota;
            }
            if (notaMenor>nota) {
                notaMenor = nota;
            }
            i++;
        }
        double mitjana = suma / alumnes;
        System.out.println("La mitjana de les notes és: " +mitjana);
        System.out.println("La nota més gran és: " +notaMajor);
        System.out.println("La nota més petita és: " +notaMenor);
    }
}
