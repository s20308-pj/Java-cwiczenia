package Part.Perzeciazanie;

public class Calculator {
    void add(int a, int b) {
        System.out.printf("%d + %d = %d %n", a, b, a + b);
    }

    void add(double a, double b) {
        System.out.printf("%5.2f + %5.2f = %5.3f%n", a, b, a + b);
    }

    void add(int a, int b, int c) {
        System.out.printf("%d - %d - %d = %d%n", a, b, c, a + b + c);
    }

    void sub(int a, int b) {
        System.out.printf("%d + %d = %d %n", a, b, a - b);
    }

    void sub(double a, double b) {
        System.out.printf("%2.2f - %2.2f = %.3f%n", a, b, a - b);
    }

    void sub(int a, int b, int c) {
        System.out.printf("%d - %d - %d = %d%n", a, b, c, a - b - c);
    }
}
