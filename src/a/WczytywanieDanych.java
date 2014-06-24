package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WczytywanieDanych {

    public WczytywanieDanych( String sciezka, Dane dane ) {

        File plik = new File( sciezka );

        try {

            Scanner scanner = new Scanner(plik);

            while ( scanner.hasNext() ) {

                dane.dane.add( scanner.nextLine() );

            }


        } catch ( FileNotFoundException e ) {

            e.printStackTrace();

        }

    }

}
