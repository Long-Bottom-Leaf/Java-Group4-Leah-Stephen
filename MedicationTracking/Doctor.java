package MedicationTracking;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, int age, String phoneNumber, String specialization) {
        super(name, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Accessors
    public String getSpecialization() {
        return specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    // Mutator
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }
}
