package Part.one;

public class OperacjeNaZmiennych {
    public static void main(String[] args) {
        int x = 21;
        int y = 31;

        System.out.println("czy X jest większe od Y: " + (x>y));
        System.out.println("czy 2*X jest większe od Y: " + (2*x>y));
        System.out.println("czy X jest większe od y: " + (x>(y+3)));
        System.out.printf("czy X*Y (%d) jest parzysty: %b",x*y,(x*y)%2==0);
    }
}
