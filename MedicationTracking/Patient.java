import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private List<Medication> medicationIds;
    private List<Prescription> prescriptionIds;
    
    public Patient(Int id, String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
        this.medicationIds = new ArrayList<>();
        this.prescriptionIds = new ArrayList<>();
    }

    // Accessors
    public List<Medication> getMedicationIds() {
        return medicationIds;
    }

    public List<Prescription> getPrescriptionIds() {
        return prescriptionIds;
    }

    // add medication
    public void addMedication(Medication medication) {
        this.medicationIds.add(medication);
    }

    public void addPrescription(Prescription prescription) {
        this.prescriptionIds.add(prescription);
    }

}
