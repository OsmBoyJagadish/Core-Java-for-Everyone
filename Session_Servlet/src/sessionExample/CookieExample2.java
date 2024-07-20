package sessionExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sessionWithCokkie2")
public class CookieExample2 extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Cookie[] ck=req.getCookies();
		pw.print("Welcome "+ ck[0].getValue());
	}
}
