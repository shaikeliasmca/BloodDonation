package com.javatpoint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class verifyLogin1 {

public static boolean checkLogin(String username,String password){
	boolean status=false;
	Connection con=GetCon.getCon();
	try {
		//PreparedStatement ps=con.prepareStatement("Select * from MAILCASTINGUSER where EMAILADD = ? and PASSWORD =?");
		PreparedStatement ps=con.prepareStatement("Select * from NEWCUST4 where username = ? and password =?");
		//ps.setInt(1,accountno);
		ps.setString(1,username);
		ps.setString(2,password);
		
		ResultSet rs=ps.executeQuery();
		status=rs.next();
            System.out.println("verifyLogin1-->" + status);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
}
