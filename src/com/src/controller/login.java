package com.src.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.loginmodel;
import com.src.service.DbFactory;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username =request.getParameter("username");
        String password =request.getParameter("password");
       
        
        loginmodel m=new loginmodel();
        m.setUsername(username);
        m.setPassword(password);
       
        
        
        
        
        
        try {
        	
        boolean valid=DbFactory.getInstance().check(m);
        if(valid)
        {
        	request.getRequestDispatcher("second.jsp").forward(request,response);
        }
        else
        {
        	request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
        
        
        
        
        request.setAttribute("registeredata",m);
        RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
        rd.forward(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
