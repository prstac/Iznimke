package Iznimke;

import java.util.Scanner;

/*
Napiši Java program koji omogućuje korisniku unos broja, a zatim računa faktorijel tog broja.
Program treba obraditi iznimke koje se mogu pojaviti tijekom unosa i računanja faktorijela.
Ispiši poruku korisniku da unese broj.
Koristi Scanner za unos broja od korisnika.
Obradi iznimke koje se mogu pojaviti tijekom unosa. Ako korisnik unese nešto što nije broj, ispiši odgovarajuću poruku i zatraži ponovni unos.
Računaj faktorijel unesenog broja.
Obradi iznimke koje se mogu pojaviti tijekom računanja faktorijela. Na primjer, obradi situaciju kada korisnik unese negativan broj jer faktorijel nije definiran za negativne brojeve.
Ispiši rezultat ili poruku o greški, ovisno o tome je li računanje faktorijela uspješno ili ne.
 */



public class ZadatakFaktorijelIznimke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int broj = 0;
        do {
            try {
                System.out.println("Unesite jedan pozitivan cijeli broj za kojeg zelimo faktorijel izracunati");
                broj = Integer.parseInt(scanner.nextLine());
                System.out.printf("\nFaktorijel od %s je %s\n", broj, faktorijel(broj));
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Zadani unos nije cijeli broj");
            }
            catch (PozitivanBrojException e) {
                System.out.println("Zadani broj nije pozitivan");
            }
            catch (PrevelikBrojException e) {
                System.out.println("Nije moguce izracunati faktorijel zadanog broja, broj je prevelik, molimo unesite manji");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static int faktorijel(int broj) throws PozitivanBrojException, PrevelikBrojException{
        int f = 1;
        if (broj < 0) {
            throw new PozitivanBrojException();
        }

        if (broj >= 13) {
            throw new PrevelikBrojException();
        }

        for (int i = 1; i <= broj; i++) {
            f*=i;
        }

        return f;
    }
}
