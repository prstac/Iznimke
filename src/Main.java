import Iznimke.Razlomak;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Razlomak prvi, drugi;
        prvi = unosRazlomka("prvi");
        drugi = unosRazlomka("drugi");

        System.out.println("Zbroj je : " + prvi.plus(drugi));
        System.out.println("Razlika je : " + prvi.minus(drugi));
        System.out.println("Umnozak je : " + prvi.puta(drugi));
        System.out.println("Kvocijent je : " + prvi.dijeljeno(drugi));
    }

    public static Razlomak unosRazlomka(String message) {
        Razlomak razlomak;
        do {
            System.out.println("Unesite " + message + " razlomak (brojnik nazivnik)");
            try {
                Scanner scanner = new Scanner(System.in);
                String linija = scanner.nextLine().replaceAll("  "," ").trim();
                String[] linijaArray = linija.split(" ");

                var brojnik = Integer.parseInt(linijaArray[0]);
                var nazivnik = Integer.parseInt(linijaArray[1]);

                return new Razlomak(brojnik, nazivnik);
            } catch (NumberFormatException e) {
                System.out.println("Niste unijeli ispravan broj");
            }
        } while (true);
    }
}