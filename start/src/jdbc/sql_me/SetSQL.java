package jdbc.sql_me;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//드라이버 연결
public class SetSQL {
	Connection con;
	
	public SetSQL() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = connect();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection connect() {
		con = null;
			try {
				String sql = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String pw = "tiger";
				con = DriverManager.getConnection(sql,user,pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return con;
	}

}
