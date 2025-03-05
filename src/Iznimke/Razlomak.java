package Iznimke;

import java.text.Format;

// https://prnt.sc/Sx24Xe-nXUkb
public class Razlomak {
    private int brojnik;
    private int nazivnik;
    private int predznak = 1;
    public Razlomak(int brojnik, int nazivnik) {
        if (Math.signum(brojnik) != Math.signum(nazivnik)) {
            predznak = -1;
        } else {
            predznak = 1;
        }

        this.brojnik = Math.abs(brojnik);
        this.nazivnik = Math.abs(nazivnik);

        if (this.brojnik % this.nazivnik == 0) {
            this.brojnik /= this.nazivnik;
            this.nazivnik = 1;
        } else if (this.nazivnik % this.brojnik == 0) {
            this.nazivnik /= this.brojnik;
            this.brojnik = 1;
        }
    }

    public Razlomak puta(Razlomak drugi) {
        return new Razlomak(brojnik * drugi.brojnik * predznak, nazivnik * drugi.nazivnik * drugi.predznak);
    }

    public Razlomak dijeljeno(Razlomak drugi) {
        return new Razlomak(brojnik * drugi.nazivnik * predznak, nazivnik * drugi.brojnik * drugi.predznak);
    }

    public Razlomak plus(Razlomak drugi) {
        int a = this.brojnik*predznak;
        if (this.nazivnik == drugi.nazivnik) {
            a+=drugi.brojnik * drugi.predznak;
            return new Razlomak(a, this.nazivnik);
        }
        else {
            a =drugi.nazivnik * this.brojnik * predznak + this.nazivnik*drugi.brojnik * drugi.predznak;
            return new Razlomak(a, drugi.nazivnik * this.nazivnik);
        }
    }

    public Razlomak minus(Razlomak drugi) {
        int a = this.brojnik * predznak;
        if (this.nazivnik == drugi.nazivnik) {
            a-=drugi.brojnik * drugi.predznak;
            return new Razlomak(a, this.nazivnik);
        }
        else {
            a =drugi.nazivnik * this.brojnik*predznak - this.nazivnik*drugi.brojnik* drugi.predznak;
            return new Razlomak(a, drugi.nazivnik * this.nazivnik);
        }
    }

    @Override
    public String toString() {
        if (brojnik == 0) return "0";
        if (brojnik == nazivnik) return Math.signum(predznak) == 1? "1": "-1";
        return (Math.signum(predznak) == 1? "": "-") + brojnik + "/" + nazivnik;
    }
}
