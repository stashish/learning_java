import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Welcome to your Students Management System >>");

        while(true) {
            System.out.println("\n1. Add Student\n2. View All Students\n3. Search by student ID\n4. Exit\n");
            System.out.println("Please provide the action to perform");
            int userIp = sc.nextInt();

            switch (userIp) {
                case 1:

                case 2:

                case 3:

                case 4:
                    System.out.println("Closing the management system");
//                    System.exit(0);
                    return;
                case 5:
                    System.out.println("Invalid action performed");
                    break;
                default:
                    System.out.println("Invalid action");
                    break;
            }
        }
    }
}