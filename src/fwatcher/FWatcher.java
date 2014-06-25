package fwatcher;


import java.io.File;

public class FWatcher extends Thread {

    public boolean flaga = false;
    private String path;
    private int odstep;

    public FWatcher( String p, int dt ) {
        path = p;
        odstep = dt;
    }


    @Override
    public void run() {

        File plik = new File( path );

        while( true ) {



            if( plik.canRead() ) {
                flaga = true;
            } else flaga = false;

            try {
                sleep( odstep );
            } catch ( InterruptedException e ) {
                return;
            }

        }


    }

}
