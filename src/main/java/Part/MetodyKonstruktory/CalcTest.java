package Part.MetodyKonstruktory;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(3,5));
        System.out.println(calc.sub(5,3));
        System.out.println(calc.multi(3,5));
        System.out.println(calc.div(9,3));
        System.out.println(calc.add(10,5));
        System.out.println(calc.sub(10,5));
        System.out.println(calc.div(3,0));
    }
}
