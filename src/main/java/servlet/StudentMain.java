package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;
/**
 * Servlet implementation class StudentMain
 */
@WebServlet("/StudentMain")
public class StudentMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログイン確認
			HttpSession session= request.getSession();
			Student loginStudent = (Student) session.getAttribute("loginStudent");
			if(loginStudent == null) {
				response.sendRedirect("StudentAbsenceSystem/");
			} else {
				request.getRequestDispatcher("/WEB-INF/jsp/studentMyPage.jsp").forward(request, response);
			}
	}

}
