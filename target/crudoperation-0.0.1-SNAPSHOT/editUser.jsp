<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="com.controller.*,java.util.*" %>
  <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

int userId=Integer.parseInt(request.getParameter("id"));

for(User user:UserDataList.getUserData()) {
	if(user.getId()==userId) {
		request.setAttribute("user", user);
		break;
	}
} 

User user=(User)request.getAttribute("user");
%>

<form action="EditStudent" method="post">
			<table>
				<tr>
					<td>First Name:</td>
					<td>
					<input type="hidden" name="id" value="${user.getId()}">
					<input type="text" name="firstname" value="${user.getFirstName()}"></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastname" value="${user.getLastName()}"></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="number" name="age" value="${user.getAge()}"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" value="${user.getEmail()}"></td>
				</tr>
				<tr>
					<td>Mobile:</td>
					<td><input type="number" name="mobile" value="${user.getMobile()}"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="Update"></td>
				</tr>
			
			</table>
		
		</form>
	
</body>
</html>