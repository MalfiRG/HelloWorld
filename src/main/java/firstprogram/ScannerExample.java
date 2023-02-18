package firstprogram;
import java.util.Scanner;
public class ScannerExample {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę1:");
            int num1 = scanner.nextInt();
            System.out.println("Podaj liczbę2:");
            int num2 = scanner.nextInt();
            System.out.println("Liczba jaką podałeś to: "+(num1 + num2));
        }
    }
