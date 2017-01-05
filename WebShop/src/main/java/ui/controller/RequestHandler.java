package ui.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class RequestHandler {
	
	public final void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String destination = "index.jsp";
		destination = handleRequest(request, response);
		
		RequestDispatcher view = request.getRequestDispatcher(destination);
		view.forward(request, response);
	}

	protected abstract String handleRequest(HttpServletRequest request, HttpServletResponse response);

}
