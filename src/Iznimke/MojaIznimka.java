package Iznimke;

public class MojaIznimka extends Exception {
    private String korisnik;

    // default konstruktor
    public MojaIznimka() {}

    // konstruktor s dodatnim argumentom ime korisnika koji je izazvao iznimku
    public MojaIznimka(String poruka, String korisnik) {
        super(poruka);
        setKorisnik(korisnik);
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }
}
