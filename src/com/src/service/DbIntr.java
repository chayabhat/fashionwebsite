package com.src.service;

import java.sql.SQLException;
import java.util.ArrayList;


import com.src.model.loginmodel;
import com.src.model.productmodel;
import com.src.model.profilemodel;
import com.src.model.registerformmodel;
import com.src.model.registermodel;

public interface DbIntr {
	public int insert(registermodel rm)throws SQLException;
	public boolean check(loginmodel m)throws SQLException;
	

	public int insertto(registerformmodel rfm)throws SQLException;
	
	public productmodel getproductdetails(String name)throws SQLException;
	public profilemodel getproduct1()throws SQLException;
}
