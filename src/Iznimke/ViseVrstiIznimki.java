package Iznimke;

import java.util.Random;

public class ViseVrstiIznimki {
    public static void main(String[] args) {
        int broj = 0;
        String unos = "234d";
        int[] polje = {1,2,3};

        try {
            // 1. greska
            //broj = new Integer(unos);
            broj = new Integer("234");
            // 2. greska
            //broj = polje[5];
            broj = polje[new Random().nextInt(0,polje.length)];
            // 3. greska
            //broj = broj / 0;
            broj = broj / new Random().nextInt(1,101);
        }
        catch (NumberFormatException e) {
            System.out.println("Greška pri konverziji znakovnog niza u broj");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Greška pri pristupu elementu iz polja");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Sve ostale greške.");

        }
        System.out.println("Završetak programa.");
    }
}
