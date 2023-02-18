package firstprogram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassExample {
    public static void main(String[] args) {
        // jak użyć naszej klasy, stworzyć obiekt!
        // obiekty tworzymy podobnie do deklaracji zmiennych
        //typ //dowolna nazwa // wywołanie;
        // na podstawie klasy, stworzyłem konkretny obiekt
        Human czlowiek1 = new Human("Janek", 20);
        //mogę stworzyć więcej obiektów danego typu:
        Human czlowiek2 = new Human("Aneta", 34);
        //jak wyświetlić imie czlowieka?
        System.out.println(czlowiek1.name);
        //jak wyświetlić wiek czlowieka?
        System.out.println(czlowiek1.age);
        //po kropce mamy dostęp no metod zdefiniowanych w klasie Human
        czlowiek1.introduceYourself();
        // typ zwracany int
        int doubleAge =  czlowiek1.doubleAge();
        System.out.println("Podwójny wiek "+doubleAge);
        czlowiek1.greetSomeone("Pawel");

        Human czlowiek3 = new Human("Anna");

//       jeżeli nie utworzymy konstruktora, kompilator wygeneruje nam konstruktor bezparametrowy
//        jeżeli utworzymy konstruktor, to ten domyślny bezparamentrowy nam zniknie.
        Car car = new Car();
        car.model = "Audi";
        String producer = car.getProducer();
        System.out.println(producer);
        System.out.println(car.getProducer());
//        jak ustawic pole wewnątrz klasy po jej stworzeniu
//        setter
        car.setProducer("Audi");
        producer = car.getProducer();
        System.out.println(producer);
//        car.producer = "Audi A5"; it is private
//        nie chciałbym zeby ktoś z zenwnątrz modyfikował pól z nazwą marki
//        do tego służą modyfikatory dostepu

        Scanner s= new Scanner(System.in);
//        metoda klasy

    }
}