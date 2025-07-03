import java.util.Scanner;

public class CustomerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCustomer Data Management System");
            System.out.println("1. Add Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CustomerDAO.addCustomer(scanner);
                    break;
                case 2:
                    CustomerDAO.getAllCustomers();
                    break;
                case 3:
                    CustomerDAO.updateCustomer(scanner);
                    break;
                case 4:
                    CustomerDAO.deleteCustomer(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
