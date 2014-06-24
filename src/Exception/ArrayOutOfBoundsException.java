package Exception;


public class ArrayOutOfBoundsException extends Exception {

    private int numerWiersza;

    public ArrayOutOfBoundsException( String msg, int numerWiersza ) {

        super(msg);
        this.numerWiersza = numerWiersza;
    }

    public ArrayOutOfBoundsException( int numerWiersza ) {
        super( "Wystąpił nieoczekiwany błąd." );
        this.numerWiersza = numerWiersza;
    }

    public int getNumerWiersza() {
        return numerWiersza;
    }
}
