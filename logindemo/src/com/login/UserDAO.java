package com.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	//�������ݿ����ɾ�Ĳ��������װ���û����ȫ����������
	private DButil db = null;
	public UserDAO() {

	}
	boolean findUser(String userId, String userPwd) {
		db = new DButil();
		Connection connection = db.getConnection();
		try {
			Statement sql = connection.createStatement();     // ��ȡִ��sql�Ķ���
			ResultSet resultSet = sql.executeQuery("select * from user where name='" + userId
			+ "' and password='" + userPwd + "'");
			resultSet.last();        //�������α�ָ������ĩβ
			if (resultSet.getRow() < 1)
				return false;
			else
				return true;
			} catch (Exception e) {
			e.printStackTrace();          //�������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
			return false;
			}
	}
}
