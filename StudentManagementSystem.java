import java.util.*;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> studentIds = new HashSet<>();
        Map<Integer, String> studentMap = new HashMap<>();

        while (true) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Display Total Student Count");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (studentIds.contains(id)) {
                        System.out.println("Student ID already exists!");
                    } else {
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();
                        studentIds.add(id);
                        studentMap.put(id, name);
                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();

                    if (studentIds.remove(removeId)) {
                        studentMap.remove(removeId);
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    if (studentMap.containsKey(searchId)) {
                        System.out.println("Student Name: " + studentMap.get(searchId));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Student Details:");
                    for (int sid : studentIds) {
                        System.out.println("ID: " + sid + " Name: " + studentMap.get(sid));
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " + studentIds.size());
                    break;

                case 6:
                    System.out.println("Program terminated.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}