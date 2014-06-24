package flyweight;


public class Znak implements GraphicObject {

    private char c;
    private String czcionka;

    public Znak( char c, String czcionka ) {

        this.c = c;
        this.czcionka = czcionka;
    }

    @Override
    public void printAtPossition( int x, int y ) {

        System.out.println( "Wstawiam znak " + c + " na pozycji " + x + "x" + y + " | Czcionka = " + czcionka );
    }
}
