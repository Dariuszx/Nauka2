package Obserwator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Okno extends JFrame implements Obserwowany {


    private List<Obserwator> listaObserwatorow = new ArrayList<Obserwator>();
    public JTextField input = new JTextField();

    public Okno() {

        setLayout( new FlowLayout() );

        JLabel label = new JLabel( "Przycisnij" );
        JButton button = new JButton( "Submit" );

        input.setColumns( 20 );


        button.addMouseListener( new MouseAdapter() {
            @Override
            public void mouseClicked( MouseEvent e ) {

                powiadomObserwatorow();
            }
        });

        input.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent actionEvent ) {
                powiadomObserwatorow();
            }
        });


        add(label);
        add( button );
        add( input );


        setSize( 640, 480 );
        setTitle( "Moje Okno" );
        setVisible( true );
    }

    public String getText() {

        return input.getText();
    }

    @Override
    public void powiadomObserwatorow() {

        for ( Obserwator o : listaObserwatorow ) {
            o.aktualizuj();
        }
    }

    @Override
    public void usunObserwatora( Obserwator o ) {

    }

    @Override
    public void dodajObserwatora( Obserwator o ) {

        listaObserwatorow.add( o );

    }

}
