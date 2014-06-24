package a;


class Watek implements Runnable {

    private int index=0;

    private synchronized void iteruj() {

        for( int i = 0; i < 10; i++ ) {

            index++;
            System.out.println( index + " " + i );

        }
    }

    @Override
    public void run() {

        iteruj();
    }
}



public class Main {

    public static void main( String[] args ) {


        Watek a = new Watek();

        System.exit( 1 );

        synchronized ( a ) {
            System.out.println( "dybka dariusz" );
        }





        //new Thread( a ).start();
        //new Thread( a ).start();

        /*
        Dane dane = new Dane();

        new WczytywanieDanych( "/home/dariusz/test", dane );

       // wyswietl( dane );

        new Czytanie( dane, false ).run();
        new Czytanie( dane, true ).run();

        //wyswietl( dane );
*/


/*

        Student s1 = new Student( "Dariusz", "Gybka" );
        Student s2 = new Student( "Jakub", "Dac" );

        System.out.println(s1.compareTo(s2));

        try {
            Class c = Class.forName("a.Student");
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }
*/

    }


}
