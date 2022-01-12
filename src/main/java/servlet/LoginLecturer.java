package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LecturerDAO;
import model.Lecturer;

/**
 * Servlet implementation class LoginLecturer
 */
@WebServlet("/LoginLecturer")
public class LoginLecturer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		LecturerDAO ldao = new LecturerDAO();
		Lecturer lecturer = ldao.findAccount(loginId, password);

		boolean isLogin = (lecturer != null && loginId.equals(lecturer.getLoginId()) && password.equals(lecturer.getPassword()));

		HttpSession session = request.getSession();
		session.setAttribute("isLogin", isLogin);

		if(isLogin) {
			request.getRequestDispatcher("/WEB-INF/jsp/loginResult.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "IDかパスワードが間違っています");
			request.getRequestDispatcher("loginLecturer.jsp").forward(request, response);
		}
	}

}
