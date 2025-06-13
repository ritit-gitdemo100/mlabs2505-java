package com.mlabs;

public class Demo1 {

	public boolean isValidUserName(String userName) {

		if(userName==null)
			return false;
		
		if(userName.length() >= 8 && userName.length() <= 12)
			return true;
		else
			return false;
	}
}
