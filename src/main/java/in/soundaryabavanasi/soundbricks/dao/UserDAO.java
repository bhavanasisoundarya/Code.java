package in.soundaryabavanasi.soundbricks.dao;
import in.soundaryabavanasi.soundbricks.interfaceFiles.UserInterface;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.model.UserEntity;
import in.soundaryabavanasi.soundbricks.util.ConnectionUtil;

import java.sql.*;
import java.util.*;

import com.mysql.cj.xdevapi.Result;

public class UserDAO implements UserInterface{

	public Set<User> findAll() {	
		
		Connection con = null;
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		Set<User> userList = new HashSet<>();
		
		try {
			
			String query = "SELECT * FROM users WHERE isActive = 1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
            rs = ps.executeQuery();
           
			
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("id"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setEmailId(rs.getString("emailId"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("isActive"));
				userList.add(user);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		}finally {
			ConnectionUtil.close(con, ps, rs);
		}
		
		return userList;
	}
	
	@Override
	public void create(User newUser) {
		Connection conn = null;
		PreparedStatement ps = null;
		Result rs = null;
		
		try {
			String query = "INSERT INTO users (firstName, lastName, emailId, password) VALUES (?,?,?,?)";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			
			ps.setString(1, newUser.getFirstName());
			ps.setString(2, newUser.getLastName());
			ps.setString(3, newUser.getEmailId());
			ps.setString(4, newUser.getPassword());
			
			ps.executeUpdate(query);
	           
			System.out.print("User has been created successfully");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		}finally {
			ConnectionUtil.close(conn, ps);
		}
					
				
			
	}
	


	@Override
	public User findById(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		User users = null;
		ResultSet rs = null;
		
		
		try {
			
			String query = "SELECT * FROM users WHERE isActive = 1 AND id=?";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
	
			while(rs.next()) {
				users = new User();
				users.setUserId(rs.getInt("id"));
				users.setFirstName(rs.getString("firstName"));
				users.setLastName(rs.getString("lastName"));
				users.setEmailId(rs.getString("emailId"));
				users.setPassword(rs.getString("password"));
				users.setActive(rs.getBoolean("isActive"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		}finally {
			ConnectionUtil.close(conn, ps, rs);
		}
		
		return users;
	
		
	}
	



	@Override
	public User findByEmail(String ermail) {
		
		return null;
	}



	
	public int countOfActiveUsers() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void update( int id, User updateuser) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			String query = "UPDATE users SET firstName = ?, lastName = ? WHERE isActive = 1 AND id = ?";
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(query);
			

			
			ps.setString(1, updateuser.getFirstName());
			ps.setString(2,  updateuser.getFirstName());
			ps.setInt(3, id);
			ps.executeUpdate();
			
			System.out.println("User has been updated successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		} finally {
			ConnectionUtil.close(connection, ps);
		}
		
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * @param id
	 * @param updateUser
	 */
	
//	public void update(int id, UserEntity updateUser) {
//		
//		UserEntity[] userList = UserList.listOfUsers;
//		
//		for(int i=0; i<userList.length; i++) {
//			
//			UserEntity user = userList[i];
//			
//			if(user==null) {
//				continue;
//			}
//			
//			if(user.getId()==id) {
////				user.setFirstName("Thara");
//				
//				user.setFirstName(updateUser.getFirstName());
//				user.setLastName(updateUser.getLastName());
//				user.setPassword(updateUser.getPassword());
//				
//				break;
//			}
//			
//		}
//		
//	}
//	
//	public void delete(int id) {
//			
//			UserEntity[] userList = UserList.listOfUsers;
//			
//			for(int i=0; i<userList.length; i++) {
//				
//				UserEntity user = userList[i];
//				
//				if(user==null) {
//					continue;
//				}
//				
//				if(user.getId()==id) {
//					user.setActive(false);
//					break;
//				}
//			}
//		}
//
//	public UserEntity findById(int id) {
//		UserEntity[] userList = UserList.listOfUsers;
//		UserEntity userMatch = null;
//	
//		for (int i = 0; i < userList.length; i++) {
//			UserEntity user = userList[i];
//			if (user.getId() == id) {
//				userMatch = user;
//				break;
//			}
//		}
//		return userMatch;
//	}
//	
}