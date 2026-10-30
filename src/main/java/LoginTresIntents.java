
import java.util.Scanner;

// Activitat 27 — Login amb 3 intents (condició d'acabament complexa)
public class LoginTresIntents {
    public static void main(String[] args) {
        // TODO: guarda l'usuari i la contrasenya correctes en dues variables
        //   (per exemple "cponts" / "qw34T1234")
        //   amb un bucle while, la condició del qual combini "intents < 3" I
        //   "encara no s'ha encertat" (condició d'acabament complexa):
        //     demana usuari i contrasenya, comprova si són correctes
        //     mostra "Usuari i contrasenya correctes!" o un missatge d'error
        //     incrementa el comptador d'intents
        //   ⛔ NO facis servir break (ni similar), ni alteris el comptador
        //      d'intents per forçar la sortida del bucle
        //   Si s'acaben els 3 intents sense encertar, mostra "Usuari bloquejat!"
          Scanner teclat = new Scanner(System.in);

        String usuari = "cponts";
        String password = "123";

        int intents = 0;
        boolean correcte = false;

        while (intents < 3 && !correcte) {
            System.out.println("Entra usuari: ");
            String usuariEntrat = teclat.next();
            System.out.println("Entra password");
            String passwordEntrat = teclat.next();

            if (usuariEntrat.equals(usuari) && passwordEntrat.equals(password)) {
                System.out.println("Usuari i contrasenya correctes!");
                correcte = true;
            } else {
                System.out.println("Usuari o contrasenya incorrectes");
            }
            intents++;
        }

        if (!correcte) {
            System.out.println("Usuari bloquejat!");
        }
    }
}
