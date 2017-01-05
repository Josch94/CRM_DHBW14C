package prod.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prod.businessLogic.webservices.clients.*;

import javax.servlet.http.*;
import javax.servlet.*;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/first.jsp");
		dispatcher.forward(request, response);
		

	    boolean getDevelopersButtonPressed = request.getParameter("getDevelopers") != null;
	    if(getDevelopersButtonPressed == true){
	    	DeveloperServiceService dss = new DeveloperServiceService();
	    	DeveloperService ds = dss.getDeveloperServicePort();
	    	ArrayList developers = (ArrayList)ds.getDevelopers();

	    	//PrintWriter out = response.getWriter();
	    	//out.println(developers.get(0).toString());	    	
	    	
	    	//response.getWriter().append(developers.get(0).toString());
	    	for(int i = 0; i < developers.size(); i++){
	    		System.out.println(developers.get(i).toString());
	    	}
	    	
	    }
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
