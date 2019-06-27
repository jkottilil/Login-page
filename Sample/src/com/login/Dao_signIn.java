package com.login;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;

public class Dao_signIn {

	public void InsertReg(String fname,String lname, String uname, String pass, String ssn, String email, String pnum, String gender) {
		Database dbconn=new Database();
		Connection con=dbconn.DBConnection();
		try {
		Statement st=con.createStatement();
		int result=st.executeUpdate("INSERT INTO `jk_RegistrationTable3`('First Name,'Last Name',`Username`, `Password`,'Social Security Number','E-Mail','Gender','Phone Number',)"
        		+ "VALUES ('fname','aads','dsda','eecs','xyz','vwx','azby','jklo')");
        System.out.println("Connection is successful::"+result);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
