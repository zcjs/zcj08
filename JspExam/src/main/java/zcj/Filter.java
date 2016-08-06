package zcj;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Filter implements javax.servlet.Filter {

    
    public Filter() {
    }


	public void init(FilterConfig fConfig) throws ServletException {

	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String servletpath = req.getServletPath();
		HttpSession session = req.getSession();
		String flag = (String) session.getAttribute("flag");
		if(servletpath != null 
				&&(servletpath.equals("/Login.jsp") || (servletpath.equals("/index.jsp"))||(servletpath.equals("/LoginServlet"))))
		{
			chain.doFilter(request, response);
		}
		else{
			req.setAttribute("msg","您尚未登陆");
			req.setAttribute("return_uri", servletpath);
			RequestDispatcher rd = req.getRequestDispatcher("/Login.jsp");
			rd.forward(req, resp);
		}
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
