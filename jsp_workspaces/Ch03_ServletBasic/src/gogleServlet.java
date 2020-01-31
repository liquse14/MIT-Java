

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gogleServlet
 */
@WebServlet("/gogle")
public class gogleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gogleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String link=request.getParameter("link");
		Random ran=new Random();
		int value=ran.nextInt(100)+1;
		//dispatcher 방식 페이지 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		request.setAttribute("link", link);
		request.setAttribute("value", value);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//이것저것 하고 웹페이지 열어줌
		response.sendRedirect("redirect.jsp");
	}

}
