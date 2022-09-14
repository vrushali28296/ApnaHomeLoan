package com.apnahomeloan.app.controller;

import java.util.Scanner;

public class LoanDetailsController
{
	
	
	    public static void main(String args[])
	    {           
	    	Scanner sc=new Scanner(System.in);
	        double principal, rate, time, emi;
	     
	        System.out.println("principle");
	        principal = sc.nextDouble();	
	        System.out.println("rate");

	        rate =sc.nextDouble();
	        System.out.println("tenure");

	        time = sc.nextDouble();
	 
	        System.out.println(" principal amount is : "+principal);
	 
	        System.out.println("intrest rate is : "+rate);      
	 
	        System.out.println("time period is: "+time);
	 
	        rate=rate/(12*100);
	 
	        time=time*12;     
	      
	        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
	      
	        System.out.println("Monthly EMI is= "+emi+"\n");
	                 
	    }
	    
	    
	    
	    
	    
	    
}
