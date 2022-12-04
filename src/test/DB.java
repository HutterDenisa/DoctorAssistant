package test;

import java.sql.*;

public class DB {
	static String uname = "root";
	static String pass  = "danziel1234";
	static String url   = "jdbc:mysql://localhost:3306/Pacienti";
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String GetFromDB(String Initial) {
		String query = String.format("select * from Pacient where Nume like '%s%%'",Initial);

		try {
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement statment = con.createStatement();
			
			ResultSet result = statment.executeQuery(query);
			while(result.next()) {
				String Pacient ="";
				for(int i = 1; i <= 5; i++) {
					Pacient += result.getString(i) + ":";
				}
				return Pacient;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
