package Part.Super;

//        (klasa reprezentująca jabłko, dziedzicząca po klasie Fruit). Posiada pole przechowujące informację o odmianie.
//        W klasie zdefiniuj konstruktor, który pozwoli ustawić wagę i odmianę jabłka.
//        Typ owocu powinien być zawsze ustawiany na "jabłkowaty".
//        Nadpisz metodę getInfo(), która zwróci napis zawierający informacje o typie owocu, wadze i odmianie jabłka.
public class Apple extends Fruit {
    private String strain;

    public Apple(double weight,  String strain) {
        super(weight, "jabłkowaty");
        this.strain = strain;
    }

    public String getInfo() {
        return super.getInfo() + " odmiana: " + strain;
    }
}
