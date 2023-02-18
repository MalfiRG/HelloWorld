package firstprogram;

public class Car {
    String model;
/*Private
* */
    private String producer;

    public Car() {

    }

    public Car(String someModel) {
        this.model = someModel;
    }

//    getter method, ktora zwraca na zewnątrz pole z klasy
    /*Wydobywa klase private*/
//    chcemy móc zwrócic producenta, musimy stworzyć do tego metodę
    public String getProducer(){
//        zwraca nam na zewnątrz pole "producer"
        return producer;
    }

    //    setter ustawia wartość pola w klasie
    public void setProducer(String producer) {
//        this oznacza producer z zewnątrz klasy
        this.producer = producer;
    }
}
