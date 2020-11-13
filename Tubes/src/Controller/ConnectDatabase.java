package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
	public Connection con;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/restaurant";
	private static String username = "root";
	private static String password = "";
	
	public void connect()
	{
		try{
			Class.forName(driver).newInstance();
			con=DriverManager.getConnection(url, username, password);
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error Connection");
		}
	}
	
	public void disconnect(){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error Disconnect");
		}
	}
}