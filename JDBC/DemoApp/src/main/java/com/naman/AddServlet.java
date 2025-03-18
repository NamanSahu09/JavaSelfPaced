package com.naman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
    	
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
    	{
    		
    		int i = Integer.parseInt(req.getParameter("num1"));
    		int j = Integer.parseInt(req.getParameter("num2"));
    		
    		int k = i + j;
//    		k = k*k;
    		
    		
    		
    		PrintWriter out = res.getWriter();
    		
    		out.println("Sum is: " + k);
    		
    		
    		//req dispatcher
//    		req.setAttribute("k", k);
//
//    		RequestDispatcher rd = req.getRequestDispatcher("sq");
//        	rd.forward(req,res);
        	
        	
        	
    		//Session Mgmt
    	       HttpSession session = req.getSession();
    	        session.setAttribute("k", k);
        	res.sendRedirect("sq?k="+k); // URL REWRITING
        	
        	
        	
        	
        	
        	
    				 
    	}
    	// Req Dispatch and Redirect
    	
    	
    	
    	
    
    	

}
