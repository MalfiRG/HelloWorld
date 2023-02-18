package firstprogram;

//przysłanianie - zmienna zadeklarowana w lokalnie "przysłania" zmienną zadeklarowaną lokalnie
public class ShadowingEx {
     /*mozna tworzyć zmienne bezpośrednie po nazwie klasy
     * takie zmienne nazywają sie zmiennymi globalnymi
      * tworząc zmienną tutaj, ona jest widoczna w całej metodzie main i w calej klasie
     * */
    static int age;
    /* zmienna globalna age;
    * Nie jest istotne że jest zmienna static;
    * Ważne jest to, że zmienna int jest POZA public static void main, DLATEGO JEST GLOBALNA */
    public static void main(String[] args) {
      age = 2;
      int age =3;
        age = 4;
      /* Można stworzyc zmienną lokalną wewnątrz bloku, która bedzie nazywała się tak samo jak globalna.
      * W takie sytuacji posługując się nazwą tej zmiennej, wenwątrz tego bloku
      * będziemy mieli wartość zmiennej lokalne
      * Shadowing - przesłanianie */
        System.out.println(age);
    }
}