import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/EmployeeDB",
                "root",
                "root"
            );

            // SQL Query
            String query = "SELECT * FROM EmployeeInfo";

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery(query);

            // Display Records

            System.out.println("Employee Details\n");

            while(rs.next()) {

                System.out.println(
                    "Employee ID : " +
                    rs.getInt("EmpID"));

                System.out.println(
                    "Name : " +
                    rs.getString("Name"));

                System.out.println(
                    "Department : " +
                    rs.getString("Department"));

                System.out.println(
                    "Salary : " +
                    rs.getDouble("Salary"));

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
