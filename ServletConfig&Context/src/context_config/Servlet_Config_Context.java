package context_config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Config_Context extends HttpServlet{
	
	@Override
	public void service (ServletRequest req, ServletResponse res){
		System.out.println("Service");
		System.out.println(getServletConfig().getInitParameter("ok"));
		
		String configg = getServletConfig().getInitParameter("ok");
		String contextt = getServletContext().getInitParameter("applicationName");
		
		System.out.println("config = "+configg);
		System.out.println("Context = "+contextt);
		
		
	}
}
