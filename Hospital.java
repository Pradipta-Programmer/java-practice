import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private static ArrayList<Doctor> doctors;
    private static ArrayList<Appointment> appointments;

    public static void main(String[] args) {
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();

        // Creating doctors list with timings
        Doctor doctor1 = new Doctor("Dr. John Doe", "9:00 AM - 1:00 PM");
        Doctor doctor2 = new Doctor("Dr. Jane Smith", "2:00 PM - 6:00 PM");

        doctors.add(doctor1);
        doctors.add(doctor2);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Hospital Management System");
            System.out.println("===========================");
            System.out.println("1. Book an Appointment");
            System.out.println("2. View Doctors List");
            System.out.println("3. Generate Billing");
            System.out.println("4. View Appointments");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    bookAppointment(scanner);
                    break;
                case 2:
                    viewDoctorsList();
                    break;
                case 3:
                    generateBilling();
                    break;
                case 4:
                    viewAppointments();
                    break;
                case 5:
                    System.out.println("Thank you for using the Hospital Management System!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 5);
    }

    private static void bookAppointment(Scanner scanner) {
        System.out.println("Doctors List:");
        System.out.println("=============");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". " + doctors.get(i).getName() + " (" + doctors.get(i).getTiming() + ")");
        }

        System.out.print("Choose a doctor (enter the number): ");
        int doctorChoice = scanner.nextInt();
        scanner.nextLine();

        if (doctorChoice < 1 || doctorChoice > doctors.size()) {
            System.out.println("Invalid doctor choice. Please try again.");
            return;
        }

        Doctor chosenDoctor = doctors.get(doctorChoice - 1);

        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        System.out.println("Appointment booked for " + patientName + " with " + chosenDoctor.getName() + ".");

        Appointment appointment = new Appointment(patientName, chosenDoctor);
        appointments.add(appointment);
    }

    private static void viewDoctorsList() {
        System.out.println("Doctors List:");
        System.out.println("=============");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName() + " (" + doctor.getTiming() + ")");
        }
    }

    private static void generateBilling() {
        System.out.println("Appointments:");
        System.out.println("=============");
        for (Appointment appointment : appointments) {
            System.out.println("Patient: " + appointment.getPatientName());
            System.out.println("Doctor: " + appointment.getDoctor().getName());
            // Add more billing details if needed
            System.out.println("Billing: " + appointment.getDoctor().getFees());
            System.out.println("===========================");
        }
    }

    private static void viewAppointments() {
        System.out.println("Appointments:");
        System.out.println("=============");
        for (Appointment appointment : appointments) {
            System.out.println("Patient: " + appointment.getPatientName());
            System.out.println("Doctor: " + appointment.getDoctor().getName());
            System.out.println("Timing: " + appointment.getDoctor().getTiming());
            System.out.println("===========================");
        }
    }
}

class Doctor {
    private String name;
    private String timing;
    private double fees;

    public Doctor(String name, String timing) {
        this.name = name;
        this.timing = timing;
        this.fees = 0.0; // Initialize fees to 0
    }

    public String getName() {
        return name;
    }

    public String getTiming() {
        return timing;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}

class Appointment {
    private String patientName;
    private Doctor doctor;

    public Appointment(String patientName, Doctor doctor) {
        this.patientName = patientName;
        this.doctor = doctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}