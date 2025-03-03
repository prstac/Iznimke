package Iznimke;

import java.security.PrivateKey;
import java.util.InputMismatchException;
import java.util.Scanner;

//kreiraj program korisnik unosi 2 broja ispise zbroj
// ispisati korisnisku poruku ukoliko nije unesen broj
public class ZadatakBrojIznimka {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int prvi = unosBroja();
        int drugi = unosBroja();

        int zbroj = prvi + drugi;
        System.out.println("Zbroj je : " + zbroj);

        prvi = unosBroja2();
        drugi = unosBroja2();
        System.out.println("Zbroj je : " + prvi + drugi);
    }

    public static int unosBroja() {
        int broj = 0;
        try {
            System.out.println("Unesite broj");
            broj = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Krivi unos");
            broj = unosBroja();
        }
        return broj;
    }

    public static int unosBroja2() {
        int broj = 0;
        while (true) {
            try {
                System.out.println("Unesite broj");
                broj = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Krivi unos");
            }
        }
        return broj;
    }
}
