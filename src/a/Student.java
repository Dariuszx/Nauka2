package a;


public class Student implements Comparable<Student> {

    public String imie;
    public String nazwisko;

    public Student( String imie, String nazwisko ) {

        this.imie = imie;
        this.nazwisko = nazwisko;

    }


    @Override
    public int compareTo( Student student ) {

        return this.nazwisko.compareTo( student.nazwisko );

    }
}
