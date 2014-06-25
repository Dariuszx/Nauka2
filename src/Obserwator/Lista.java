package Obserwator;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lista implements Obserwator {

    ArrayList<String> lista = new ArrayList<String>();
    Okno stan;
    Vector<String> wektor = new Vector<String>();




    public Lista( Okno s ) {

        stan = s;


    }

    @Override
    public void aktualizuj() {

        String s;

        if( !stan.input.getText().isEmpty() ) {

            lista.add( stan.input.getText() );

            System.out.println("Dodano");

            wypisz();
        }
    }

    public void wypisz() {

        for ( String i : lista ) {
            System.out.println( i );
        }
    }
}
