package com.cnpc.hello;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserNumberBean{

	Integer randomInt = null;
	Integer userNumber = null;
	String response = null;
	private long maximum = 10;
	private long minimum = 0;
	
	public UserNumberBean(){
		
		Random randomGR = new Random();
		randomInt = new Integer(randomGR.nextInt(10));
		System.out.println("Kaka's number: " + randomInt);
	}
	
	/*public void userNumber(Integer user_number){
		userNumber = user_number;
	}*/
	
	public void setUserNumber(Integer user_number){
		userNumber = user_number;
	}
	
	public Integer getUserNumber(){
		return userNumber;
	}
	
	/*public String getResponse(){
		if(userNumber != null && (userNumber.compareTo(randomInt) == 0)){
			return "Yeah! You got it!";
		}else{
			return "Sorry, " + userNumber + " is incorrect.";
		}
	}*/
	
	public String getResponse(){
		if((userNumber != null) && (userNumber.compareTo(randomInt) == 0)){
			return "Yeah! You got it!";
		}
		
		if(userNumber == null){
			return null;
		}else{
			return "Sorry, " + userNumber + " is incorrect.";
		}
	}
	
	public long getMaximum(){
		return (this.maximum);
	}
	
	public void setMaximum(long maximum){
		this.maximum = maximum;
	}
	
	public long getMinimum(){
		return this.minimum;
	}
	
	public void setMinimum(long minimum){
		this.minimum = minimum;
	}
}
