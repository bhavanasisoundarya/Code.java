package in.soundaryabavanasi.soundbricks.dao;
import in.soundaryabavanasi.soundbricks.interfaceFiles.UserInterface;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.model.UserEntity;
import in.soundaryabavanasi.soundbricks.util.ConnectionUtil;

import java.sql.*;
import java.util.*;

public class UserDAO implements UserInterface{

	public Set<User> findAll() throws RuntimeException {	
		
		Connection con = null;
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		Set<User> userList = new HashSet<>();
		
		try {
			
			String query = "SELECT * FROM users WHERE isactive = 1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
            rs = ps.executeQuery();
           
			
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
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
	public void create(User newUser) throws RuntimeException{
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			String query = "INSERT INTO users (firstname, lastname, email, password) VALUES (?,?,?,?)";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, newUser.getFirstname());
			ps.setString(2, newUser.getLastname());
			ps.setString(3, newUser.getPassword());
			ps.setString(4, newUser.getEmail());
			ps.executeUpdate(query);
	           
			System.out.print("Successfull");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		}finally {
			ConnectionUtil.close(conn, ps);
		}
					
				
			
		}
	



	


//	@Override
//	public void update() {
//		// TODO Auto-generated method stub
//		return null;
//		
//	}
//
//@Override
//	public void delete() {
//		// TODO Auto-generated method stub
//		
//	}



	@Override
	public User findById(int userId) {
		Connection conn = null;
		PreparedStatement ps = null;
		User users = null;
		ResultSet rs = null;
		
		
		try {
			
			String query = "SELECT * FROM users WHERE is_active = 1 AND id=?";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, userId);
			rs = ps.executeQuery();
	
			while(rs.next()) {
				users = new User();
				users.setId(rs.getInt("id"));
				users.setFirstname(rs.getString("firstname"));
				users.setLastname(rs.getString("lastname"));
				users.setEmail(rs.getString("email"));
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
	public void update( ) {
//		String query = "SELECT * FROM users WHERE is_active = 1 AND id=?";
//		conn = ConnectionUtil.getConnection();
//		ps = conn.prepareStatement(query);
//		ps.setInt(1, userId);
//		rs = ps.executeQuery();
//
//		while(rs.next()) {
//			user = new User();
//			user.setId(rs.getInt("id"));
//			user.setFirstname(rs.getString("firstname"));
//			user.setLastname(rs.getString("lastname"));
//			user.setEmail(rs.getString("email"));
//			user.setPassword(rs.getString("password"));
//			user.setActive(rs.getBoolean("isActive"));
//		}
//	}catch (SQLException e) {
//		e.printStackTrace();
//		System.out.println(e.getMessage());
//		throw new RuntimeException();
//		
//	}finally {
//		ConnectionUtil.close(conn, ps, rs);
//	}
//	
//	return user;
		
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