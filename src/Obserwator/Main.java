package Obserwator;


import javax.swing.*;

public class Main {

    public static void main( String[] args ) {

        SwingUtilities.invokeLater( new Runnable() {
            @Override
            public void run() {
                Okno o = new Okno();

                Lista lista = new Lista();

                o.dodajObserwatora( lista );

                lista.wypisz();



                o.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
            }
        });


    }

}
