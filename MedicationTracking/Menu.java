package MedicationTracking;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        MedicationTracking system = new MedicationTracking();
        boolean exit = false;

        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            
            System.out.println("=====Welcome To The Pharmacy Med Tracking System=====");
            System.out.println("What would you like to do? ");
            System.out.println("1: Add A New Patient");
            System.out.println("2: Add A New Doctor");
            System.out.println("3: Add A New Medication To The Pharmacy");
            System.out.println("4: Print System Report");
            System.out.println("5: Check If Meds Are Expired");
            System.out.println("6: Process A New Prescription");
            System.out.println("7: Print All Scripts For Specific Doctor");
            System.out.println("8: Restock the drugs in the pharmacy");
            System.out.println("9: Print all scripts for specific patient");
            System.out.println("10: Exit");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (option) {
                case 1:
                    addANewPatient(scanner, system);
                    break;
                case 2:
                    addANewDoctor(scanner, system);
                    break;
                case 3:
                    addNewMedicationToPharmacy(scanner, system);
                    break;
                case 4:
                    printPharmacyReport(system);
                    break;
                case 5:
                    checkExpiredMeds(system);
                    break;
                case 6:
                    processANewScript(scanner, system);
                    break;
                case 7:
                    printScriptsForSpecificDoctor(scanner, system);
                    break;
                case 8:
                    restockPharmacyDrugs(scanner, system);
                    break;
                case 9:
                    printAllScriptsForPatientByName(scanner, system);
                    break;
                case 10:
                    exit = true;
                    System.out.println("Exiting The System! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        scanner.close();
    }

    private static void printAllScriptsForPatientByName(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        Patient patient = system.searchPatientName(patientName);


    }

    private static void restockPharmacyDrugs(Scanner scanner, MedicationTracking system) {
        // TODO: implement
    }

    private static void printScriptsForSpecificDoctor(Scanner scanner, MedicationTracking system) {
        // TODO: implement
    }

    private static void processANewScript(Scanner scanner, MedicationTracking system) {
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        Patient patient = system.searchPatientName(patientName);

        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();
        Doctor doctor = system.searchDoctorName(doctorName);

        System.out.print("Enter medication name: ");
        String medName = scanner.nextLine();
        Medication med = system.searchMedName(medName);

        LocalDate expiry = LocalDate.now().plusYears(1);

        Prescription prescription = new Prescription(doctor, patient, med, expiry);

        system.addScriptToPatient(patient, prescription);

        System.out.println("Prescription added successfully!");
    }

    private static void checkExpiredMeds(MedicationTracking system) {
        // TODO: implement
    }

    private static void printPharmacyReport(MedicationTracking system) {
        // TODO: implement
    }

    private static void addNewMedicationToPharmacy(Scanner scanner, MedicationTracking system) {
        // TODO: implement
    }

    private static void addANewDoctor(Scanner scanner, MedicationTracking system) {
        // TODO: implement
    }

    private static void addANewPatient(Scanner scanner, MedicationTracking system) {
        // TODO: implement
    }
}
