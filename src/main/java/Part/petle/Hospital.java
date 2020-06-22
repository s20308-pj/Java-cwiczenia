package Part.petle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    Scanner scanner = new Scanner(System.in);
    private List<Patient> hospitalQuene = new ArrayList<>();
    private int nuberPatient = 0;

    public void addPatient() {
        if (checkQuene()) {
            System.out.println("podaj imię pacjęta: \n");
            String firstName = scanner.nextLine();
            System.out.println("podaj nazwisko pacjęta: \n");
            String lastName = scanner.nextLine();
            System.out.println("podaj pesel pacjęta: \n");
            String pesel = scanner.nextLine();
            hospitalQuene.add(new Patient(firstName, lastName, pesel));
            this.nuberPatient++;
        } else {
            System.out.println("limit wyczerpany");
        }
    }

    public void printPatient() {
        int i = 0;
        for (Patient patient : hospitalQuene) {
            System.out.println(++i + ". " + patient.getFirstName() + "\t" + patient.getLastName() + "\t" + patient.getPeselNumber());
        }
    }

    private boolean checkQuene() {
        return (nuberPatient < 10);
    }
}
