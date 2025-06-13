import java.sql.*;
import java.util.*;

public class BookingInsertion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your database name
        String user = "root"; // Replace with your MySQL username
        String password = "your_password"; // Replace with your MySQL password

        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(1, "Flight", "Alice", "Flight AA123", "Confirmed"));
        bookings.add(new Booking(2, "Hotel", "Bob", "Taj Palace", "Pending"));
        bookings.add(new Booking(3, "Cab", "Charlie", "Uber - Delhi", "Confirmed"));

        String insertQuery = "INSERT INTO bookings (id, type, customerName, details, status) VALUES (?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(insertQuery)) {

                for (Booking b : bookings) {
                    stmt.setInt(1, b.getId());
                    stmt.setString(2, b.getType());
                    stmt.setString(3, b.getCustomerName());
                    stmt.setString(4, b.getDetails());
                    stmt.setString(5, b.getStatus());
                    stmt.executeUpdate();
                }

                System.out.println("3 bookings inserted successfully!");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}