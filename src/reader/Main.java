package reader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Reader {

    private String pathToFile;

    public Reader( String path ) {

        pathToFile = path;

    }

    public static void read( String path ) {


        try {
            FileReader file = new FileReader( path );



            BufferedReader reader = new BufferedReader( file );

            String line;

            while ( (line = reader.readLine()) != null ) {
                Reader.readLine( line );
            }



        } catch ( FileNotFoundException e ) {
            e.printStackTrace();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public static void readLine( String line ) {

        Scanner scanner = new Scanner( line );

        while ( scanner.hasNext() ) {

            System.out.println( scanner.next() );
        }
    }
}


public class Main {

    public static void main( String[] args ) {

        Reader.read( "/home/dariusz/test" );

    }
}
