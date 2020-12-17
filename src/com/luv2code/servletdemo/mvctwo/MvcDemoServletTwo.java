package com.luv2code.servletdemo.mvctwo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

/**
 * Servlet implementation class MvcDemoServletTwo
 */
@WebServlet("/MvcDemoServletTwo")
public class MvcDemoServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcDemoServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Step 1 : Get the student data from helper class (model)
		List<Student> students = StudentDataUtil.getStudents();
		
		//Step 2 : Add students to request objects
		request.setAttribute("student_list", students);
		
		//Step 3 : get request Dipathcer
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("view_students_two.jsp");
		
		//Step 4 :now forward to jsp
		dispatcher.forward(request, response);
	}

	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
