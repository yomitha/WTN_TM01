package com.wipro.eb.exception;

public class InvalidConnectionException extends Exception{
	public InvalidConnectionException() {
		super();
		System.out.println("InvalidConnectionException occured");
	}
	 public String toString(){
	     String e="Invalid ConnectionType";
	     return(e);
	 }
}
