package Controller;

import Bean.Users;
import DAO.RegisterDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
        String name = request.getParameter("username");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String province = request.getParameter("selectedProvince");

        Users user = new Users();
        user.setName(name);
        user.setAddress(address);
        user.setEmail(email);
        user.setPhone(phone);
        user.setProvince(province);

        boolean isInserted = RegisterDAO.save(user);
        String message = "";
        if (isInserted) {
            message = "Register Successful";
        } else {
            message = "Register Failed";
        }
        request.setAttribute("message", message);
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
