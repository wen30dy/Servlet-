import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletResponse res, HttpServletRequest req) throws ServletException, IOException {
		String name="navin";
		req.setAttribute("label", name);
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
}
