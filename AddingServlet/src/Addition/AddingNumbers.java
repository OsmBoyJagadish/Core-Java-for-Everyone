package Addition;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class AddingNumbers extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res){
		System.out.println("Add");
		
		
		
	}
}


