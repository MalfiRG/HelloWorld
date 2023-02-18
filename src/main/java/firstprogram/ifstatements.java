package firstprogram;

public class ifstatements {
    public static void main(String[] args) {

//        boolean hungry = false;
//        if (hungry ==true) {
//            System.out.println("Muszę coś zjeść");
//        } else {
//            System.out.println("Nie chce mi się jeść");
//        }
//
////        jeżeli mamy jedną linię do wykonania możemy usunąć nawiasy
//        if (hungry == true) {
//            System.out.println("Muszę coś zjeść");}
//        {
//            else
//
//            System.out.println("Nie chce mi się jeść");
//        }

        int number = 17;
//      nie mamy kodu, który chcemy wykonać dla liczb dodatnich
        if (number < 0) {
            System.out.println("Ujemna");
//            mozemy miec jeden if
        } else if (number == 0) {
            System.out.println("zero");
//            możemy miec dowolna ilosc else if
        } else {
//            ten blok zostanie wykonany dla każdej wartości, która nie pasuje do warunków wyżej
            System.out.println("Dodatnia");
            /*możemy mieć tylko jeden else*/
        }
        /*if może być 1
        * else if dowolna liczba
        * else moze byc 1*/


    }
}
