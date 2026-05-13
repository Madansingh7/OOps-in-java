import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/LibraryDB",
                "root",
                "root"
            );

            // SQL Query
            String query = "SELECT * FROM BookInfo";

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery(query);

            // Display Records
            while(rs.next()) {

                System.out.println("ISBN : " + rs.getInt("ISBN"));
                System.out.println("Title : " + rs.getString("Title"));
                System.out.println("Author : " + rs.getString("Author"));
                System.out.println("Price : " + rs.getDouble("Price"));

                System.out.println("----------------------");
            }

            // Close Connection
            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}
