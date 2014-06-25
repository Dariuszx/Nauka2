package zadanie1;

import java.util.ArrayList;
import java.util.Vector;

class WrongArrayException extends Exception {

    public WrongArrayException( String msg ) {
        super( msg );
    }
}


class AlgVector {


    private ArrayList<Double> wektor;

    public AlgVector( int rozmiar ) {

        wektor = new ArrayList<Double>( rozmiar );
    }

    public AlgVector() {

        wektor = new ArrayList<Double>();
    }

    public int lenght() { return wektor.size(); }

    public void set( Double wartosc ) {
        wektor.add( wartosc );
    }

    public Double get( int index ) { return wektor.get( index ); }

    public void dodajTablice( AlgVector o ) throws WrongArrayException {

        if( o.lenght() != lenght() ) throw new WrongArrayException( "Nieprawidłowy rozmiar tablicy" );

        for( int i=0; i < lenght(); i++ ) {

            Double a = wektor.get( i );
            a += o.get( i );
            wektor.set( i, a );
        }
    }

    @Override
    public String toString() {

        String napis = "";
        int i=0;

        for( Double d : wektor ) {
            napis += "[" + i + "] = " + Double.toString( d ) + " ";
            i++;
        }

        return napis;
    }

    @Override
    public boolean equals( Object o ) {

        if( o instanceof AlgVector && ((AlgVector)o).lenght() == lenght() ) {

            for ( int i=0; i < lenght(); i++ ) {


                if( wektor.get( i ).doubleValue() != ((AlgVector)o).get( i ).doubleValue() ) {
                    return false;
                }


            }

            return true;

        } else return false;
    }

    @Override
    public int hashCode() {

        String napis = "";

        napis = Integer.toString( wektor.size() );

        int i=0;

        for( Double d : wektor ) {
            napis += "[" + i + "] = " + Double.toString( d ) + " ";
            i++;
        }


        return wektor.hashCode();
    }

}



public class Main {

    public static void main( String[] args ) {

        AlgVector wektor1 = new AlgVector();
        AlgVector wektor2 = new AlgVector();

        wektor1.set( 123.23 );
        wektor1.set( 323.32 );

        wektor2.set( 123.23 );
        wektor2.set( 323.32 );
        wektor2.set( 323.32 );

        System.out.println( "Wypisuje 2 wektory" );

        System.out.println( wektor1.toString() );
        System.out.println( wektor2.toString() );

        System.out.println( "Wyswietlam kolejno ich hash" );
        System.out.println( wektor1.hashCode() );
        System.out.println( wektor2.hashCode() );

        System.out.println( "Porównuje wektory" );
        System.out.println( wektor1.equals( wektor2 ));

        try {
            wektor1.dodajTablice( wektor2 );
        } catch ( WrongArrayException e ) {
            e.printStackTrace();
        }

        System.out.println( "Wypisuje wektor pierwszy po dodadaniu go do wektoru drugiego" );
        System.out.println( wektor1 );

    }

}
