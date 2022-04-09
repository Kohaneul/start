package jdbc.day01;
import java.util.*;
import java.sql.*;
/*
 	
 	이 클래스는 오라클에 있는 emp 테이블에서 부서번호가 ??번인 사원들의 정보를 조회해서 출력해주는 기능을 가진 클래스이다.
 	따라서 이 클래스는 객체가 되는 순간 데이터베이스에 연결될 준비가 되어있어야 한다.(드라이버로딩이 끝난 상태가 되어야 함)
 	
 */

public class PstmtTest01{
	//사용할 변수 선언
	private Connection con;
	private ResultSet rs;
	private PreparedStatement psmt;
	
	PstmtTest01(){
	Scanner sc=  new Scanner(System.in);
	System.out.print("부서번호를 입력 : ");
	int dno = sc.nextInt();
	
	try {
		//작업순서
		//1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. 커넥션 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pw = "tiger";
		con = DriverManager.getConnection(url,user,pw);
		// 이 명령이 정상적으로 실행되면 오라클에서 세션 하나를 확보한 상태가 된다.
		
		//3. 질의명령 준비
		/*
		 	select
		 		empno, ename, detptno, to_char(hiredate,'yyyy/mm/dd')hdate
		 	from
		 		emp
		 	where
		 		deptno = ?;
		 */
		
		StringBuffer buff = new StringBuffer();
		buff.append("select ");
		buff.append("	empno, ename, deptno, to_char(hiredate,'yyyy/mm/dd')hdate ");
		buff.append("from ");
		buff.append("	emp ");
		buff.append("where ");
		buff.append("	deptno = ? ");
		
		String sql = buff.toString();
		
		//4. 명령을 전달할 도구 준비
		psmt = con.prepareStatement(sql);
		
		/*
		  Statement : 프로그램에서 JDBC로 명령을 전달하는 도구
		  			   이때 사용해야되는 질의명령은 완벽한 질의명령이어야 한다..
		  			   
		  			  우리의 경우는 매번 부서번호를 정해서 바꿔야 하는 불완전한 질의명령이다.
		  			  이럴때 사용하는 명령전달도구로 prepareStatement가 있다.
		 */
		
		/*
		 명령전달도구가 준비가 되었지만 도구안에 셋팅된 질의명령은 아직 완벽한 질의명령은 아니다.
		 따라서 질의명령을 완벽하게 만들어줘야 한다.
		 완벽한 질의명령으로 만드는 방법은 ? 에 정확한 데이터를 채워주면 된다.
		 
		 불완전한 질의명령 (?가 있는 질의명령)에 데이터를 채우는 방법
		 	문자열인 경우
		 		psmt.setString(위치값, 데이터);
		 	정수(int)인 경우
		 		psmt.setInt(위치값,데이터);
		 	.....
		 	
		 	이때 위치값은 문자열 중에서 ? 순서를 의미하고 시작값은 1부터 시작.
		 */
		psmt.setInt(1, dno);
		//질의명령 완성이 되었으므로 JDBC에게 전달하고 결과를 전달받음
		rs = psmt.executeQuery();
		//몇사람이 조회될지 알 수 없으므로
		while(rs.next()) {
			int eno = rs.getInt("empno");
			String name = rs.getString("ename");
			String date = rs.getString("hdate");					
			dno = rs.getInt("deptno");
			System.out.printf("%5d - %4s - %10s - %4d\n", eno, name, date, dno);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally{
		try {
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e) {
			
		}
	}
	
	}

	public static void main(String[] args) {
		new PstmtTest01();
	}

}