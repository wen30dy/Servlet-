import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	PrintWriter out=res.getWriter();
	out.print("hi");
}
}
