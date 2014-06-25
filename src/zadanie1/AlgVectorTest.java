package zadanie1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AlgVectorTest {

    private AlgVector wektor1;
    private AlgVector wektor2;

    @Before
    public void setUp() {

        wektor1 = new AlgVector();
        wektor2 = new AlgVector();

        wektor1.set( 12.5 );
        wektor1.set( 13.5 );

        wektor2.set( 32.4 );
        wektor2.set( 23.1 );

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testDodajTablice() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

        wektor1.toString();
        wektor2.toString();
    }

    @Test
    public void testEquals() throws Exception {

        boolean result1 = wektor1.equals( wektor2 );
        boolean result2 = wektor2.equals( wektor1 );

        Assert.assertFalse( result1 );
        Assert.assertFalse( result2 );

        AlgVector a = new AlgVector();
        a.set( 2.3 );
        a.set( 3.4 );

        AlgVector b = new AlgVector();
        b.set( 2.3 );
        b.set( 3.4 );

        Assert.assertTrue( a.equals( b ) );
    }

    @Test
    public void testHashCode() throws Exception {

        int hash1 = wektor1.hashCode();
        int hash2 = wektor2.hashCode();

        AlgVector a = new AlgVector();
        a.set( 2.3 );
        a.set( 3.4 );

        AlgVector b = new AlgVector();
        b.set( 2.3 );
        b.set( 3.4 );


        int hash3 = a.hashCode();
        int hash4 = b.hashCode();

        Assert.assertFalse( hash1 == hash2 );
        Assert.assertTrue( hash3 == hash4 );

    }
}
