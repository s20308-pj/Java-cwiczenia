package Part.Perzeciazanie;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,3);
        calculator.add(2.3,3.2);
        calculator.add(2,3,4);
        calculator.sub(2,3);
        calculator.sub(45676587.368,3.2);
        calculator.sub(2330,3,4);
    }
}
