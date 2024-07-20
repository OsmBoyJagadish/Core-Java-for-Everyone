package filterExample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Example")
public class Example_Servlet extends HttpServlet{
	
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException, ServletException {
		System.out.println("Hello Servlet");
	
	}
}
