package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private Connection connection;
	
	private String urlDb;//���ݿ�URL thin���ӷ�ʽ �� Э�飫������ַ����Դ���ƣ�����jdbc:oracle:thin:@localhost:1521:shxtdb
	private String user;//�û���
	private String password;//����
	public DButil(){
		
	}
	public Connection getConnection(){    //���Connection
	     urlDb="jdbc:mysql://localhost:3306/java";//java�����ݿ�����
	     user="root";
	     try
	     {       //��mysql��driverע�ᵽϵͳ��DriverManager��
	         Class.forName("com.mysql.jdbc.Driver");  //ȥ"com.mysql.jdbc"���·������Driver�࣬������ص��ڴ���
	     }catch (ClassNotFoundException  e) {
	         e.printStackTrace();
	    } 
	     try
	     {
	         connection=DriverManager.getConnection(urlDb, user, password);//����mysql���ݿ�
	     }catch (SQLException e) {
	         e.printStackTrace();
	    }
	     return connection;
	 }
}
