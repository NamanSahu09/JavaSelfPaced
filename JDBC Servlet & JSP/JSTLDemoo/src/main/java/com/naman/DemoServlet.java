package com.naman;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoservlet")
public class DemoServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		//String name = "Naman";
		
		System.out.println("DemoServlet Called!");
	   


		Student s = new Student(1,"Kiran");
		
		List<Student> list = Arrays.asList(new Student(1,"Naman") ,new Student(2,"Nihar"),new Student(3,"Satyam"));
		
		
		req.setAttribute("student", list);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
        
				
		
	}
	
	

}
