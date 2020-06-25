package Part.MetodyKonstruktory;

public class Calc {
    double add(double a, double b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double multi(double a, double b) {
        return a * b;
    }

    double div(double a, double b) {
        if (b == 0) {
            System.out.println("Nie dziel przez 0");
            System.exit(1);
        }
        return a / b;
    }
}
