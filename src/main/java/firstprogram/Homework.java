package firstprogram;

public class Homework {
    public static void main(String[] args) {
        /*Zad1
        * Zadeklaruj i zainicjuj zmienną typu boolean o nazwie "isRaining" i przypisz wartość true lub false.*/
        boolean isRaining = true;
        isRaining = true;
        System.out.println(isRaining);


        /*zad2
        * Zadeklaruj i zainicjuj zmienną typu integer o nazwie "numOfStudents" i przypisz wartość wybraną przez ciebie.*/

        int numOfStudents = 256;


        /*zad3
        Zadeklaruj i zainicjuj zmienną typu double o nazwie "averageScore" i przypisz wartość dziesiętną wybraną przez ciebie.*/
        double averageScore=1.6020354919021;
        System.out.println(averageScore);


        /*zad4
         Zadeklaruj i zainicjuj zmienną typu char o nazwie "grade" i przypisz wartość wybranej oceny (np. 'A', 'B', 'C' itp.).*/
        char grade = 'A';
        System.out.println(grade);


        /*zad5
         * Zadeklaruj i zainicjuj zmienną typu string o nazwie "studentName" i przypisz wartość swojego imienia.*/
        String myName = new String("Piotr");
        System.out.println(myName);


        /*zad6
        *     * Zadeklaruj dwie zmienne typu integer o nazwach "num1" i "num2"
         * i przypisz im wartości wybrane przez ciebie. Następnie zadeklaruj trzecią zmienną typu integer o nazwie "sum"
         * i przypisz jej wartość sumy "num1" i "num2".*/
        int num1 = 234;
        int num2 = 3642;
        var sum = num1 += num2;
        System.out.println(sum);


        /*zad7
        * Zadeklaruj zmienną typu float o nazwie "price" i przypisz wartość wybraną przez ciebie.
        * Następnie zadeklaruj drugą zmienną typu float o nazwie "discount" i przypisz wartość reprezentującą procent rabatu (np. 0,10 dla 10%).
        * Na koniec zadeklaruj trzecią zmienną typu float o nazwie "finalPrice" i przypisz jej wartość "price" minus wartość rabatu.*/

        float price = 5500f;
        float discount = 0.15f;
        float finalPrice = (price*(1-discount));
        System.out.println(finalPrice);


        /*zad8
        * Zadeklaruj i zainicjuj zmienną typu long o nazwie "population" i przypisz wartość reprezentującą populację wybranego przez ciebie miasta.*/
        long populationPraha = 1_309_000;
        System.out.println(populationPraha);


        /*
        zad9
        Zadeklaruj i zainicjuj zmienną typu short o nazwie "year" i przypisz wartość reprezentującą bieżący rok.
        Następnie zadeklaruj kolejną zmienną typu short o nazwie age i przypisz do niej swój wiek.
        Jako ostatni punkt, zadeklaruj zmienną dateOfBirth i przypisz rok swojego urodzenia (year -age)*/
        short year = 2023;
        short age = 28;
        var dateOfBirth = year -= age;
        System.out.println(dateOfBirth);

    }
}
