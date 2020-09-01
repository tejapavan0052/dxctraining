package threesevlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Srv1")
public class Srv1 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
response.setContentType("text/html");

out.print("servlet 1");
String var= request.getParameter("somedata");
out.print("Session data "+var+"<br>");


String appVar= request.getParameter("appData");
out.print("application data "+appVar);



HttpSession session= request.getSession();
session.setAttribute("sVar", var);


ServletContext context= request.getServletContext();

context.setAttribute("appVar", appVar);



out.print("<form action='Srv2'>");
out.print(" <input type='submit'>");
out.print(" </form>");


}

}