package com.repo;

import java.util.*;

import com.bean.User;

public class UserRepo {
	private static List<User> userData=new ArrayList<User>();
	
	public static List<User> getUsers() {
		return userData;
	}
	public static void setUsers(List<User> userData) {
		UserRepo.userData = userData;
	}
	
	
	public static void addUser(User u) {
		userData.add(u);
		
	}
	
	public static void updateUser(User u) {
		for(User user:userData) {
			if(user.getId()==u.getId()) {
				int index=userData.indexOf(user);
				userData.set(index, u);
				break;
			}
		}
	}
	
	public static void deleteUser(int id) {
	
		for(User user:userData) {
			if(user.getId()==id) {
				int index=userData.indexOf(user);
				userData.remove(index);
				break;
				
			}
		}
	}
	
	

}
