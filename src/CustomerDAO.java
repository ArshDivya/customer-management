import java.sql.*;
import java.util.Scanner;

public class CustomerDAO {
    public static void addCustomer(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Order History: ");
        String orderHistory = scanner.nextLine();

        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            try {
                String query = "INSERT INTO customers (name, email, phone, address, order_history) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, phone);
                stmt.setString(4, address);
                stmt.setString(5, orderHistory);
                stmt.executeUpdate();
                System.out.println("Customer added successfully.");
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getAllCustomers() {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM customers");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
                            ", Email: " + rs.getString("email") + ", Phone: " + rs.getString("phone") +
                            ", Address: " + rs.getString("address") + ", Order History: " + rs.getString("order_history"));
                }
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void updateCustomer(Scanner scanner) {
        System.out.print("Enter Customer ID to Update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter New Name: ");
        String name = scanner.nextLine();

        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            try {
                String query = "UPDATE customers SET name=? WHERE id=?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, name);
                stmt.setInt(2, id);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Customer updated successfully.");
                } else {
                    System.out.println("Customer not found.");
                }
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteCustomer(Scanner scanner) {
        System.out.print("Enter Customer ID to Delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            try {
                String query = "DELETE FROM customers WHERE id=?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setInt(1, id);
                int rowsDeleted = stmt.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Customer deleted successfully.");
                } else {
                    System.out.println("Customer not found.");
                }
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
