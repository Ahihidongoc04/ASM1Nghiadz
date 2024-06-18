/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nghianghia;
import java.util.Scanner;
/**
 *
 * @author Nghia deep try
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentInformationSystem nghia = new StudentInformationSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            nghia.addStudent(new Student(id, name, marks));
        }

        System.out.println("\nStudent Details and Rankings:");
        for (Student student : nghia.getStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Marks: " + student.getMarks() + ", Ranking: " + student.getRanking());
        }

        // Example of sorting students by marks
        nghia.sortStudents();
        System.out.println("\nSorted Students by Marks:");
        for (Student student : nghia.getStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Marks: " + student.getMarks() + ", Ranking: " + student.getRanking());
        }

        // Example of searching for a student by ID
        System.out.print("\nEnter Student ID to search: ");
        String searchId = scanner.nextLine();
        Student foundStudent = nghia.searchStudentById(searchId);
        if (foundStudent != null) {
            System.out.println("Found Student - ID: " + foundStudent.getId() + ", Name: " + foundStudent.getName() + ", Marks: " + foundStudent.getMarks() + ", Ranking: " + foundStudent.getRanking());
        } else {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
    }
    

