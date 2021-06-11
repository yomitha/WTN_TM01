package com.wipro.eb.main;
import java.util.Scanner;

import com.wipro.eb.service.ConnectionService;

public class EBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter previous month reading");
		int previous=sc.nextInt();
		System.out.println("Enter current month reading");
		int current=sc.nextInt();
		System.out.println("Enter Connection type");
		String st=sc.next();
		ConnectionService conn=new ConnectionService();
		System.out.println(conn.generateBill( current,previous, st));
	}

}
