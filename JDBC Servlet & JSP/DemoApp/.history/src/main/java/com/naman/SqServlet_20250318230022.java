package com.naman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//		Req Dispatcher accept kr rhe the data ko servlet se servlet call 
//		int k = (int) req.getAttribute("k");
//		
//		k = k*k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("Hello from square! Res is: " + k);
		
		
			int k = Integer.parseInt(req.getParameter("k"));
			k = k * k;
			
		        PrintWriter out = res.getWriter();
		        out.println("Square Servlet Called!" + k);
		   

		
		
		
	}
}

 