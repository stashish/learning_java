package Students;

import java.util.Scanner;

public class ManagementSystem {
    public void start() {
        Scanner sc = new Scanner(System.in);
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
                        saveToFile(); //saving data before exiting...
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

    private static void addStudent() {

    }

    private static void viewAllStudents() {

    }

    private static void searchStudent() {

    }

    private static void updateStudent() {

    }

    private static void deleteStudent() {

    }

    private static void saveToFile() {

    }
}
