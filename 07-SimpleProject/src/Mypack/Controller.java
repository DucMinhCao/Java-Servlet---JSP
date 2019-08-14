package Mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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

		List<Users> list = (List<Users>) Bean.ExportUsers();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Simple Application</title>");
		out.println("<style>");
		//out.println("table {border: 2px solid #000000; border-collapse: collapse}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border = 1>");
		for(Users tempUsers : list) {
			out.println("<tr>");
			out.println("<td>" + tempUsers.getName() +"</td>");
			out.println("<td>" + tempUsers.getWork() +"</td>");
			out.println("<td>" + tempUsers.getAddress() +"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
