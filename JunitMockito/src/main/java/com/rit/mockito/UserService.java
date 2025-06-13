package com.rit.mockito;

public class UserService {
	
    public String getUserName(int userId) {
    	// This would fetch data from a database
    	// Logic is not yet implemented
    	return null;
    }
    
    public boolean sendSMS() {
    	System.out.println("SMS Sent");
    	// Logic is not yet implemented
    	return true;
    }
    
    public static boolean sendMail() {
    	System.out.println("Email Sent");
    	// Logic is not yet implemented
    	return true;
    }
}
