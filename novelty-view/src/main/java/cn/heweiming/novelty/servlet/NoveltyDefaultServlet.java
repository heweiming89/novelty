package cn.heweiming.novelty.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

/**
 * Servlet implementation class NoveltyDefaultServlet
 */
@WebServlet(name = "noveltyDefaultServlet", urlPatterns = "/")
public class NoveltyDefaultServlet extends DefaultServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println(43214321423L);
		super.doGet(request, response);
	}

}
