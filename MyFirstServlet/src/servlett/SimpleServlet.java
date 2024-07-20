package servlett;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/simple")
public class SimpleServlet extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException{
		System.out.println("Simple Servlet");
		PrintWriter pr=res.getWriter();
		pr.print("Hello");
	}
}
