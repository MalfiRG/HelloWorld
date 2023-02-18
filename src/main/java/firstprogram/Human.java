package firstprogram;

//stworzyłem klase, ktora ma własny przepis pola i metody
public class Human {
    //pola to sa dane które klasa posiada, zwykłe zmienne bądź stałe
        String name;
        int age;

    //        konstruktor - specjalna metoda do Tworzenia obiektu
//    posada zawsze taka nazwę jak klasa
    public Human (String name, int age) {
        this.name = name;
        this.age = age;

    }
//kontruktor bezparametrowy, nie przekazujemy żadnego pola
    public Human (String name) {
        this.name = name;
    }
    // przykład metodym akcja, którą mozna wykonac na obiekcie
    // nazwę
    // typ zwracany
    // modyfikator, public
    // typ zwracany void
    public void introduceYourself() {
        System.out.println("Cześć, jestem " + name);
    }

    //typ zwracany int
    public int doubleAge() {
        return age*2;
    }
    //some name to parameter - zmienna, którą możemy przyjać z zewnątrz
    public void greetSomeone(String someName) {
        System.out.println("Czesc "+ someName+" jestem "+name );
    }
}
