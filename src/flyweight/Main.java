package flyweight;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class FabrykaElementowGraficzny {

    private HashMap<String, GraphicObject> obiekty = new HashMap<String, GraphicObject>();

    public int getLiczbaElementow() { return obiekty.size(); }

    public GraphicObject getElement( Character c, String czcionka ) {

        GraphicObject obiekt;
        String key = "CH:" + c.toString() + "@" + czcionka;

        if( (obiekt = obiekty.get( key )) == null ) {

            obiekt = new Znak( c, czcionka );
            obiekty.put( key, obiekt );
        }

        return obiekt;
    }

    public GraphicObject getElement( String filename, int width, int height ) {

        GraphicObject obiekt;
        String key = "P:" + filename;

        if( (obiekt = obiekty.get( key )) == null ) {
            obiekt = new Obrazek( filename, width, height );
            obiekty.put( key, obiekt );
        }

        return obiekt;
    }
}


public class Main {

    public static void main( String[] args ) {

        FabrykaElementowGraficzny fabryka = new FabrykaElementowGraficzny();
        ArrayList<GraphicObject> document = new ArrayList<GraphicObject>();
        HashSet<String> test = new HashSet<String>();

        test.add( "darek" );
        test.add( "dybka" );





        document.add( fabryka.getElement( 'd', "Arial" ) );
        document.add( fabryka.getElement( "/home/dariusz/test", 100, 200 ) );

        int x=0, y=0;

        for( GraphicObject e : document ) {
            e.printAtPossition( x++, y );

            if( e instanceof Obrazek ) { System.out.println( ((Obrazek)e).getFilename() ); }
        }

    }
}
