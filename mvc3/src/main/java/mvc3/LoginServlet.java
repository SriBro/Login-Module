package mvc3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        LoginDAO dao = new LoginDAO();

        // Validate the username and password
        if (dao.isValidUser(user)) {
            // Successful login
            response.sendRedirect("success.jsp");
        } else {
            // Invalid credentials
            response.sendRedirect("error.jsp");
        }
    }

  //  private boolean isValidCredentials(String username, String password) {
//        // Perform your validation logic here
//        // This is just a sample validation, replace it with your actual implementation
//        return username.equals("admin") && password.equals("password");
//    }
}
