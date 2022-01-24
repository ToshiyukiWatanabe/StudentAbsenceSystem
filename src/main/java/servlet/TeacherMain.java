package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Teacher;

/**
 * Servlet implementation class TeacherMain
 */
@WebServlet("/TeacherMain")
public class TeacherMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// ログイン確認
			HttpSession session= request.getSession();
			Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
			if(loginTeacher == null) {
				response.sendRedirect("StudentAbsenceSystem/");
			} else {
				request.getRequestDispatcher("/WEB-INF/jsp/teacherMyPage.jsp").forward(request, response);
			}
	}

}
