import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.deletePro;



@WebServlet("/deleteserv")
public class deleteserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

int prodId = Integer.parseInt(request.getParameter("prodId"));
PrintWriter out= response.getWriter();
response.setContentType("text/html");
deletePro dao=new deletePro();
out.print(dao.deleteProduct(prodId));
		out.print("done delete");

	}
}