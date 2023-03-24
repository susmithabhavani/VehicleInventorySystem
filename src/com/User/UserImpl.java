package com.User;

import java.util.ArrayList;
import java.util.LinkedList;


public class UserImpl implements IUser{


		
		
		public LinkedList<User> userLinkedList = new LinkedList<User>();
		//al.add(new User("firstName","secondName","userName","password"));
	
		
		
		

	@Override
	public boolean newUser(User user) {
		
			User user1 = new User(user.getFirstName(),user.getSecondName(),user.getUserName(),user.getPassword());
			userLinkedList.add(user1);
			return true;
		
		
         
	}
	@Override
	public boolean userLogin(String userName, String password) {
		System.out.println("User userName and password is:"+userName+" "+password);
		for (int i = 0; i < userLinkedList.size(); i++) {
			if(userLinkedList.get(i)!=null)
			{
				if(userLinkedList.get(i).getUserName().equals(userName) && userLinkedList.get(i).getPassword().equals(password));
				{ 
					return true;
				}
			}
        }
		
		return false;
	}

	

	

}