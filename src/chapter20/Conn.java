package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	Connection conn;
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		Conn c=new Conn();
		c.getConnection();
	}
}
