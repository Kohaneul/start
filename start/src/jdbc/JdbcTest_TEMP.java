package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



/*
 * emp라는 데이터를 조회하는데 dno라는 문자열을 입력받으면 부서번호를 입력받아서 해당 부서의 
 	부서원들의 사원번호, 사원이름, 직급,  급여, 부서번호, 부서이름, 부서위치를 출력해주고
 	job이라는 문자열을 입력받으면 해당 직급을 가진 사원들의 사원번호, 사원이름, 직급,입사일, 급여, 급여등급, 커미션을
 	조회하는 프로그램을 작성하세요(preparedstatement)
	all을 입력받으면 모든 사원들의 사원번호, 사원이름, 직급, 입사일 조회하도록 하고 프로그램을 작성하세요.(statement)
 	
 	단 exit라는 단어가 입력되면 프로그램이 즉시 종료되게 하세요.

 all
 select empno, ename, job, hiredate
 from emp
 
 dno
 
 select empno, ename, job, sal, e.deptno, d.dname, d.loc
 from emp e, dept d
 where e.deptno = d.deptno and job = 'MANAGER';
 
 job
 
 select empno, ename, job, hiredate, sal, grade, nvl(to_char(comm),'커미션 없음')
 from emp , salgrade
 where sal between losal and hisal;
 */


public class JdbcTest_TEMP {
	public final static int SET_ALL = 0;
	public final static int SET_JOB = 1;
	public final static int SET_DNO = 2;
	Connection con;
	ResultSet rs;
	Statement stmt;
	PreparedStatement pstmt;
	
	JdbcTest_TEMP(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			setting();
		}
		catch(Exception e) {
			System.out.println("@@@ 서버 연결 실패 @@@");
		}
	}
	
	public void setting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("all , job, dno 중 입력");
		String str = sc.nextLine();
		switch(str) {
		case "all":
			setAll();
			break;
		case "job":
			setJob();
			break;
		case "dno":
			setDno();
			break;
		}
		
		
	}
	
	public void setDno() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url,id, pw);
			String dep = setInput(SET_DNO);
			pstmt = con.prepareStatement(dep);
			Scanner sc = new Scanner(System.in);
			System.out.println("조회를 원하는 부서를 입력하시오");
			int num = sc.nextInt();
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String jb = rs.getString("job");
				int sal = rs.getInt("sal");
				int dno = rs.getInt("dno");
				String dname = rs.getString("name");
				String loc = rs.getString("loc");
				System.out.println(no+"|"+name+"|"+jb+"|"+sal+"|"+dno+"|"+dname+"|"+loc);
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}
			catch(Exception e) 
			{
				
			}
		}
		
	}
	
	
	
	
	
	public void setJob() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url,id, pw);
			String job = setInput(SET_JOB);
			pstmt = con.prepareStatement(job);
			Scanner sc = new Scanner(System.in);
			System.out.println("조회를 원하는 직급을 입력하시오");
			String job2 = sc.nextLine();
			pstmt.setString(1, job2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String jb = rs.getString("job");
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String com = rs.getString("comm");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 mm월 dd일");
				SimpleDateFormat form2 = new SimpleDateFormat("hh:mm:ss");
				String time = form1.format(hdate)+form2.format(htime);
				System.out.println(no+"|"+name+"|"+jb+"|"+sal+"|"+grade+"|"+com+"|"+time);
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}
			catch(Exception e) 
			{
				
			}
		}
		
	}
	public void setAll() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url,id, pw);
			String input = setInput(SET_ALL);
			stmt = con.createStatement();
			rs = stmt.executeQuery(input);
			while(rs.next()) {
				//empno, ename, job, hiredate
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String job= rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				SimpleDateFormat format1 = new SimpleDateFormat("YYYY년 MM월 dd일");
				SimpleDateFormat format2 = new SimpleDateFormat("hh:mm:ss");
				String time = format1.format(hdate)+format2.format(htime);
				System.out.println(no+" | "+name+" | "+job+" | "+time);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}
			catch(Exception e) {
				
			}
		}
		
		
	}
	
	

	
	
	public String setInput(int num) {
		StringBuffer buff = new StringBuffer();
		switch(num) {
		case SET_ALL : 
			buff.append("select ");
			buff.append("	empno, ename, job, hiredate ");
			buff.append("from ");
			buff.append("	emp ");
			break;
		case SET_DNO : 
			buff.append("select ");
			buff.append("	empno, ename, job, sal, e.deptno dno, d.dname name, d.loc loc ");
			buff.append("from ");
			buff.append("	emp e, dept d ");
			buff.append("where ");
			buff.append("	e.deptno = d.deptno and e.deptno = ? ");
			
			break;
		case SET_JOB : 
			buff.append("select ");
			buff.append("	empno, ename, job, hiredate, sal, grade, nvl(to_char(comm),'커미션 없음') comm ");
			buff.append("from ");
			buff.append("	emp , salgrade ");
			buff.append("where ");
			buff.append("	sal between losal and hisal and job = ? ");
			
			break;
		}
		
		return buff.toString();
	}
	
	
	
	

	
	public static void main(String[] args) {
	new JdbcTest_TEMP();

	}

}
