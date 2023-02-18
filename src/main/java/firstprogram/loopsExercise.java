package firstprogram;

import java.util.Scanner;
public class loopsExercise {
    public static void main(String[] args) {

        /*Zad1
        *Napisz program, który oblicza sumę liczb całkowitych od 50 do 100 za pomocą pętli for i do while*/

        //for
        int sumFor = 0;
        for (int i = 50; i <= 100; i++) {
            sumFor += i;}

            System.out.println("Suma liczb od 50 do 100 (for): " + sumFor);

        //while
        int sumDoWhile = 0;
        int counter = 50;
        do {
            sumDoWhile += counter;
            counter++;
        } while (counter <=100);
        System.out.println("Suma liczb od 50 do 100 (do while): " + sumDoWhile);


        /*Napisz program, który wyświetla liczby parzyste od 2 do 20 za pomocą pętli for.
        * */
        for (int k = 2; k <= 20; k++) {
            System.out.println("Liczba " +k);
            //zad na parzystosć
            if (k % 2 == 0) {
                System.out.println(k + " jest parzysta");
            } else {
                System.out.println(k + " jest nieparzysta");
            }
        }

        //alternatywa
        for (int k = 2; k <= 20; k++) {
            System.out.println("Liczba " +k);
            //zad na parzystosć
            if (k % 2 != 0) {
                System.out.println(k + " jest nieparzysta");
            } else {
                System.out.println(k + " jest parzysta");
            }
        }

        //inna alternatywa - DO UZUPELNIENIA!!!


        /*Napisz program, który pobiera od użytkownika liczbę
        i wyświetla jej silnie za pomocą pętli for. - na rozmowe kwalifikacyjną w Java*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int num1= scanner.nextInt();
        int silnia = 1;

        for (int i = 1; i <= num1; i++) {
            silnia *= i;
        }
        System.out.println("Silnia z liczby:" + num1 + silnia);

        }

    }
