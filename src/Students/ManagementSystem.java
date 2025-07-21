package Students;

import java.util.Map;
import java.util.Scanner;

public class ManagementSystem {
    private final Scanner sc = new Scanner(System.in);
    public Map<Integer, Student> studentsMap;

    private final CSVManager csvManager = new CSVManager();

    public ManagementSystem () {
        studentsMap = csvManager.loadStudentsData();
    }

    public void start() {
//        studentsMap = csvManager.loadStudentsData();
        System.out.println("<< Welcome to your Students Management System >>");

        while(true) {
            System.out.println("\n1. Add Student" +
                    "\n2. View All Students" +
                    "\n3. Search Student" +
                    "\n4. Update Student" +
                    "\n5. Delete Student" +
                    "\n6. Exit\n");
            System.out.println("Please provide the action to perform");
            String userIp = sc.nextLine();

            try {
                int typeChangedUserIp = Integer.parseInt(userIp);

                switch (typeChangedUserIp) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        viewAllStudents();
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                        updateStudent();
                        break;
                    case 5:
                        deleteStudent();
                        break;
                    case 6:
//                        saveToFile(); //saving data before exiting...
                        System.out.println("Closing the management system...");
//                        System.exit(0);
                        return;
                    default:
                        System.out.println("Invalid action performed");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }
    }

    private void addStudent() {
        System.out.println("Enter Student's Id.");
        int nsId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student's Name");
        String nsName = sc.nextLine();

        System.out.println("Enter Student's Age");
        int nsAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student's Subjects");
        String[] nsSubjects = new String[]{sc.nextLine()};

        Student nStudent = new Student(nsId, nsName, nsAge, nsSubjects);
        studentsMap.put(nsId, nStudent);

        System.out.println("New student added & saved");
    }

    private void viewAllStudents() {
        if(studentsMap.isEmpty()) {
            System.out.println("No students in the management records");
        }
        for (Student student : studentsMap.values()) {
            System.out.println(student);
        }
    }

    private void searchStudent() {

    }

    private void updateStudent() {

    }

    private void deleteStudent() {

    }
}
