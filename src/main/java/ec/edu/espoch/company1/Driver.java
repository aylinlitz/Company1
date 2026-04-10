package ec.edu.espoch.company1;

public class Driver {

    private String firstName;
    private String lastName;
    private String idNumber;
    private String licenseNumber;
    private int yearsOfExperience;

    public Driver() {
        this.firstName = "  ";
        this.lastName = "    ";
        this.idNumber = "    ";
        this.licenseNumber = "   ";
        this.yearsOfExperience = 0;
    }

    public Driver(String firstName, String lastName, String idNumber, String licenseNumber, int yearsOfExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.licenseNumber = licenseNumber;
        this.yearsOfExperience = yearsOfExperience;
    }


    public String FirstName() {
        return firstName;
    }

    public String LastName() {
        return lastName;
    }

    public String IdNumber() {
        return idNumber;
    }

    public String LicenseNumber() {
        return licenseNumber;
    }

    public int YearsOfExperience() {
        return yearsOfExperience;
    }

    public String FullName() {
        return firstName + " " + lastName;
    }

    public void showInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}
}
