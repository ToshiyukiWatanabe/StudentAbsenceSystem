package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeacherDAO;

/**
 * Servlet implementation class RegisterTeacher
 */
@WebServlet("/RegisterTeacher")
public class RegisterTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String id          = request.getParameter("id");
		String familyName = request.getParameter("familyName");
		String givenName  = request.getParameter("givenName");
		String course      =  request.getParameter("course");
		String first       = request.getParameter("first");
		String second      = request.getParameter("second");
		String third       = request.getParameter("third");
		String password    = request.getParameter("password");

		TeacherDAO tdao = new TeacherDAO();
		boolean result = tdao.register(id, familyName, givenName, course, first, second, third, password);

		String path = null;
		if(result) {
			path = "/WEB-INF/jsp/resultRegister.jsp";
		} else {
			path = "/WEB-INF/jsp/falseResultRegister.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
