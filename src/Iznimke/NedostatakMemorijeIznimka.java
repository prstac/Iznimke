package Iznimke;

import java.util.ArrayList;

public class NedostatakMemorijeIznimka {
    public static void main(String[] args) {
        try {
            ArrayList<String> znakovniNiz = new ArrayList<>();
            while (true) {
                znakovniNiz.add("Znakovni niz");
            }
        }
        catch (OutOfMemoryError e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }
}
