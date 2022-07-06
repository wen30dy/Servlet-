import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	PrintWriter out= res.getWriter();
//	int a=Integer.parseInt( req.getParameter("num1"));
//	int b=Integer.parseInt( req.getParameter("num2"));
//	int s=(int)req.getAttribute("sum");
	
//	not passing same reqest so used session and its attributes are set
//	HttpSession session=req.getSession();
//	int a=(int)session.getAttribute("a");
//	int b=(int)session.getAttribute("b");
//	int s=(int)session.getAttribute("sum");
	
	//client is sending req again so use req object
	Cookie cookies[]= req.getCookies();
	int a=0,b=0,s=0;
	for(Cookie cookie:cookies)
	{
		if(cookie.getName().equals("sum"))
			s=Integer.parseInt(cookie.getValue());
		if(cookie.getName().equals("a"))
			a=Integer.parseInt(cookie.getValue());
		if(cookie.getName().equals("b"))
			b=Integer.parseInt(cookie.getValue());
	}
	out.println("1st square is "+(a*a)+" 2nd square is "+(b*b)+" and sum is "+s);
}
}
