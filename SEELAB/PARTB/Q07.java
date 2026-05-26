import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/StudentDB",
                "root",
                "root"
            );

            // SQL Query
            String query = "SELECT * FROM StudentInfo";

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery(query);

            // Display Records

            System.out.println("Student Details\n");

            while(rs.next()) {

                System.out.println(
                    "Roll No : " +
                    rs.getInt("RollNo"));

                System.out.println(
                    "Name : " +
                    rs.getString("Name"));

                System.out.println(
                    "USN : " +
                    rs.getString("USN"));

                System.out.println(
                    "Division : " +
                    rs.getString("Division"));

                System.out.println(
                    "---------------------------");
            }

            // Close Connection
            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}
