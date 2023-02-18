package firstprogram;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Podaj dzień tygodnia: ");
        Scanner scanner = new Scanner(System.in);
        // różnica pomiędzy wyrażeniem a instrukcją (statement vs expression)
//        jeżeli nie zrobimy brake to, instrukcja bedzie sprawdzana do NASTPNEGO BRAKE,
//        podając wczesniejsze wartosci aż do brake

        int day = scanner.nextInt();
        scanner.nextLine();
        switch (day) {
            case 1:
                System.out.println("Poniedzialek.");
//                może być tutaj więcej kodu
                break;
            case 2:
                System.out.println("Wtorek.");
                break;
            case 3:
                System.out.println("Sroda.");
                break;
            case 4:
                System.out.println("Czwartek.");
                break;
            case 5:
                System.out.println("Piatek.");
                break;
            case 6:
                System.out.println("Sobota.");
                break;
            case 7:
                System.out.println("Niedziela.");
                break;
            default:
                System.out.println("Nieznany dzien tygodnia!");
        }
//        nowa wersja switcha od Javy 11
        switch (day) {
            case 1 -> System.out.println("Poniedzialek.");
            case 2 -> System.out.println("Wtorek.");
            case 3 -> System.out.println("Sroda.");
            case 4 -> System.out.println("Czwartek.");
            case 5 -> System.out.println("Piatek.");
            case 6 -> System.out.println("Sobota.");
            case 7 -> System.out.println("Niedziela.");
            default -> System.out.println("Nieznany dzien tygodnia!");
        }
        String name = "Piotr";
        switch (name) {
            case "Jan":
                System.out.println("Cześć Janek");
                break;
            case "Magda":
                System.out.println("Cześć Magda");
                break;
            default:
                System.out.println("Nie znam Cię");
                /* default to jest taki else, zostnaie do pasowany do każdje innej wartości.
                *Niż te zdeifniowane powyzej.
                *Wystepuje zawsze na końcu
                * */




        }

        /*Zad1*Napisz program, który przyjmuje od uzytkownika liczbe od 1 do 5 i wypisze ocenę słowną na ekranie
        * */
        System.out.println("Podaj ocenę");
        int ocena = scanner.nextInt();
        switch (ocena) {
            case 1:
                System.out.println("Niedostateczny");
//                może być tutaj więcej kodu
                break;
            case 2:
                System.out.println("Dopuszczający");
                break;
            case 3:
                System.out.println("dostateczny");
                break;
            case 4:
                System.out.println("dobry");
                break;
            case 5:
                System.out.println("Bardzo dobry");
                break;
            case 6:
                System.out.println("Celujący");
                break;
            default:
                System.out.println("Nieprawidłowa ocena");
        }
    }
}
