package Part.Polimorfizm;

public class HospitalApp {


    public static void main(String[] args) {
        Person doktor1 = new Doctor("Zenon", "Kowalski", 5000, 1200);
        Person piel1 = new Nurse("zofia", "Frania", 3000, 50);
        Person piel2 = new Nurse("Jadwiga", "Kowalska",2500,12);
        Hospital hospital = new Hospital();
        hospital.add(doktor1);
        hospital.add(piel1);
        hospital.add(piel2);
        System.out.println(hospital.print());
    }
}
