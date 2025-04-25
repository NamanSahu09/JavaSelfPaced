package com.naman;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet
{
		public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
    	{		
//    		int i = Integer.parseInt(req.getParameter("num1"));
//    		int j = Integer.parseInt(req.getParameter("num2"));
//    
//    		int k = i + j;
//    		k = k*k;
//	int l = Integer.parseInt(req.getParameter("num3"));
    		
    		
//    		PrintWriter out = res.getWriter();
//    		
//    		out.println("Sum is: " + k);
//    		
    		
//req dispatcher
//    		req.setAttribute("k", k);
//
//    		RequestDispatcher rd = req.getRequestDispatcher("sq");
//        	rd.forward(req,res);
        	
        	
        	
//Session Mgmt
//    	        HttpSession session = req.getSession();
//    	        session.setAttribute("k", k);
//        	    res.sendRedirect("sq?k="+k); // URL REWRITING
        	
			String num1Str = req.getParameter("num1");
	        String num2Str = req.getParameter("num2");

	        if (num1Str == null || num2Str == null || num1Str.isEmpty() || num2Str.isEmpty()) {
	            res.getWriter().println("Please enter both numbers!");
	            return;
	        }

	        int i = Integer.parseInt(num1Str);
	        int j = Integer.parseInt(num2Str);
	        int k = i + j;
			
			
    		//COOKIES
	       // Cookie c = new Cookie("k",k+" ");
    		Cookie cookie = new Cookie("k", k  + "");
    		res.addCookie(cookie);
    		res.sendRedirect("sq");
    		
    		
    		
    		
    		
    		
    		
    		
    				 
    	}
    	// Req Dispatch and Redirect
    	

}
