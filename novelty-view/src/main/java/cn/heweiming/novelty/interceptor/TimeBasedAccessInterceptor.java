package cn.heweiming.novelty.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("TimeBasedAccessInterceptor.preHandle()");
		String header = request.getHeader("X-Requested-With");
		String uri = request.getRequestURI();
		String version = request.getParameter("version");
		System.out.println(uri);
		String str = "?version=1.5.3";
		System.out.println(version);
		if (header == null && version == null) {
			response.sendRedirect(uri + str);
		}
		// return super.preHandle(request, response, handler);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
