package firstprogram;

public class Operators {
    public static void main(String[] args) {
        //OPERATORY
            //arytmetyczne
        int numberOne = 1;
        int numberTwo = 2;
        int sum = numberOne + numberTwo;
        System.out.println("Suma " + (numberOne+numberTwo));
        System.out.println("Suma " + sum);

        int diff = numberOne - numberTwo;
        System.out.println("Róznica " + diff);

        int mult = numberOne * numberTwo;
        System.out.println("Iloczyn " + mult);

        int div = numberTwo / numberOne;
        System.out.println("Iloraz " + div);

        int rest = 5 % 2;
        System.out.println("Modulo " + rest);

        // 8+2
        int someNumber = 8;
        int otherNumber = 2;
        int suma2 = someNumber + otherNumber;

        System.out.println("suma " + suma2);
        System.out.println("Suma " + (someNumber + otherNumber));

        //operatory arytmentczne działają na dwóch liczbach
        //a+b - a i b nazywamy operandami, a + operatorem

        int thirdNumber = 100;
        int totalSum = thirdNumber + someNumber + otherNumber; // kompilator działa od lewej do prawej
        // czyli najpierw dodale liczby od lewej, potem przesuwa sie w prawo
        System.out.println(totalSum); // kolejnosc taka jak w matematyce, tj * / % + -

        double weogjt = 100.0 + 10; //double dominuje int - gdy dodajemy dwa typy mieszane
        int shoeSize = 44; //zwiekszam o 1
        shoeSize = shoeSize + 1; // długa kłopotliwa wersja
        shoeSize++; //skrót w postaci inkrementacji
        System.out.println(shoeSize++);

        shoeSize = 45;
        shoeSize--; //skrót w postaci dekrementacji
        System.out.println(shoeSize--);

        //postimkrementacja x++
        int numberOfFriends = 1;
        System.out.println("Number of friends " + numberOfFriends++); //zwróci 1 jeżeli ++ jest za zmienną (postimkrementacja)
        System.out.println(numberOfFriends);

        //preimkrementacja  ++x

        System.out.println("Number of friends " + ++numberOfFriends);

        //predekrementacja  --x

        System.out.println("Number of friends " + --numberOfFriends);

        //postdekrementacja  x--

        System.out.println("Number of friends " + numberOfFriends--);
        System.out.println(numberOfFriends);

        // operatory porównanania zwracają true lub false
        int secretNumber = 1;
        int secretNumber2 = 2;
        boolean result = 1 == 1;
        result = secretNumber != secretNumber2; // rezultat true
        System.out.println(result);
            //2         //1
        result = secretNumber2 > secretNumber; //true
        result = secretNumber2 < secretNumber; //false
        result = secretNumber2 >= secretNumber; //true
        result = secretNumber2 <= secretNumber; //false

        //operatoru logiczne - działają na wartościach typu boolean true/false w rezultacie dostajemy również boolean
        boolean isMale = false;
        boolean isWeekend = false;
        // wykmuje operację logiczną. && zwraca true wtedy i tylko wtedy gdy dwie wartości są PRAWDZIWE
        result = isMale && isWeekend;
        System.out.println(result);

        //operacje logiczne or || wystarczy, ze jednak ze zmiennych isMale i isWeekend ma wartość TRUE, wtedy dostaniem w rezultacie TRUE
        // w przeciwnym razie dostajemy false
        System.out.println(result = isMale || isWeekend);

        // łaczenie operatorów
        int age = 17;
        isMale = true;
        // czy może wejsc do nocnego klubu? Może wejść kiedy jest pełnoletni i jest facetem;

        boolean canEnterNightClub = (age >= 18) && (isMale == true); // 17 letniego faceta // zwraca true
        System.out.println(canEnterNightClub);

        // 1-3 wiek przyjecia do żłobka
        age = 2;
        // zmienna true lub false oznaczająca czy dziecko może dostać się do żłobka
        // musi byc starszy niż 0 i młodszy niż 4 albo musi miec 1 lub wiecej && nie wiecej niż 3
        boolean canEnterPreschool = (age > 0) && (age < 4);
        System.out.println(canEnterPreschool);

        boolean canEnterPreschool2 = (age >= 1) && (age <= 3);
        System.out.println(canEnterPreschool2);

        // true po negacji => mam false
        boolean negation = !canEnterPreschool;
        System.out.println(negation);
        boolean canDrinkBeer = false;
        negation = !canDrinkBeer; // true
        System.out.println(negation);

        // operatory bitowe przykład bitowe and (&)

        int bitwiseResult = 4 & 2;
        // 100
        // 010

        System.out.println(bitwiseResult);

        // operatory przypisania
        int luckyNumber = 7;
        // dodaje do luckyNumber 3
        luckyNumber = luckyNumber + 3;
        System.out.println(luckyNumber);
        luckyNumber += 3;
        System.out.println(luckyNumber);
        // roznica
        System.out.println(luckyNumber -=3);
        //iloczyn
        System.out.println(luckyNumber *=2);
        //iloraz
        System.out.println(luckyNumber /=3);
        //modulo
        System.out.println(luckyNumber %=5);

        //zadanie
        int number1 = 7;
        int number2 = 14;

        int result1 = number1 += number2;
        System.out.println("Suma " + result1);
        result1 = number1 -= number2;
        System.out.println("Różnica " + result1);
        result1 = number1 *= number2;
        System.out.println("iloczyn " + result1);
        result1 = number1 /= number2;
        System.out.println("iloraz " + result1);

        int negativeNumber = -result1;
        negativeNumber = +result1;

        /* int result = */

        /* operatory maja kolelnosc wykonywania. Najwazniejsze aby wiedziec, ze logiczne &7 jest wykonywane przez logicznym ||

         */
        boolean haveFunds = true; //mam pieniądze
        boolean cookiesInStock = false; //ciasteczek nie ma w sklepie
        boolean juiceInstock = true; //sok jest w sklepie
        boolean willBuySomething = juiceInstock || haveFunds && cookiesInStock; // taka kolejnosc juiceInStock
        System.out.println(willBuySomething);

        boolean a = false;
        boolean b = false;
        boolean c = true;

        System.out.println(a == b == c); //zawsze true, ponieważ najpierw kolejnośc bedzie od lewej do prawej
        // zawsze przy skomplikowanych warunkach wymuszamy kolejnośc nawiasami

        int x = 5;
        int y = 10;
        int z = x++ * y; // wynik 50, postinkrementacja
        System.out.println(z); // wynik 50
        System.out.println(x);

        // preinkrementacja

        int x1 = 5;
        int y1 = 10;
        int z1 = ++x1 * y1; // wynik 50, PREinkrementacja zmienia zupelnie wynik
        System.out.println(z1); // wynik 60
        System.out.println(x1);

        System.out.println("1 + 2 = " +1 + 2);
        /* następuje konwersja, pierwszy mamy string; 1 zostanie zamienione na stringa
        2 jest doklejana i wychodzi napiś 12, zamiast działania matermatycznego
         */
        String var = "1 + 2" + 1;
        /* jak to naprawić?
        Wymusić kolejnosc nawiasem
         */
        System.out.println("1 + 2 = " + (1 + 2)); // problem występuje tylko z +, bo służy nam do łączenia napisów

        /*zadeklaruj liczbe całkowitą z wymyśloną przez ciebie wartościa
        ułóz warunek sprawdzający czy ta liczba jest z zakresu 244-1000.
        Wynik sprawdzenia zapisz w zmiennej logicznej
         */

        int randomNumber = 556;
        // zmienna true lub false oznaczająca czy dziecko może dostać się do żłobka
        // musi byc starszy niż 0 i młodszy niż 4 albo musi miec 1 lub wiecej && nie wiecej niż 3
        canEnterPreschool = (age > 0) && (age < 4);
        System.out.println(canEnterPreschool);



    }
}
