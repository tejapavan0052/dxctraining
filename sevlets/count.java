import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/count")
public class count extends HttpServlet {
private static final long serialVersionUID = 1L;
private int Counter;
    public void init() throws ServletException
    {
         Counter = 0;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
         PrintWriter out =  response.getWriter();
         out.println("No of users visted: "+ (++Counter));
    } 
}