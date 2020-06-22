package Part.Super;

//        W klasie GroceryShop (sklep spożywczy)
//        utwórz obiekt klasy Apple i wyświetl informacje pobrane przy pomocy metody getInfo().
//        Waga: 220g, typ: jabłkowate, odmiana: szampion


public class GroceryShop {
    public static void main(String[] args) {
        Apple apple1 = new Apple(220, "szampan");
        Apple apple2 = new Apple(430, "kosztela");
        System.out.println(apple1.getInfo());
        System.out.println(apple2.getInfo());
    }
}
