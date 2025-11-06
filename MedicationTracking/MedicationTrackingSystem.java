import java.util.ArrayList;
import java.util.List;

public class MedicationTrackingSystem {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Medication> medications;
    private List<Prescription> prescriptions; 

    // Constructor
    public MedicationTrackingSystem() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        medications = new ArrayList<>();
        prescriptions = new ArrayList<>();
    }

    public Doctor searchDoctorName(String name) {
        for (Doctor d : doctors) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public Patient searchPatientName(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Medication searchMedName(String name) {
        for (Medication m : medications) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }   

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

    public void addScriptToPatient(Patient patient, Prescription prescription) {
        if (patient != null && prescription != null) {
            patient.getPrescriptions().add(prescription);
            prescriptions.add(prescription);
        } else {
            System.out.println("Error: Patient/Prescription invalid.");
        }
    }
}
