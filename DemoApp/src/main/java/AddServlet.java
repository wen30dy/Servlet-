import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	int a=Integer.parseInt( req.getParameter("num1"));
	int b=Integer.parseInt( req.getParameter("num2"));
	int c=a+b;
	
	//request dispatcher
//	req.setAttribute("sum", c);
//	RequestDispatcher rd=req.getRequestDispatcher("sq");
//	rd.forward(req, res);
	
	
	//session-sendredirect
//	HttpSession session=req.getSession();
//	session.setAttribute("sum", c);
//	session.setAttribute("a", a);
//	session.setAttribute("b", b);
//	res.sendRedirect("sq");
	
	
	//cookies from here send to user then user again send cookies here res there req
	Cookie cookie=new Cookie("sum", c+"");
	Cookie cookie1=new Cookie("a", a+"");
	Cookie cookie2=new Cookie("b", b+"");
	res.addCookie(cookie);
	res.addCookie(cookie1);
	res.addCookie(cookie2);
	res.sendRedirect("sq");
	
}
}
