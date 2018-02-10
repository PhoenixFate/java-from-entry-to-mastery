package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class Gradation {
	private static Connection conn;
	private static Statement statement;
	private static ResultSet resultSet;
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
		Gradation g=new Gradation();
		conn=g.getConnection();
		try {
			statement=conn.createStatement();
			String sql="select * from student";
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()){
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				System.out.println("id:"+id);
				System.out.println("name:"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
