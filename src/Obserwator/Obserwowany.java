package Obserwator;


public interface Obserwowany {

    public void powiadomObserwatorow();

    public void dodajObserwatora( Obserwator o );

    public void usunObserwatora( Obserwator o );

}
