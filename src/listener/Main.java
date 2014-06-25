package listener;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main( String[] args ) {

        double[] costam = new double[10];



        System.out.println( costam.hashCode() );
        System.out.println(Arrays.hashCode( costam ) );

        ArrayList<String> test = new ArrayList<String>();

        test.add( "ddd" );
        test.add( "asdds" );

        test.clear();


        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                JFrame okno = new JFrame();

                JButton przycisk = new JButton( "submit" );
                JButton przycisk2 = new JButton( "ok" );


                okno.setSize( 400, 400 );
                okno.setLayout( new FlowLayout() );

                przycisk.addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed( ActionEvent actionEvent ) {

                        System.out.println( "przycisk submit");
                    }
                });

                przycisk2.addMouseListener( new MouseAdapter() {
                    @Override
                    public void mouseClicked( MouseEvent e ) {

                        System.out.println( "przycisk ok" );
                    }
                });

                okno.add( przycisk );
                okno.add( przycisk2 );

                okno.setVisible( true );

            }
        });
    }

}
