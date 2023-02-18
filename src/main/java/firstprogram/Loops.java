package firstprogram;

public class Loops {
    public static void main(String[] args) {

        for (int j = -2; j <= 4; j++) {
            System.out.println("Wartość j " +j);
        }
        for (int i=5; i<10; i++){
            System.out.println("Wartosć i " +i);
        }
        //i to zmienna tymczasowa licznik
        // i=0; - stan na początku pętli
        //i<10; dopóki warunek jest spełniony pętla będzie wykonywana
        //i++ zmiana wartości na końcu każdej iteracji

        //pytanie, jak odwórócić pętle


        //pętla while, gdy nie wiemy ile razy trzeba wykonać jakąś czynność
        int i = 0;
        while (i<10){
           //sami musimy dbać o licznik,
            System.out.println(i++);
        }
        System.out.println("wartość i: "+i);

        do {
            System.out.println(i--);
        }while (i>0);
        System.out.println("wartość i: "+i);



    }
}