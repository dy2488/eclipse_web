package dy2488;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		PreparedStatement ps =null;
		int count=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dingyu?serverTimezone=UTC","root","DingYu,!199000521");
			String sql="insert into zhanghu(id,password) values(?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,"aaa");
			ps.setString(2,"666");
			count=ps.executeUpdate();
			
		}catch(Exception e){
			
		}finally {
		     if(conn!=null){
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if(ps!=null){
	                try {
	                    ps.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
		}

	}

}
