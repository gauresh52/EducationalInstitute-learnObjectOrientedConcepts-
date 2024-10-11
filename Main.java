import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InstitutionManager manager = new InstitutionManager();
        String filePath = "finalData.csv"; // Replace with your CSV file path
        manager.loadInstitutions(filePath);

        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nEducational Institution Management System");
            System.out.println("1. Display all institutions");
            System.out.println("2. Search institution by name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manager.displayInstitutions();
                    break;
                case 2:
                    System.out.print("Enter institution name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchInstitutionByName(searchName);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
