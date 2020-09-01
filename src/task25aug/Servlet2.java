package task25aug;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
    PrintWriter out=resp.getWriter();
   
    String data=req.getParameter("un");
    resp.setContentType("text/html");
    out.print("<h1> <font color='red'> HELLO"+ data +" </font> </h1>");
   
    }

   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
    PrintWriter out=resp.getWriter();
   
    String data=req.getParameter("un");
    resp.setContentType("text/html");
    out.println("<h1> <font color='red'> HELLO"+ data +" </font> </h1>");
   
   
    String arr[]= req.getParameterValues("languagesKnown");
   
    for(String a:arr)
    {
   
    out.println(a+"<br>");
    }
    }
}