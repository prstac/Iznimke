package Iznimke;

public class NasaIznimka {
    public static void main(String[] args) {
        try {
            double rezultat = izracunajKorijen(-1);
        }
        catch (MojaIznimka e) {
            System.out.println(e.getMessage() + " izazvao korisnik: " + e.getKorisnik());
        }
    }

    public static double izracunajKorijen(double broj) throws MojaIznimka {
        if (broj < 0) {
            throw new MojaIznimka("Broj ne smije biti negativan", "user1"); // kreiramo sami iznimku koja ce se ispisati
        }
        return Math.sqrt(broj);
    }
}
