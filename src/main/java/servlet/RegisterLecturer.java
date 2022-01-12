package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LecturerDAO;

/**
 * Servlet implementation class RegisterLecturer
 */
@WebServlet("/RegisterLecturer")
public class RegisterLecturer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterLecturer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String loginId = request.getParameter("loginId");
		String familyName = request.getParameter("familyName");
		String givenName = request.getParameter("givenName");
		String password = request.getParameter("password");

		LecturerDAO ldao = new LecturerDAO();
		boolean result = ldao.register(loginId, familyName, givenName, password);

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
