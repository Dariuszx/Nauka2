package Obserwator;


import java.util.ArrayList;

public class Lista implements Obserwator {

    ArrayList<String> lista = new ArrayList<String>();

    @Override
    public void aktualizuj( Obserwowany o ) {

        String s;

        if( !(s = ((Okno)o).getText().trim()).isEmpty() ) {

            lista.add(s);

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
