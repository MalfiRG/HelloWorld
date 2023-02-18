package firstprogram;

//stworzyłem klase, ktora ma własny przepis pola i metody
public class Human {
    //pola to sa dane które klasa posiada, zwykłe zmienne bądź stałe
        String name;
        int age;

    //        konstruktor
    public Human (String name, int age) {
        this.name = name;
        this.age = age;

    }

    // przykład metodym akcja, którą mozna wykonac na obiekcie
    public void introduceYourself() {
        System.out.println("Cześć, jestem " + name);
    }
}
