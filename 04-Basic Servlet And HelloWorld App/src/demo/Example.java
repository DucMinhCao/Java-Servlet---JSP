package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Example")
public class Example extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Example() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\"");
		out.println("<title>Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table style=\"border: solid 2px #000000;\">");
		out.println("<tr>");
		out.println("<td>STT</td>");
		out.println("<td>Ho Va Ten</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html");
	}

}
