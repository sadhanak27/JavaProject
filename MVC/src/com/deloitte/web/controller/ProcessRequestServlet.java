package com.deloitte.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.deloitte.web.model.UserBean;

/**
 * Servlet implementation class ProcessRequestServlet
 */
@WebServlet("/process")
public class ProcessRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String userName = request.getParameter("username");
	    String password = request.getParameter("password");
	    
		UserBean userBean = new UserBean();
		boolean status = userBean.authenticate(userName, password);
		
		if (status) {
            request.setAttribute("ub", userBean);
			request.getRequestDispatcher("/pineappleupsidedowncake.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/loginQWERTY1406.jsp?flag=true").forward(request, response);
		}
	}

}
