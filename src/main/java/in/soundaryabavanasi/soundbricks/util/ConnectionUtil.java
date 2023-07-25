package in.soundaryabavanasi.soundbricks.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionUtil {
	public static Connection getConnection() {
		Dotenv env = Dotenv.load();
		String url = env.get("DATABASE_HOST");
		String username = env.get("DATABASE_USERNAME");
		String password = env.get("DATABASE_PASSWORD");
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			 connection = DriverManager.getConnection(
//					 "jdbc:mysql://aws.connect.psdb.cloud/corejava?sslMode=VERIFY_IDENTITY",
//					  "ifqyd3pf2isr20qla61w",
//					  "pscale_pw_mdpwhyffH4ab61O7D6UXB3ibRTqnICaE1D7n9Jjnxsf");
       connection = DriverManager.getConnection(url, username,password);
		}
		catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return connection;
	}
	
	public static void close(Connection connection , PreparedStatement  ps) {
		try {
			if(ps !=null) {
				ps.close();
			}
			if(connection!= null) {
				connection.close();
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection connection , PreparedStatement  ps , ResultSet  rs) {
		try {
			if(rs !=null) {
				rs.close();
			}
			if(ps !=null) {
				ps.close();
			}
			if(connection!= null) {
				connection.close();
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}