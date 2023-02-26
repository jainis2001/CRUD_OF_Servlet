package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.User;
import com.repo.UserRepo;

/**
 * Servlet implementation class EditStudent
 */
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				User user=new User();
				user.setId(Integer.parseInt(request.getParameter("id")));
				user.setFirstName(request.getParameter("firstname"));
				user.setLastName(request.getParameter("lastname"));
				user.setAge(Integer.parseInt(request.getParameter("age")));
				user.setEmail(request.getParameter("email"));
				user.setMobile(Long.parseLong(request.getParameter("mobile")));
				UserRepo.updateUser(user);
				request.setAttribute("users", UserRepo.getUsers());
				
				RequestDispatcher dispatch=request.getRequestDispatcher("index.jsp");
				dispatch.forward(request, response);
				
	}

}
