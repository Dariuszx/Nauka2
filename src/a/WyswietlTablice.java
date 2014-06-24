package a;

public final class WyswietlTablice {

    public WyswietlTablice() { }

    public static void wyswietl( Dane dane ) {

        for( int i=0; i < dane.dane.size(); i++ ) {

            System.out.println( dane.dane.get( i ) );

        }
    }
}
