package watek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;


public class TowarTest {

    private ArrayList<Towar> listaTowarow;

    @Before
    public void setUp() {

        listaTowarow = new ArrayList<Towar>();

        Towar t1 = new Towar( "LG monitor", 600, 2.5 );
        Towar t2 = new Towar( "Samsung", 900, 4 );
        Towar t3 = new Towar( "Lenov0", 6700, 1 );
        Towar t4 = new Towar( "Acer", 2000, 3 );

        listaTowarow.add( t1 );
        listaTowarow.add( t2 );
        listaTowarow.add( t3 );
        listaTowarow.add( t4 );

        System.out.println( "dasadsasd" );
    }

    @After
    public void tearDown() {

        System.out.println( "metoda tearDown" );


    }

    @Test
    public void testToString() throws Exception {

        System.out.println( "Testuje toString" );

    }

    @Test
    public void testEquals() throws Exception {

        System.out.println( "Testuje equals" );

        boolean result = listaTowarow.get(0).equals( listaTowarow.get(1) );

        Assert.assertTrue( result );
    }


    @Test
    public void testHashCode() throws Exception {

        System.out.println( "Testuje hashCode" );
    }

    @Test
    public void testCompareTo() throws Exception {

        System.out.println( "Testuje compareTo" );
    }
}
