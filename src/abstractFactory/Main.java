package abstractFactory;


abstract class AbstractFactory {

    public static AbstractFactory getObject( boolean which ) {

        if ( which ) {

            return new WindowsOS();

        } else {

            return new LinuxOS();
        }
    }

    public abstract Button createButton();


}

abstract class Button {

    public abstract void pain();
}


class WindowsOS extends AbstractFactory {

    @Override
    public Button createButton() {

        return new WindowsButton();
    }

}

class LinuxOS extends AbstractFactory {

    @Override
    public Button createButton() {

        return new LinuxButton();
    }

}

class WindowsButton extends Button {

    @Override
    public void pain() {
        System.out.println( "Przycisk Systemu Windows XP" );
    }
}

class LinuxButton extends Button {

    @Override
    public void pain() {
        System.out.println( "Rysuje przycisk dla systemu Linuks" );
    }
}


public class Main {

    public static void main( String[] args ) {

        AbstractFactory fabrykaAbstrkcyjna = AbstractFactory.getObject( false );

        Button przycisk = fabrykaAbstrkcyjna.createButton();

        przycisk.pain();
    }

}
