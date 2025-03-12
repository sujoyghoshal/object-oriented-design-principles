class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting Patient " + patient.name);
    }
}

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}

public class HospitalAssociation {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Dr. Alice");
        Doctor doc2 = new Doctor("Dr. Bob");

        Patient p1 = new Patient("John");
        Patient p2 = new Patient("Emily");

        doc1.consult(p1);
        doc1.consult(p2);
        doc2.consult(p1);
    }
}
