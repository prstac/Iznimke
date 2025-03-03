package Iznimke;

import java.util.InputMismatchException;
import java.util.Scanner;

//kreiraj program korisnik unosi 2 broja ispise zbroj
// ispisati korisnisku poruku ukoliko nije unesen broj
public class ZadatakBrojIznimka {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int prvi = unosBrojaREekurzivnoNaKriviParse();
        int drugi = unosBrojaREekurzivnoNaKriviParse();

        int zbroj = prvi + drugi;
        System.out.println("Zbroj je : " + zbroj);

        prvi = unosBrojaSWhileNaKriviInput();
        drugi = unosBrojaSWhileNaKriviInput();
        System.out.println("Zbroj je : " + prvi + drugi);
    }


    public static int unosBrojaREekurzivnoNaKriviParse() {
        int broj = 0;
        try {
            System.out.println("Unesite broj");
            broj = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Krivi unos");
            broj = unosBrojaREekurzivnoNaKriviParse();
        }
        return broj;
    }

    public static int unosBrojaSWhileNaKriviInput() {
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
