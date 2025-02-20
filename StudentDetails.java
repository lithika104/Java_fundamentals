import java.util.Scanner;

public class StudentDetails {

    
    public static void displayDetails(String name, String regNo) {
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + regNo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the registration number: ");
        String regNo = scanner.nextLine();

        
        scanner.close();
    }
}


   