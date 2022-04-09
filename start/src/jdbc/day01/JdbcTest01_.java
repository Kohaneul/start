package jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import jdbc.sql_me.EmpSQL;



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


public class JdbcTest01_ {
	
	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	EmpSQL eSQL;
	
	
	JdbcTest01_(){
		setting();
	}
	
	public void setting() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url,id,pw);
			Scanner sc = new Scanner(System.in);
			choose(sc);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		
			try {
				rs.close();
				
			}
			catch(Exception e) {
				
			}
		}
	}
	
	public void choose(Scanner sc) {
		System.out.println("dno, job, all 중 하나를 입력하시오");
		eSQL = new EmpSQL();
		String str = sc.nextLine();
		switch(str) {
		case "dno":
			setDep(sc);
			break;
		case "job":
			setJob(sc);
			break;
		case "all":
			setAll();
			break;
		}
	
	}
	/*
	 * public final int SEL_ALL = 1001;
		public final int SEL_DNOINFO=1002;
		public final int SEL_JOBINFO=1003;
		public final int SEL_JOBLIST=1004;
	 * 
	 * */
	
	
	public void JobAll() {
		try {
		String alljob = eSQL.getSQL(eSQL.SEL_JOBLIST);	
		stmt = con.createStatement();
		rs = stmt.executeQuery(alljob);
		while(rs.next()) {
			String jb = rs.getString("job");
			System.out.print(jb+" | ");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void setDep(Scanner sc) {
		try {
		System.out.println("조회를 원하는 부서번호를 입력하세요");
			int num = sc.nextInt();
			String dept = eSQL.getSQL(eSQL.SEL_DNOINFO);
			pstmt = con.prepareStatement(dept);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//empno, ename, job, sal, e.deptno , hiredate, d.dname, d.loc
			
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int dno = rs.getInt("dno");
				String dname = rs.getString("name");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat format1 = new SimpleDateFormat("YYYY년 MM월 DD일");
				String date = format1.format(hdate);
				String loc = rs.getString("loc");
				int sal = rs.getInt("sal");
			
				System.out.println(no+" : "+name+" : "+job +" : "+dno+" : "+date+" : "+sal+" : "+dname+" : "+loc);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					rs.close();
				}
				catch(Exception e) {
					
				}
			}
		
	}
	
	
	
		//empno, ename, job, hiredate, sal, grade, nvl(to_char(comm),'커미션 없음') comm ");
	public void setJob(Scanner sc) {
		try {
		System.out.println("조회를 원하는 직급을 입력하세요");
			JobAll();
	
			String jobname = sc.nextLine();
			String job = eSQL.getSQL(eSQL.SEL_JOBINFO);
			pstmt = con.prepareStatement(job);
			pstmt.setString(1, jobname);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat format1 = new SimpleDateFormat("YYYY년 MM월 DD일");
				String date = format1.format(hdate);
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");
				System.out.println(no+" : "+name+" : "+job +" : "+date+" : "+sal+" : "+grade+" : "+comm);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
				con.close();
			}
			catch(Exception e) {
			}
		}
		
		}
		
	
	
	public void setAll() {
		
		try {
			
			String all = eSQL.getSQL(eSQL.SEL_ALL);
			stmt = con.createStatement();
			rs = stmt.executeQuery(all);
			while(rs.next()) {//empno, ename, job, hiredate 
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat format1 = new SimpleDateFormat("YYYY년 MM월 DD일");
				String date = format1.format(hdate);
				System.out.println(no+" : "+name+" : "+job +" : "+date);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				con.close();
			}
			catch(Exception e) {
			}
		}
		
		
	}


	
	public static void main(String[] args) {
	new JdbcTest01_();

	}

}
