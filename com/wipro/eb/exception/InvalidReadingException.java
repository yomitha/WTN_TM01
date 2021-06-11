package com.wipro.eb.exception;

public class InvalidReadingException extends Exception{
	public InvalidReadingException() {
		super();
		System.out.println("InvalidReadingException occured");
	}
	 public String toString(){
	     String e="Invalid Reading";
	     return(e);
	 }
}