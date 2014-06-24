package a;


public class Czytanie extends Thread {

    private Dane dane;
    private boolean flaga;


    public Czytanie( Dane dane, boolean flaga ) {

        this.dane = dane;
        this.flaga = flaga;

    }

    @Override
    public void run() {

        int skok;

        if( flaga ) skok = 1;
        else skok = 2;

        for ( int i=0; i < dane.dane.size(); i += skok ) {

            try {
                sleep( 500 );

            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }

            dane.dane.set( i, dane.dane.get( i ) + skok );

            System.out.println( dane.dane.get( i ) );


        }

    }
}
