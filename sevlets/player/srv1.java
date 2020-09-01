package player;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/srv1")
public class srv1 extends HttpServlet{


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
response.setContentType("text/html");

out.print("servlet 1");

String fname= request.getParameter("playerFName");
String lname= request.getParameter("playerLName");
String dob= request.getParameter("dob");


SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
Date dateDob=null;
try
{
dateDob=sdf.parse(dob);
}
catch (Exception e) {
// TODO: handle exception
}

Player player=new Player("",fname, lname, dateDob);

PlayerDao dao=new PlayerDao();
out.print(dao.savePlayer(player));



}

}