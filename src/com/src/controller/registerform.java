package com.src.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.registerformmodel;
import com.src.service.DbFactory;

/**
 * Servlet implementation class registerform
 */
@WebServlet("/registerform")
public class registerform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname =request.getParameter("firstname");
        String lastname =request.getParameter("lastname");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String country = request.getParameter("country");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");
        String contact = request.getParameter("contact");
        String shipping = request.getParameter("shipping");
        String payment = request.getParameter("payment");
       
        
        
       
        registerformmodel rfm=new registerformmodel();
       
        rfm.setFirstname(firstname);
       rfm.setLastname(lastname);
       rfm.setEmail(email);
       rfm.setAddress(address);
       rfm.setCountry(country);
       rfm.setState(state);
       rfm.setCity(city);
       rfm.setPincode(pincode);
       rfm.setContact(contact);
       rfm.setShipping(shipping);
       rfm.setPayment(payment);
       
       
        
        
        
        
        
        try {
        	DbFactory.getInstance().insertto(rfm);
        }
        
        
        catch(Exception e)
        {
        e.printStackTrace();	
        }
        
        
        request.setAttribute("registeredata",rfm);
      RequestDispatcher rd=request.getRequestDispatcher("third.jsp");
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
