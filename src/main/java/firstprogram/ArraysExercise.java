package firstprogram;

public class ArraysExercise {
    public static void main(String[] args) {
        /*zad1
        *Napisz program, który tworzy dwie tablice liczb całkowitych o rozmiarze 5 i łączy je w jedną większą tablicę.
        * Tablice powinny być wypełnione wybranymi przez was liczbami */

        //W powyższym programie tworzone są dwie tablice liczb całkowitych o rozmiarze 5 - array1 i array2,
        int[] array1 = new int[]{1, 45, 64, 76, 87};
        int[] array2 = new int[]{23, 25, 65, 75, 333};

        //następnie tworzona jest nowa tablica o rozmiarze 10 - joinedArray.

        int[] jointArray = new int[10];
        // można zrobić 3 tablice, która miałaby 10 elementów


        //Następnie zawartość array1 jest kopiowana do joinedArray w pętli for,
        //i to jest numer indeksu o wartosci 1
        for (int i = 0; i < array1.length; i++) {
            jointArray[i] = array1[i];
        }
        //następnie zawartość array2 jest kopiowana w kolejnej pętli for, rozpoczynając od pozycji array1.length w joinedArray.
        for (int i = 0; i < array2.length; i++) {
            jointArray[array1.length+i] = array2[i];
        }
        //Na końcu programu wyświetlana jest zawartość połączonej tablicy joinedArray za pomocą pętli for-each, która iteruje po kolejnych elementach tablicy i wyświetla ich wartości.
        System.out.println("Joint Table: ");
        for (int element : jointArray) {
            System.out.println(element + " ");
        }
    }
}
