import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private List<Medication> medicationIds;
    private List<Prescription> prescriptionIds;
    
    public Patient(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    // Accessors
    public List<Medication> getMedications() {
        return medications;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    // add medication
    public void addMedication(Medication medication) {
        this.medicationIds.add(medication);
    }

    public void addPrescription(Prescription prescription) {
        this.prescriptionIds.add(prescription);
    }
}
