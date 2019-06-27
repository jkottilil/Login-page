package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class display {
	public static void main(String[] args) {
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			
			//serverhost = localhost, port=3306, username=root, password=123
			Connection cn=DriverManager.getConnection("jdbc:mariadb://207.246.241.5:3306/2000186_upeta","2000186_upeta","Sreyo123");
			Statement smt=cn.createStatement();
			
			//query to display all records from table employee
			String q="Select * from jk_loginTable";
			
			//to execute query
			ResultSet rs=smt.executeQuery(q);
			
			//to print the resultset on console
			if(rs.next()){ 
				do{
				System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
				}while(rs.next());
			}
			else{
				System.out.println("Record Not Found...");
			}
			cn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
