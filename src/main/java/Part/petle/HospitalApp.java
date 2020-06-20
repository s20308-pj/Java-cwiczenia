package petle;

//Napisz program symulujący system do planowania wizyt w szpitalu. Program powinien składać się z trzech klas:
//
//        Patient - klasa przechowująca dane o pacjencie (imię, nazwisko, PESEL). Klasa powinna być zgodna z konwencją JavaBeans,
//        Hospital - klasa z logiką aplikacji umożliwiająca dopisanie pacjenta do kolejki oraz wyświetlenie wszystkich zapisanych pacjentów,
//        HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 - wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów.
//
//        Ograniczenia:
//
//        Do szpitala może zapisać się co najwyżej 10 pacjentów, przy próbie zapisania kolejnego wyświetlana jest informacja o tym, że limit został już wyczerpany.
//        Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu.

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        boolean exit = false;
        Hospital hospital = new Hospital();
        do {
            System.out.println("wybierz działanie programu: \n 0 - wyjście;\n 1 - dodaj pacjenta;\n 2 - wyswietl liste zapisanych pacjentow;\n");
            input = scanner.nextLine();
            switch (input) {
                case "0":
                    exit=true;
                    break;
                case "1":
                    hospital.addPatient();
                    break;
                case "2":
                    hospital.printPatient();
                    break;
                default:
                    System.out.println("wybierz 0, 1 lub 2");
            }

        } while (!exit);

    }
}
