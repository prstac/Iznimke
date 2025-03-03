package Iznimke;

public class PogresanUnosIznimka {
    public static void main(String[] args) {
        int broj;
        String unos = "234d";

        try {
            broj = new Integer(unos);
        }
        catch (NumberFormatException e) {
            System.out.println("Unijeli ste pogresan unos.");
            System.out.println("Postavljamo unosu vrijednost 1.");
            broj = 1;
        }

        //nastavljamo dalje s izvrsavanjem programa
    }

}
