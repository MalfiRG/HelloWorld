package firstprogram;

public class Arrays {
    public static void main(String[] args) {
        // deklaracja tablicy bez inicjalizacji

        int[] arrDeclaration= new int[10];

        //nie podajemy liczby w nawiasie gdy inicjalizujemy od razu

        int[] yetAnotherArray = new int[]{ 1, 2, 3, 4, 5, 6};
        //Poprzez index odwołujemy się do kontretnego miesjca w pamięci, gdzie znajduje sie konkretna wartość
        //index ZAWSZE ZACZYNA SIE OD 0; dlatego tutuaj yeAnotherArray[0] ma przypisaną wartość 1 z tablicy

        System.out.println("Pierwszy element w tablicy " +yetAnotherArray[0]);
        System.out.println("Pierwszy element w tablicy " +yetAnotherArray[5]);

        /* Użycie petli do wypisania wszystkich elementów w tablicy
        * yetAnotherArray.Lenght zwraca jak duża jest tablica*/
        for (int i = 0; i < yetAnotherArray.length; i++) {
            System.out.println("Element: " +yetAnotherArray[i]);
        }

        /*możemy stworzyć tablice z dowolnego typu:
        * i przypisywac wartosci tablicy dowolne wartosci*/

        String[] arr = new String[3];
        arr[0] ="Janek"; // dostęp do tablicy po indeksie 1 element
        arr[1]="Asia"; //2 element

        //arr[2] aktualnie ma wartośc null
        for (int i = 0; i<arr.length; i++) {
            System.out.println("Imię " + arr[i]);
        }

        /*częsty błąd programistów
        *  gdy wyjdziemy za zakres tablicy dostaniemy wyjatek: ArrayIndexOutOfBoundsException, program się zakończy
        * for (int i = 0; i<=arr.length; i++) {
            System.out.println("Imię " + arr[i]);
        }*/


    }
}