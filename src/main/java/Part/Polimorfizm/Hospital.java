package Part.Polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Person> employee = new ArrayList<>();

    public void add(Person person) {
        employee.add(person);
    }

    public String print() {
        String stringBack = "";
        String stringPart;
        for (Person person : employee) {
            if (person instanceof Doctor) {
                stringPart = "imię: " + person.getFirstName() + ", nazwisko: "
                        + person.getLastName() + ", zarobki: " + person.getSalary()
                        + ", premia: " + ((Doctor) person).getBonus();
            } else {
                stringPart = "nimię: " + person.getFirstName() + ", nazwisko: "
                        + person.getLastName() + ", zarobki: " + person.getSalary()
                        + ", nadgodziny: " + ((Nurse) person).getOvertime();
            }
            stringBack += stringPart + "\n";
        }
        return stringBack;
    }
}