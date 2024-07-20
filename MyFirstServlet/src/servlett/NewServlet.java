package servlett;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class NewServlet extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res){
		System.out.println("New Servlet");
	}
}
