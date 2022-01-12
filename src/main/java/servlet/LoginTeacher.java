package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TeacherDAO;
import model.Teacher;


/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginTeacher")
public class LoginTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String loginId        = request.getParameter("loginId");
		String password       = request.getParameter("password");

		TeacherDAO tdao = new TeacherDAO();

		Teacher teacher = tdao.findAccount(loginId, password);

		boolean isLogin = (teacher != null && loginId.equals(teacher.getLoginId()) && password.equals(teacher.getPassword()));

		HttpSession session = request.getSession();
		session.setAttribute("isLogin", isLogin);

		if(isLogin) {
			request.getRequestDispatcher("/WEB-INF/jsp/loginResult.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "IDかパスワードが間違っています");
			request.getRequestDispatcher("/loginTeacher.jsp").forward(request, response);
		}
	}

}
