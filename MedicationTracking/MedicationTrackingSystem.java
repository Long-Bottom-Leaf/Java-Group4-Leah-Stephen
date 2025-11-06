import java.util.ArrayList;
import java.util.List;

/**
 * Central management class for the pharmacy medication tracking system.
 * Maintains lists of doctors, patients, medications, and prescriptions,
 * and provides methods for searching, adding, and linking them.
 */
public class MedicationTrackingSystem {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Medication> medications;
    private List<Prescription> prescriptions;

    /** Constructs an empty MedicationTrackingSystem with no records. */
    public MedicationTrackingSystem() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        medications = new ArrayList<>();
        prescriptions = new ArrayList<>();
    }

    /**
     * Searches for a doctor by name.
     *
     * @param name the doctor's name
     * @return the Doctor object if found, otherwise null
     */
    public Doctor searchDoctorName(String name) {
        for (Doctor d : doctors) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    /**
     * Searches for a patient by name.
     *
     * @param name the patient's name
     * @return the Patient object if found, otherwise null
     */
    public Patient searchPatientName(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Searches for a medication by name.
     *
     * @param name the medication name
     * @return the Medication object if found, otherwise null
     */
    public Medication searchMedName(String name) {
        for (Medication m : medications) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    /**
     * Adds a patient to a specific doctor's list, creating an association between them.
     *
     * @param docName the name of the doctor
     * @param patient the patient to assign
     */
    public void addPatientToDoc(String docName, Patient patient) {
        Doctor doctor = null;
        for (Doctor d : doctors) {
            if (d.getName().equalsIgnoreCase(docName)) {
                doctor = d;
                break;
            }
        }

        if (doctor != null) {
            doctor.getPatients().add(patient);
            patients.add(patient);
        } else {
            System.out.println("Error: Doctor not found.");
        }
    }

    /**
     * Adds a prescription to a patient and to the system list.
     *
     * @param patient      the patient receiving the prescription
     * @param prescription the prescription object
     */
    public void addScriptToPatient(Patient patient, Prescription prescription) {
        if (patient != null && prescription != null) {
            patient.getPrescriptions().add(prescription);
            prescriptions.add(prescription);
        } else {
            System.out.println("Error: Patient/Prescription invalid.");
        }
    }
}
