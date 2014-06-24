package stan;

interface KonkretnyStan {

    public void doSomething();
}

class Rycerz implements KonkretnyStan {

    @Override
    public void doSomething() {
        System.out.println( "Jestem odporny na ciosy fizyczne!!!" );
    }
}

class Palladyn implements KonkretnyStan {

    @Override
    public void doSomething() {
        System.out.println( "Jestem palladynem, jestem słaby w walce w zwarciu, ale mój atak z dystansu jest nieprzeciętny!" );
    }
}


class Postac {

    KonkretnyStan profesja;

    public Postac( KonkretnyStan stan ) {
        profesja = stan;
    }

    public void setProfesja( KonkretnyStan stan ) {
        profesja = stan;
    }

}


public class Main {

    public static void main( String[] args ) {

        Postac mojaPostac = new Postac( new Rycerz() );

        mojaPostac.profesja.doSomething();

        mojaPostac.profesja = new Palladyn();

        mojaPostac.profesja.doSomething();

    }
}
