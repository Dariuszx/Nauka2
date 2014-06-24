package flyweight;


public class Obrazek implements GraphicObject {

    private String filename;
    private int width, height;

    public Obrazek( String filename, int width, int height ) {

        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public void printAtPossition( int x, int y ) {
        System.out.println( "Wstawiam obrazek " + filename + " na pozycji " + x + "x" + y + " | Rozmiar: " + width + "x" + height );
    }
}
