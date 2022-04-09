package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import emp.sql.EmpSQL;

public class ScottJDBC {
	EmpSQL esql;
	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	public ScottJDBC() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = getCon();
	}
	catch(Exception e) {
		System.out.println("#### 연결 실패 ####");
	}
		
	}
	
	public Connection getCon() {
		String sql = "jdbc:oracle:thin:@localhost:1521:xe";
		String user  = "scott";
		String pw = "tiger";
		try {
		con = DriverManager.getConnection(sql,user,pw);
		}
		catch(Exception e) {
			
		}
		return con;
	}
	
	public Statement setStmt(Connection con) {
		stmt= null;
		try {
			stmt = con.createStatement();
		}
		catch(Exception e) {
			
		}
		return stmt;
	}
	
	public PreparedStatement setPstmt(Connection con,int num) {
		pstmt = null;
		try {
			pstmt = con.prepareStatement(esql.setSQL(num));
			
		}
		catch(Exception e) {
			
		}
	
	return pstmt;
	}
	
	
	
	

}
