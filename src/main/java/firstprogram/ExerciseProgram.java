package firstprogram;

import java.util.Scanner;

public class ExerciseProgram {
    /*Pobierz wiek od użytkownika
    i wyświetl "Jesteś seniorem jeżeli podał liczbę wiekszą niż 65*/
//    spójna konwencja gdzie ustawiać nawiasy
//    sprawdzenie warunku logicznego
    /*w przypadku użycia = (operatora przypisania) najpierw zostanie przypisane true
     * A nastepnie zostanie wykonane sprawdzenie warunku
     * warunek bedzie zawsze spełniony*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        if (age > 65) {
            System.out.println("Jesteś seniorem");
//            }
//            else if (age <65 && age>=40) {
//                System.out.println("Jesteś w średnim wieku");
//            }
//            {else if (age >= 18 && age < 40)}
//            {
//                else
//                System.out.println("Jesteś młodym dorosłym");
//            }


        }
    }
}
