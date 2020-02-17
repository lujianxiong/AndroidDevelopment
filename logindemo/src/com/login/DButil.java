package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private Connection connection;
	
	private String urlDb;//数据库URL thin连接方式 ： 协议＋主机地址＋资源名称；例：jdbc:oracle:thin:@localhost:1521:shxtdb
	private String user;//用户名
	private String password;//密码
	public DButil(){
		
	}
	public Connection getConnection(){    //获得Connection
	     urlDb="jdbc:mysql://localhost:3306/java";//java是数据库名字
	     user="root";
	     try
	     {       //将mysql的driver注册到系统的DriverManager中
	         Class.forName("com.mysql.jdbc.Driver");  //去"com.mysql.jdbc"这个路径下找Driver类，将其加载到内存中
	     }catch (ClassNotFoundException  e) {
	         e.printStackTrace();
	    } 
	     try
	     {
	         connection=DriverManager.getConnection(urlDb, user, password);//连接mysql数据库
	     }catch (SQLException e) {
	         e.printStackTrace();
	    }
	     return connection;
	 }
}
