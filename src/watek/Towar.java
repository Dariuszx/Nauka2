package watek;

import java.util.Objects;

public class Towar implements Comparable<Towar> {

    String nazwa;
    int cena;
    double waga;

    Towar() {
        nazwa = null;
        cena = 0;
        waga = 0.0;
    }

    Towar(String inNazwa) {
        nazwa = inNazwa;
        cena = 0;
        waga = 0.0;
    }

    Towar(String inNazwa, int inCena) {
        nazwa = inNazwa;
        cena = inCena;
        waga = 0.0;
    }

    Towar(String inNazwa, int inCena, double inWaga) {
        nazwa = inNazwa;
        cena = inCena;
        waga = inWaga;
    }

    void setNazwa(String inNazwa) {
        nazwa = inNazwa;
    }

    void setCena(int inCena) {
        cena = inCena;
    }

    void setWaga(double inWaga) {
        waga = inWaga;
    }

    String getNazwa() {
        return nazwa;
    }

    int getCena() {
        return cena;
    }

    double getWaga() {
        return waga;
    }

    @Override
    public String toString() {
        return "nazwa: " + nazwa + ", cena: " + cena + ", waga: " + waga;
    }

    @Override
    public boolean equals(Object innyObiekt) {
        if (innyObiekt == null) {
            return false;
        }
        if (innyObiekt == this) {
            return true;
        }
        if (!(innyObiekt instanceof Towar)) {
            return false;
        }

        Towar innyTowar = (Towar) innyObiekt;
        return (nazwa == null ? innyTowar.getNazwa() == null : nazwa.equals(innyTowar.getNazwa()))
                && (cena == innyTowar.getCena()) && (waga == innyTowar.getWaga());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nazwa);
        return hash;
    }

    @Override
    public int compareTo(Towar t) {
        return nazwa.compareTo(t.getNazwa());
    }
}