import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register.staff")
public class registerStaffServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staff_username = request.getParameter("STAFF_USERNAME");
        String staff_id = request.getParameter("STAFFID");
        String staff_email = request.getParameter("STAFF_EMAIL");
        

        // Perform form validation

        // Store user registration data in the database
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app",
                "app")) {
            String sql = "INSERT INTO STAFF (STAFF_USERNAME, STAFFID, STAFF_EMAIL) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, staff_username);
            statement.setString(2, staff_id);
            statement.setString(3, staff_email);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Redirect to a success page or login page
        response.sendRedirect("adminHome.jsp");
    }
}
