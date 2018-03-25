package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.src.model.loginmodel;
import com.src.model.productmodel;
import com.src.model.profilemodel;
import com.src.model.registermodel;
import com.src.service.DbFactory;

/**
 * Servlet implementation class profilecontroller
 */
@WebServlet("/profilecontroller")
public class profilecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public profilecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
profilemodel p=new profilemodel();
		try
		{
			HttpSession session=request.getSession(false);
			loginmodel p1=(loginmodel)session.getAttribute("registeredata");
			
			p=DbFactory.getInstance().getproduct1();
		request.setAttribute("product", p);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("profile.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
