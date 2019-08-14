package Mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Controller() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
	
		try {
			int a = Integer.parseInt(request.getParameter("firstnumber"));
			int b = Integer.parseInt(request.getParameter("secondnumber"));
			int res = a + b;
			out.println("<p style=\"height: 50px; width: 50px; margin: 250px auto; font-size: 20px\">" + res + "</p>");
		} catch (Exception e) {
			out.println("<h1>Invalid input, Please go back and input again !!!</h1>");
		}
		out.close();
	}

}
