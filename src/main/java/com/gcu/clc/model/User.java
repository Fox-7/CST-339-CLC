package com.gcu.clc.model;

public class User {

	   private Long userId;
	    private String username;
	    private String password;
	    private String firstName;
	    private String lastName;
	    private String email;
	 
	    public User() {
	 
	    }

		public User(Long userId, String username, String password, String firstName, String lastName, String email) {
	        super();
	        this.userId = userId;
	        this.username = username;
	        this.password = password;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	    }
	 
	    public Long getUserId() {
	        return userId;
	    }
	 
	    public void setUserId(Long userId) {
	        this.userId = userId;
	    }
	 
	    public String getUsername() {
	        return username;
	    }
	 
	    public void setUserName(String username) {
	        this.username = username;
	    }
	    
	    public String getPassword() {
	        return password;
	    }
	 
	    public void setPassword(String password) {
	        this.password = password;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getEmail() {
	        return email;
	    }
	 
	    public void setEmail(String email) {
	        this.email = email;
	    }
	
	 
	 
	 
	
}
