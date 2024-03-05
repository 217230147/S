import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
// Main.java 
public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        List<Student> students = new ArrayList<>(); 
        while (true) {
            System.out.println("Enter student ID (or 'done' to finish):"); 
            String studentID = scanner.nextLine().trim(); 
            if (studentID.equalsIgnoreCase("done")) { 
                break; 
            } 
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine().trim(); 
            System.out.println("Enter the number of extra activities:");
            int numExtraActivities = scanner.nextInt(); scanner.nextLine();
            // Consume the newline left after nextInt() 
            Student student = new Student(studentID, studentName, numExtraActivities); 
            for (int i = 0; i < numExtraActivities; i++) { 
                System.out.println("Enter extra activity #" + (i + 1) + ":");
                String activity = scanner.nextLine().trim();
                student.addExtraActivity(i, activity); 
            }
                students.add(student);
        } 
        // Display student details 
        for (Student student : students) {
            System.out.println(student); 
        } 
            scanner.close(); 
    } 
}