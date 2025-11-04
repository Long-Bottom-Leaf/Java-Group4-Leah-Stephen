package MedicationTracking;

import java.util.concurrent.atomic.AtomicInteger;
import java.time.LocalDate;

public class Prescription {
    private static final AtomicInteger ID_GEN = new AtomicInteger(0);
    private final int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate expirationDate;

    public Prescription(Doctor doctor, Patient patient, Medication medication, LocalDate expirationDate) {
        this.id = ID_GEN.getAndIncrement();
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.expirationDate = expirationDate;
    }

    // Accessors
    public int getID() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
