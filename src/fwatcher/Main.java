package fwatcher;

import java.util.Set;
import java.util.TreeSet;

interface costam {

    public void cos();
}

class Circle implements costam {

    @Override
    public void cos() {



    }
}

final class test {



    public void metoda() {

    }

}


public class Main {

    costam[] tablica = new costam[10];

    class test {

        public void metoda() { System.out.println( "działa" ); }
    }

    public static void main( String[] args ) {



       // test dziala = new test();

        //dziala.metoda();



        TreeSet<String> zbior = new TreeSet<String>();



        zbior.add( "darek" );
        zbior.add( "dybka" );
        zbior.add( "dybka" );

        for ( String s : zbior ) {
            System.out.println( s );
        }

        costam[] tablica = new costam[100];

        tablica[0] = new Circle();


        FWatcher watek = new FWatcher( "test", 500 );
        watek.setDaemon( true );
        //watek.start();




        System.out.println( "Wychodzę z programu." );
    }

}
