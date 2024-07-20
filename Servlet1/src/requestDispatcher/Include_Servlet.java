package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Include_Servlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		PrintWriter r=res.getWriter();
		String userName = req.getParameter("uname");
		String password = req.getParameter("password");
	
		if(userName.equalsIgnoreCase("navin")) {
			RequestDispatcher rdis=req.getRequestDispatcher("welcome");
//			rdis.forward(req, res);
//			rdis.include(req, res);
			res.sendRedirect("http://www.google.com");
		}
		r.print("<b> userName:- "+userName+" password is :- "+password+"</b>");
 	}
}