import java.time.LocalDate;

public class MedicationTrackingTest {
    public static void main(String[] args) {
        // Initialize system
        MedicationTrackingSystem system = new MedicationTrackingSystem();

        // Create test doctors
        Doctor doc1 = new Doctor("Dr. Alice Smith", 45, "555-1234", "Cardiology");
        Doctor doc2 = new Doctor("Dr. Bob Johnson", 50, "555-9876", "Neurology");

        // Create test patients
        Patient pat1 = new Patient("Jimmy John", 28, "555-0022");
        Patient pat2 = new Patient("Susan Monroe", 34, "555-2266");

        // Create test medications
        Medication med1 = new Medication("Amoxicillin", "500mg", 50, LocalDate.of(2026, 6, 1));
        Medication med2 = new Medication("Ibuprofen", "200mg", 200, LocalDate.of(2025, 1, 15));

        // Add to system
        system.addDoctor(doc1);
        system.addDoctor(doc2);
        system.addPatient(pat1);
        system.addPatient(pat2);
        system.addMedication(med1);
        system.addMedication(med2);

        // Assign a patient to a doctor
        system.addPatientToDoc(doc1.name, pat1);
        system.addPatientToDoc(doc2.name, pat2);

        // Issue a prescription
        Prescription presc1 = new Prescription(doc2, pat2, med2, LocalDate.now().plusMonths(6));
        system.addScriptToPatient(pat2, presc1);
        
        Prescription presc2 = new Prescription(doc1, pat1, med1, LocalDate.now().plusMonths(3));
        system.addScriptToPatient(pat1, presc2);

        // Search for a doctor
        Doctor searchDoc = system.searchDoctorName("Dr. Alice Smith");

        // Search for a patient
        Patient searchPat = system.searchPatientName("Jimmy John");

        // Search for a medication
        Medication searchMed = system.searchMedName("Ibuprofen");

        // Run test outputs
    }

}
