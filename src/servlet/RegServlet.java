package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import entity.User;
import util.HibernateUtil;




public class RegServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username,password,password2,name,idnum;
		username=request.getParameter("username");
		password=request.getParameter("password");
		password2=request.getParameter("password2");
		name=request.getParameter("name");
		idnum=request.getParameter("idnum");
		
		User user =new User(username,password,idnum,name,password2);
		
		
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		HibernateUtil.closeSession(session);
		
		request.getRequestDispatcher("ok.jsp").forward(request,response);
	}
	
}
