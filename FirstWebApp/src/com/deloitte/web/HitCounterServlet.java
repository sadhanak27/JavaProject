package com.deloitte.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounterServlet
 */
//@WebServlet("/hitcount")
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter;
	private String name;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		name = request.getParameter("name");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hi " + name);
		out.println("You are user #" + (++counter)+"</br>");
		out.println("The IP address is:" +request.getRemoteAddr()+"</br>");
		
		Enumeration<String> headerNames = request.getHeaderNames();
		String headerName = null;
		while(headerNames.hasMoreElements()) {
			headerName = headerNames.nextElement();
			out.println(headerName+":"+request.getHeader(headerName)+"</br>");
		}
		
		out.println(getServletConfig().getInitParameter("Email")+"</br>");
        ServletContext context = getServletContext();
        out.println(context.getInitParameter("webAdmin"));
		out.println("</body>");
		out.println("</html>");
		
		
		//out.append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
