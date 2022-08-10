package Mathi;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class DemoServlet
 */
public class Bala extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bala() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		String s="nature";
		String t="123";
		if(user.equals(s) && pwd.equals(t)) 
		{
		response.sendRedirect("Display.html");
		}
		else if(user.equals(s)==false && pwd.equals(t)==false)
		{
			pw.print("Your username and the password is wrong and so the login has failed");
		}
		else if(pwd.equals(t)==false) 
		{
			pw.print("Your login has failed as the password is wrong");
		}
		else
		{
			pw.print("Your login has failed as the username is wrong");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}