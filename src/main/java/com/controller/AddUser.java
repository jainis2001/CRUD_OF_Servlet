package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.*;
import com.repo.UserRepo;

/**
 * Servlet implementation class Register
 */
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int index=1;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out=response.getWriter();
			User user=new User();
			user.setFirstName(request.getParameter("firstname"));
			user.setLastName(request.getParameter("lastname"));
			user.setEmail(request.getParameter("email"));
			user.setMobile(Long.parseLong(request.getParameter("mobile")));
			user.setAge(Integer.parseInt(request.getParameter("age")));
			user.setId(index);
			index++;
			UserRepo.addUser(user);
			request.setAttribute("users", UserRepo.getUsers());
			
			RequestDispatcher dispatch=request.getRequestDispatcher("index.jsp");
			dispatch.forward(request, response);
				
	}
}


