package builder;

import com.sun.rowset.internal.Row;

class Rower {

    private String model = "";
    private int rozmiarKola;
    private String rodzajNapedu = "";

    public void setModel( String m ) { model = m; }
    public void setRozmiarKola( int r ) { rozmiarKola = r; }
    public void setRodzajNapedu( String r ) { rodzajNapedu = r; }

    public String getModel() { return model; }
    public String getRodzajNapedu() { return rodzajNapedu; }
    public int getRozmiarKola() { return rozmiarKola; }

}

abstract class FabrykaRowerow {

    protected Rower rower;

    public Rower getRower() { return rower; }

    public void setRower() { rower = new Rower(); }

    public abstract void setModel();
    public abstract void setRozmiarKola();
    public abstract void setRodzajNapedu();

}

class BudowniczySzosowy extends FabrykaRowerow {

    @Override
    public void setModel() {
        rower.setModel( "Roubaix" );
    }

    @Override
    public void setRozmiarKola() {
        rower.setRozmiarKola( 28 );
    }

    @Override
    public void setRodzajNapedu() {
        rower.setRodzajNapedu( "Shimano 105" );
    }
}

class Nadzorca {

    private FabrykaRowerow fabryka;

    public void setFabryka( FabrykaRowerow f ) { fabryka = f; }

    public Rower getRower() { return fabryka.getRower(); }

    public void constructRower() {

        fabryka.setRower();
        fabryka.setModel();
        fabryka.setRodzajNapedu();
        fabryka.setRozmiarKola();

    }
}

public class Main {

    public static void main( String[] args ) {

        Nadzorca rowerzysta = new Nadzorca();

        rowerzysta.setFabryka( new BudowniczySzosowy() );

        rowerzysta.constructRower();

        Rower mojRower = rowerzysta.getRower();

        System.out.println( mojRower.getRozmiarKola());


    }

}
