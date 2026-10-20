
import java.util.Scanner;

// Activitat 24 — Multiplicar amb sumes successives
public class MultiplicarAmbSumes {
    public static void main(String[] args) {
        // TODO: llegeix dos operands enters positius per teclat
        //   multiplica'ls fent servir sumes successives (suma "operand1", "operand2" vegades)
        //   i mostra, en una sola línia, "operand1 + operand1 + ... = resultat"
        //   Per exemple, amb 5 i 4: "5 + 5 + 5 + 5 = 20"
        Scanner teclat = new Scanner(System.in);
        int i = 0;
        System.out.println("Introdueix operand 1:");
        int operand1 = teclat.nextInt();
        System.out.println("Introdueix operand 2:");
        int operand2 = teclat.nextInt();

        while (i<operand2) {
            int resultat = operand1 + operand1;
            System.out.print(+operand1+ " + " );
            if (i==operand2) {
                System.out.print(operand1+ " = " +resultat);
            }
            i++;
        }
    
    }
}
