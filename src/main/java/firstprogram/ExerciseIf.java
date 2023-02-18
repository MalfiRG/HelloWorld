package firstprogram;
import java.util.Scanner;
public class ExerciseIf {

    /*Zad1
    Napisz program, który pobiera od użytkownika wiek i wyświetla komunikat "Jesteś osobą pełnoletnią"
    jeśli wiek jest większy lub równy 18, a w przeciwnym razie wyświetla "Jesteś niepełnoletni".*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();

        {
            if (age > 0 && age < 18) {
                System.out.println("Jesteś niepełnoletni");
            } else if (age > 18 && age < 65) System.out.println("Jesteś pełnoletni");
            else {
                System.out.println("Jesteś seniorem");
            }

        }

        /*Zad2
        Napisz program, który sprawdza, czy podana przez użytkownika liczba jest dodatnia, ujemna czy równa zero i wyświetla odpowiedni komunikat.*/
        int sublimationTemp = -17;
        {
            if (sublimationTemp < 0) {
                System.out.println("Negative number");
            } else if (sublimationTemp == 0) {
                System.out.println("Equals zero");}
                else {
                System.out.println("Positive number");}
            }

          /*Zad3
          Napisz program, który pobiera od użytkownika trzy liczby i wyświetla największą z nich.
          */



        /*Napisz program, który pobiera od użytkownika dwie liczby i sprawdza, czy pierwsza liczba jest większa od drugiej.
          Jeśli tak, to wyświetla "Pierwsza liczba jest większa", w przeciwnym razie wyświetla "Druga liczba jest większa".*/



        }
    }
