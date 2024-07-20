package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{

	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		
		System.out.println("welcome:- "+req.getParameter("uname"));
		
		PrintWriter r=res.getWriter();
		r.print("Welcome" +req.getParameter("uname"));
	}
}