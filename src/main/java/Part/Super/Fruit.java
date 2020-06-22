package Part.Super;

//        Napisz program, w którym stworzysz prostą hierarchię klas reprezentujących owoce w sklepie.
//        Powinny istnieć co najmniej dwie klasy:
//
//        Fruit (klasa nadrzędna), która pozwala przechowywać wagę (w gramach) oraz typ owocu (np. egzotyczny, jagodowy, jabłkowaty).
//        Klasa powinna posiadać konstruktor pozwalający ustawić oba pola oraz metodę getInfo(),
//        która zwraca informację o owocu w postaci Stringa.
//
//        Apple (klasa reprezentująca jabłko, dziedzicząca po klasie Fruit).
//        Posiada pole przechowujące informację o odmianie. W klasie zdefiniuj konstruktor,
//        który pozwoli ustawić wagę i odmianę jabłka. Typ owocu powinien być zawsze ustawiany na "jabłkowaty".
//        Nadpisz metodę getInfo(), która zwróci napis zawierający informacje o typie owocu, wadze i odmianie jabłka.
//
//        Zarówno w konstruktorze jak i metodzie getInfo() wykorzystaj słowo super.
//
//        W klasie GroceryShop (sklep spożywczy) utwórz obiekt klasy Apple i wyświetl informacje pobrane przy pomocy metody getInfo().
//
//        Przykładowe wyjście programu:
//
//        Waga: 220g, typ: jabłkowate, odmiana: szampion

public class Fruit {
    private double weight;
    private String type;

    public Fruit(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getInfo() {
        return "waga: " + weight + "g, typ: " + type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
