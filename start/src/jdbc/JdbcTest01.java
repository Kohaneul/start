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


public class JdbcTest01 {
	public final int SEL_ALL = 0;
	public final int SEL_DNOINFO = 1;
	public final int SEL_JOBINFO = 2;
	//작업에 필요한 변수 선언
			Connection con;
			Statement stmt;
			PreparedStatement pstmt;
			ResultSet rs;

/*
 	emp라는 데이터를 조회하는데 dno라는 문자열을 입력받으면 부서번호를 입력받아서 해당 부서의 
 	부서원들의 사원번호, 사원이름, 직급,  급여, 부서번호, 부서이름, 부서위치를 출력해주고
 	job이라는 문자열을 입력받으면 해당 직급을 가진 사원들의 사원번호, 사원이름, 직급,입사일, 급여, 급여등급, 커미션을
 	조회하는 프로그램을 작성하세요(preparedstatement)
 	
 	all을 입력받으면 모든 사원들의 사원번호, 사원이름, 직급, 입사일 조회하도록 하고 프로그램을 작성하세요.(statement)
 	
 	단 exit라는 단어가 입력되면 프로그램이 즉시 종료되게 하세요.
 	
 	select 
 	from emp e, dept d
 	where e.deptno = d.deptno;
 	
 	이 클래스는 사용자가 어떤것을 입력을 하던지 결국 오라클을 사용할 준비가 되어있어야 한다.
 	따라서 이 클래스가 new 되는 순간 드라이버 로딩이 완료되면 편하다.
 	
*/	
	public JdbcTest01() {
		
		
		try {
		//드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		getInput();
		
		}
		catch(Exception e) {
			System.out.println("## 서버 로딩 실패 ##");
		}
	
	

	//코드(정수)를 입력받으면 그 코드에 해당하는 질의명령을 반환해주는 함수
		
		
		/*
		 * emp라는 데이터를 조회하는데 dno라는 문자열을 입력받으면 부서번호를 입력받아서 해당 부서의 
 		부서원들의 사원번호, 사원이름, 직급,  급여, 부서번호, 부서이름, 부서위치를 출력해주고
 		job이라는 문자열을 입력받으면 해당 직급을 가진 사원들의 사원번호, 사원이름, 직급,입사일, 급여, 급여등급, 커미션을
 	조회하는 프로그램을 작성하세요(preparedstatement)
 	
 	all을 입력받으면 모든 사원들의 사원번호, 사원이름, 직급, 입사일 조회하도록 하고 프로그램을 작성하세요.(statement)
 	
 	단 exit라는 단어가 입력되면 프로그램이 즉시 종료되게 하세요.
 	
 	
 	select empno, ename, job,hiredate,sal, s.grade, nvl(to_char(comm),'커미션없음') comm
 	from emp, salgrade
 	where sal between losal and hisal and job = ?
 		  ;
		 * 
		 * 
		 */
	}
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_ALL:
			buff.append("select ");
			buff.append("	empno, ename, job, hiredate ");
			buff.append("from ");
			buff.append(" 	emp ");
			break;
			
		case SEL_DNOINFO:
			System.out.print("부서번호를 입력하세요 ");
	
			buff.append("select ");
			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
			buff.append("from ");
			buff.append(" 	emp e, dept d ");
			buff.append("where ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	and e.deptno = ? ");
			break;
		case SEL_JOBINFO:
			buff.append("select ");
			buff.append("	empno, ename, job, hiredate, sal, grade, nvl(to_char(comm),'커미션없음') comm ");
			buff.append("from ");
			buff.append(" 	emp, salgrade ");
			buff.append("where ");
			buff.append(" 	sal between losal and hisal ");
			buff.append("	and job = ? ");
			
			break;
		}
		
		/*
		 	SELECT	ENAME , 
		 	FROM EMP E, DEPT D
		 	WHERE E.DEPTNO = D.DETPNO;
		 */
		return buff.toString();
	}
	
	//문자열 입력받는 함수
	public void getInput() {
		//Scanner을 이용해서 문자열을 입력받고 각 문자열들마다 입력받을 내용도 또 받아서 실행시켜주는 함수
		
		//작업순서
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		//메세지 출력
		System.out.print("부서번호 조회는  dno\n직급으로 조회 : job\n모든 사원조회 : all\n명령 입력 : ");
		String str = sc.nextLine();
		
		switch(str){
		case "dno":
			getAll();
			break;
		case "job":
			getAll();
			break;
		case "all":
			getAll();
			break;
			
		}
		
		
		}
	//모든사원의 정보를 출력해주는 기능의 함수
	public void getAll() {
		// 이 함수에서는 데이터베이스에 연결해서 질의명령을 보내고 결과를 받아서 출력해주면 된다.
		// 할일
		try {
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pw = "tiger";
		con = DriverManager.getConnection(url,user,pw);
		
		
		//질의명령 준비
		String sql = getSQL(SEL_ALL);
		//명령 전달도구 준비
		stmt = con.createStatement();
		
		//질의명령을 보내고 결과를 받아서
		rs = stmt.executeQuery(sql); //질의명령(sql) 실어서 보내기
		
		//결과를 출력해줘야 한다.
		//몇행을 꺼내왔는지 알 수 없으므로
		while(rs.next()) {
		//empno, ename, job, hiredate");
		int eno = rs.getInt("empno");
		String name = rs.getString("ename");
		String job = rs.getString("job");
		//jdbc에서는 데이터베이스에서 날짜데이터를 꺼내올 떄 날짜와 시간을 따로 꺼내오도록 함수를 분리해서 만들어놓았다.
		//날짜데이터
		Date hdate = rs.getDate("hiredate"); //날짜만 꺼내오는 함수
		//시간데이터
		Time htime = rs.getTime("hiredate");//시간만 꺼내오는 함수
		
		/*
		 	날짜데이터를 원하는 문자열로 바꿔주는 형식화 클래스
		 	SimpleDateFormat form  = new SimpleDateFormat(날짜형식문자열);
		 	String sdate = form.format(hdate);
		 	
		 */
		
		SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:MM:SS ");
		String sdate = form1.format(hdate) + form2.format(htime);
		
		//출력
		System.out.printf("%5d | %10s | %10s | %24s\n", eno,name,job,sdate);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				//자원반환
				rs.close();
				stmt.close();
				con.close();
			}
			catch(Exception e) {
				
			}
		}
	}
	
	
	

	
	public static void main(String[] args) {
	new JdbcTest01();

	}

}
