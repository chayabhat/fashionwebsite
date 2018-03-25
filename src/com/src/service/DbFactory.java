package com.src.service;

public class DbFactory {
	private DbFactory()
	{
		
	}
	private static DbIntr di;
	public static DbIntr getInstance() {
		di=new DbImpl();
		return di;
	}

}
