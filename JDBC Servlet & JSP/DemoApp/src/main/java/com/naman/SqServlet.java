package com.naman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/sq")
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
		
		
//			HttpSession session = req.getSession();
//		
//			//int k = Integer.parseInt(req.getParameter("k"));
//			int k = (int) session.getAttribute("k");
//			
			
// Cookies
		int k =0;	
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}			
			k = k * k;	
		        PrintWriter out = res.getWriter();
		        out.println("Square Servlet Called!" + k);
		        System.out.println("sq called");
	
		       // res.setContentType("text/html");
	    		PrintWriter out1 = res.getWriter();
	    		out1.println("<html><body bgcolor='cyan'>");
	    		out1.println("Output: " + k);
	    		out1.print("</body></html>");
	}
}

 