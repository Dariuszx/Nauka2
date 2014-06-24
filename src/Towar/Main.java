package Towar;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

class Towar implements Comparable<Towar> {

    private String nazwa;
    private int cena;
    private double waga;

    public Towar( String nazwa, int cena, int waga ) {

        this.cena = cena;
        this.nazwa = nazwa;
        this.waga = waga;
    }

    public void setCena( int c ) {
        cena = c;
    }

    public void setWaga( double w ) {
        waga = w;
    }

    public void setNazwa( String n ) {
        nazwa = n;
    }

    public int getCena() { return cena; }

    public double getWaga() { return waga; }

    public String getNazwa() { return nazwa; }

    @Override
    public int compareTo( Towar towar ) {

        int e = towar.getNazwa().compareTo( nazwa );

        if( e < 0 ) return -1;
        else if ( e > 0 ) return 1;

        return 0;
    }

    @Override
    public boolean equals( Object o ) {

        return o instanceof Towar
                && ((Towar)o).getNazwa().equals( nazwa )
                && ((Towar)o).getCena() == cena
                && ((Towar)o).getWaga() == waga;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwa + " cena=" + cena + " waga=" + waga;
    }

    @Override
    public int hashCode() {
        return (int)(nazwa.hashCode() / 12 % 51);
    }
}



public class Main {

    public static void main( String[] args ) {

        ArrayList<String> listaUczniow = new ArrayList<String>();

        listaUczniow.add( "Dariusz Dybka" );
        listaUczniow.add( "Jan Kowalski" );
        listaUczniow.add( "Przemysław Rzedkowski" );

        int i = 0;

        for ( String s : listaUczniow ) {

            if( s.equals( "Jan Kowalski" ) ) {
                break;
            }

            i++;

        }

        listaUczniow.remove( i );

        for( String s : listaUczniow ) {

            System.out.println( s );
        }




    }

}
