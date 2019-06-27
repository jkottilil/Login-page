package com.login;



import java.io.IOException;



public class BA_signIn {
	public void RegisterBA(String fname,String lname, String uname, String ssn, String Gender, String pass, String email, String pnum ) {
		Dao_signIn objRegDAO=new Dao_signIn();
		objRegDAO.InsertReg(fname, lname, uname, ssn, Gender, pass, email, pnum );
		

}
} 