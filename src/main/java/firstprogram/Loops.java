package firstprogram;

public class Loops {
    public static void main(String[] args) {

        for (int j = -2; j <= 4; j++) {
            System.out.println("Wartość j " +j);
        }
        for (int i=1; i<10; i++){
            System.out.println("Wartosć i " +i);
        }
        //i to zmienna tymczasowa licznik
        // i=0; - stan na początku pętli
        //i<10; dopóki warunek jest spełniony pętla będzie wykonywana
        //i++ zmiana wartości na końcu każdej iteracji

        // tutaj idziemy co 2
        {for (int i=1; i<10; i+=2){
            System.out.println("Wartosć i " +i);}}

//        pętla nieskończona
        /*{for (int i=1; i<10; i=2){
            System.out.println("Wartosć i " +i);}}*/

        //pytanie, jak odwórócić pętle

        {for (int i=10; i<10; i--){
            System.out.println("Wartosć i " +i);}}

        //pętla while, gdy nie wiemy ile razy trzeba wykonać jakąś czynność
        int i = 0;
        while (i<10){
           //sami musimy dbać o licznik,
            System.out.println(i);
            i += 2;
            i++;
        }
        System.out.println("wartość i: "+i);
        i = 3;
        do {
            System.out.println("Początek");
            System.out.println("Nie " +i--);
        }while (i>0);
        /* Dopóki warunek i>0 będzie spełniony, pętla będzie sie wykonywać
        * Różnica pomiędzy pętlą while jest taka, że pętla do while wykona się co najmniej raz
        * Warunke będzie sprawdzony po tym, jak pętla wykona sie jeszcze raz*/

        System.out.println("wartość i: "+i);

        // instrukcje break i continue
        for (int k = 0; k < 5; k++) {
            if (k == 1 || k == 2) {
                continue;
            }
            System.out.println("Continue " + k);
        }
        // instrukcja break
        for (int k = 0; k < 5; k++) {
            if (k == 1 || k == 2) {
                break;
            }
            System.out.println("Break " + k);
        }




    }
}