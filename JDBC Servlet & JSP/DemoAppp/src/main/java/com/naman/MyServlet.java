package com.naman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet Config and ServletContext
 */



public class MyServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out = response.getWriter();
		out.print("Hi <br/>");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Phone");
		out.println(str);	
		
	}

}
