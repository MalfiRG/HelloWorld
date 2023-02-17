package firstprogram;

import javax.management.monitor.StringMonitorMBean;

public class VariableProgram {
    public static void main(String[] args) {
        //Java to język statycznie typowany - przy deklaracji zmiennej ZAWSZE trzeba podać jej typ
        //tworzenie zmiennej - deklaracja zmiennej o nazwie variableINT przechowującej liczby całkowite
        // int - typ zmiennej
        // variableInt - nazwa
        int variableInt;
        // wrzucam do zmiennej liczbę całkowitą 1 - inicjalizacja
        variableInt = 1;
        System.out.println(variableInt);
        // zmianiam liczbę w zmiennej
        variableInt = 2;
        System.out.println(variableInt);

        // delkaracja i inicjalizacja razem
        int variableIntThree=3;
        System.out.println(variableIntThree);

        // przy deklaracji zmiennej ZAWSZE trzeba podać jej typ
            //variable variableIntThree=3 bez "int" NIE ZADZIAŁA

        // deklaracje róznych typów wraz z opisem
        // zainicjalizowana true
        boolean male = true; //wartosci logiczne prawda/fałsz
        boolean female = false;
        // male = 1; po deklaracji typu nie mozna przechowywac innego typu, niż ten wcześniej zadeklarowany
        // czyli niekompatybilnego
        byte numofMembers = 10; // zakres od -128 do 127
        // numofMembers=10000; //nie można przechowywac za dużej, ani za małej wartości w zmiennej byte
        short numofMembersShort = 10_000;
        numofMembersShort = numofMembers; // moge przechowywać wartość ze zmiennej byte w każdej zmiennej całkowitej, bo ma wieksza wartość
        int calorieCount=2000;
        //calorieCount = numofMembers
        //calorieCount = numofMembersShort
        long somethingSuperBig = 3_000_000_000L;//wartości całkowite w zakresie [-2 miliardy; 2 miliardy]
        //przy inicjalizacji longa musimy poadawć L na końcu, inaczej dostaniemy błąd, Java interpetuje liczby całkowite automatycznie

        //liczby zmiennoprzecinkowe (dziesiętne ułamki)
        // dla Javy, każda liczba z przecinkiem to jest double, przy inicjalizacji float musimy dodać małe f na koniec
        double weightDouble= 72.51111111111111111111;
        float weight = 72.5f;

        char gender = 'M'; //'F' // reprezentuje pojedynczy symbol w teksie, gdy wpiszemy podwójny to wyświetli błąd
        System.out.println(gender);

        String firstName = "Paweł"; //mozna myślec o tym napisie jako ciągu charów 'P'+'a'+'w'+'e'+'l'
        System.out.println(firstName); //liczba
        int age = 12;
        String ageString = "12"; //napis

        System.out.println(ageString);
        System.out.println(firstName + ' ' + age); //konkatenacja - łączenie kilku Stringów w jeden przy użyciu +
        // metody na Klasie string (specjalne funkcje do dyspozycji gdy chcemy działać na tej klasie
        // na stworzonym stringu wykonujemy są dostepne po kropce jak nożej
        // ile liter ma string
        System.out.println(firstName.length());
        String empty = "";
        System.out.println(empty.isEmpty()); //zwróci true gdy strung będzie pusty

        String myName = "Piotr";
        System.out.println("Cześć! Jestem " + myName);


        //STAŁE - nadajemy wartp tylko raz przy deklaracji
        //słówko final przed typ, konwencja jest taka, aby stałe składały się z dużych liter
        final float PI = 3.14f;
        // PI = 6.0f; nie możemy zmieniać wartości
        // mozemy definiować stałe każdego typu final int ADULT_AGE=18
        final int ADULT_AGE = 18; //używamy podkreślnika _ aby oddzielać człony nazwy od siebie
        final String SAMPLE_NAME = "John";



    }
}
