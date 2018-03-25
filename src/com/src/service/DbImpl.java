package com.src.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import com.src.model.loginmodel;
import com.src.model.productmodel;
import com.src.model.profilemodel;
import com.src.model.registerformmodel;
import com.src.model.registermodel;

public class DbImpl implements DbIntr {
	private static Connection con;

	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","yadav");
			
		}
		catch(SQLException|ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}
	}
	public int insert(registermodel rm)throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("insert into register1 values(?,?,?,?,?,?)");
		ps.setString(1,rm.getUsername());
		ps.setString(2,rm.getPassword());
		ps.setString(3,rm.getAge());
		ps.setString(4,rm.getGender());
		ps.setString(5,rm.getPhoneno());
		ps.setString(6,rm.getEmail());
		System.out.println(ps);
		//System.out.println(rm.getUsername());
		//System.out.println(rm.getPassword());
		
		return ps.executeUpdate();
		
	}
	
	public boolean check(loginmodel m)throws SQLException
	{
		String query="select username,password from register1 where username='"+m.getUsername()+"'and password='"+m.getPassword()+"'";
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println(query);
		return rs.next();
		}
	
	public int insertto(registerformmodel rfm)throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("insert into details values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,rfm.getFirstname());
		ps.setString(2,rfm.getLastname());
		ps.setString(3,rfm.getEmail());
		ps.setString(4,rfm.getAddress());
		ps.setString(5,rfm.getCountry());
		ps.setString(6,rfm.getCity());
		ps.setString(7,rfm.getState());
		ps.setString(8,rfm.getPincode());
		ps.setString(9,rfm.getContact());
		ps.setString(10,rfm.getShipping());
		ps.setString(11,rfm.getPayment());
		
		System.out.println(ps);
		//System.out.println(rm.getUsername());
		//System.out.println(rm.getPassword());
		
		return ps.executeUpdate();
}
	
	public productmodel getproductdetails(String name)throws SQLException
	{
		PreparedStatement pst=con.prepareStatement("select * from productdetails where name=?");
		pst.setString(1,name);
		ResultSet  rs=pst.executeQuery();
		productmodel m=new productmodel();
		while(rs.next())
		{
			m.setName(rs.getString(1));
			m.setProductid(rs.getInt(2));
			m.setProductname(rs.getString(3));
			m.setBrand(rs.getString(4));
			m.setDescription(rs.getString(5));
			m.setPrice(rs.getString(6));
			
			
		
		}
		return m;
	}
	
	public profilemodel getproduct1()throws SQLException
	{
		PreparedStatement pst=con.prepareStatement("select * from register1 where username=?");
	
		ResultSet  rs=pst.executeQuery();
		profilemodel m1=new profilemodel();
		while(rs.next())
		{
			
			m1.setUsername(rs.getString(1));
			m1.setPassword(rs.getString(2));
			m1.setEmail(rs.getString(5));
			m1.setEmail(rs.getString(6));
			
		
		}
		return m1;
	}
}
