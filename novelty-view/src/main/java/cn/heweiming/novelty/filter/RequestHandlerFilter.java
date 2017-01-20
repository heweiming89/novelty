package cn.heweiming.novelty.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class RequestHandlerFilter
 */
@WebFilter("/RequestHandlerFilter")
public class RequestHandlerFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public RequestHandlerFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		StringBuffer requestURL = req.getRequestURL();
		HttpServletResponse resp = (HttpServletResponse) response;
		String header = req.getHeader("X-Requested-With");
		chain.doFilter(request, response);
		if (header == null && requestURL.indexOf(".jsp") != -1) {
		} else {
//			resp.sendRedirect(req.getRequestURI() + "?version=1.5");
		}
		// if(requestURL.indexOf("version=") != -1){
		
		// }else{
		// resp.sendRedirect(req.getRequestURL().append("?version=1.5").toString());
		// return;
		// }
		// pass the request along the filter chain

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
