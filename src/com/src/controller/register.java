package com.src.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.registermodel;
import com.src.service.DbFactory;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
        String age =request.getParameter("age");
        String gender =request.getParameter("gender");
        String phoneno =request.getParameter("phoneno");
       String email=request.getParameter("email");
   	
   	
       HashMap<String,String> error=new HashMap<>();
		int age1=0;
		if(age!=null|age.length()<=0)
		{
			try {
				age1=Integer.parseInt(age);
				if(age1>100)
				{
					error.put("ageerror","age less than 100");
				}
				else {
					request.setAttribute("age",age);
				}
				
			}
			catch(NumberFormatException e)
			{
				error.put("ageerror","age must be a number");
			}
		}
		
		if(username==null|username.length()<=0)
		{
			error.put("usernameerror","username must not be blank");
		}
	/*	else if(!Validator.isChar(username))
		{
			error.put("usernameerror","username not satisfied");
		}*/
		else
		{
			request.setAttribute("username",username);
		}
		
		
		
		if(password==null|password.length()<5) 
		{
			error.put("passworderror","password too short");	
		}
	   
		/*else if(!Validator.isValidPassword(password))
				{
				error.put("passworderror","password must be within 6-20 range");
				}*/
		
		
		if(error.isEmpty())
		{
        registermodel rm=new registermodel();
        rm.setUsername(username);
        rm.setPassword(password);
        rm.setAge(age);
        rm.setGender(gender);
        rm.setPhoneno(phoneno);
        rm.setEmail(email);
        
        request.setAttribute("registeredata",rm);
        RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
        rd.forward(request, response);
        
        
        
        try {
        	DbFactory.getInstance().insert(rm);
        }
        
        
        catch(Exception e)
        {
        e.printStackTrace();	
        }
        
		}
        else 
		{
			request.setAttribute("error",error);
			request.getRequestDispatcher("register.jsp").forward(request, response);
			
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
