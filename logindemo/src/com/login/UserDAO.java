package com.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	//负责数据库的增删改查操作，封装对用户表的全部操作代码
	private DButil db = null;
	public UserDAO() {

	}
	boolean findUser(String userId, String userPwd) {
		db = new DButil();
		Connection connection = db.getConnection();
		try {
			Statement sql = connection.createStatement();     // 获取执行sql的对象
			ResultSet resultSet = sql.executeQuery("select * from user where name='" + userId
			+ "' and password='" + userPwd + "'");
			resultSet.last();        //方法将游标指向结果集末尾
			if (resultSet.getRow() < 1)
				return false;
			else
				return true;
			} catch (Exception e) {
			e.printStackTrace();          //在命令行打印异常信息在程序中出错的位置及原因
			return false;
			}
	}
}
