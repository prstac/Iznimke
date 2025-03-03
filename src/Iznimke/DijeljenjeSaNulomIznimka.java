package Iznimke;

public class DijeljenjeSaNulomIznimka {
    public static void main(String[] args) {
        int broj1 = 7;
        int broj2 = 0;

        try {
            int rezultat = broj1 / broj2;
            System.out.println("Rezultat iznosi "+ rezultat);
        }
        catch (Throwable e) {
            System.out.println("Dogodila se iznimka: " + e.getMessage());
        }
        finally {
            System.out.println("Kalkuliranje je gotovo");
        }
        System.out.println("Izvršavanje programa je gotovo");
    }
}
