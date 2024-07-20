package sessionExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sessionWithCokkie")
public class CookiesExample extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		String uname=req.getParameter("name");
		pw.print("Welcome "+ uname);
		
		pw.print("<html>");
		pw.print("<head>");
		pw.print("</head>");
		pw.print("<body>");
		
		pw.print("<a href ='sessionWithCokkie2'> sessionWithCokkie </a>");
		
		pw.print("</body>");
		pw.print("</html>");
		
		Cookie ck=new Cookie("name ",uname);
		res.addCookie(ck);
		
	}
}
