package jdbc.sql_me;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//STMT,PSTMT 지정하고 ARRAYLIST에 넣음
public class stmtAll {

	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	Connection con;
	EmpSQL emp = new EmpSQL();
	SetSQL connect;
	Scanner sc;
	ArrayList<empVO> list;
	
	empVO vo;
	
	public stmtAll() {
		setSQL();
	
	}
	
	
	
	public void setSQL() {
		
		System.out.println("1. 부서(deptno)조회 / 2. 직급(job)조회  / 3. 전체 조회");
		System.out.print("원하는 번호를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		SetSQL connect = new SetSQL();
		con = connect.connect();
		if(num==3) {
			StmtSet();
			list = setAll(con);			
		}
		else if(num==1) {
			list = setDnoInfo(con);
		}
		else if(num==2) {
			allJob();
			list = setJobInfo(con);
		}
		for(empVO o : list) {
			System.out.println(o);
		}
	
		
	}
	
	
	
			
	public void StmtSet() {
		connect = new SetSQL();
		try {
			con = connect.connect();
			stmt = con.createStatement();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void allJob() {
		StmtSet();
		try {
			String sql = emp.getSQL(emp.SEL_JOBLIST);
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String job = rs.getString("job");
				System.out.print(job+" | ");
				
			}
			System.out.println();
		}
		catch(Exception e) {
			
		}
	}
	
	
	public ArrayList<empVO> setAll(Connection con) {
		ArrayList<empVO> list = new ArrayList<empVO>();
		try {
			
			rs = stmt.executeQuery(emp.getSQL(emp.SEL_ALL));
			while(rs.next()) {
				vo = new empVO();
			//	empno, ename, job, hiredate 
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 mm월 dd일");
				String date = form1.format(hdate);
				
				vo.setEmpno(empno);
				vo.setEname(ename);
				vo.setJob(job);
				vo.setHiredate(date);
				list.add(vo);
			
				
			}
			
			
		}
		catch(Exception e) {
			
		}
		return list;
	}
	
	

	
	


	public ArrayList<empVO> setJobInfo(Connection con) {
		ArrayList<empVO> list = new ArrayList<empVO>();
		try {
		
			System.out.print("조회를 원하는 직급: ");
			sc = new Scanner(System.in);
			pstmt = con.prepareStatement(emp.getSQL(emp.SEL_JOBINFO));
			String jobb = sc.nextLine();
			pstmt.setString(1, jobb);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new empVO();
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 mm월 dd일");
				String date = form1.format(hdate);
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");
				vo.setEname(ename);
				vo.setEmpno(empno);
				vo.setJob(job);
				vo.setSal(sal);
				vo.setHiredate(date);
				vo.setGrade(grade);
				vo.setComm(comm);
				list.add(vo);
				
					
			}
			
		}
		catch(Exception e) {
			
		}
		return list;
	}
	
	//dno : 	empno, ename, job, sal, e.deptno dno, hiredate, d.dname name, d.loc loc 
	public ArrayList<empVO> setDnoInfo(Connection con) {
		ArrayList<empVO> list = new ArrayList<empVO>();
		
		System.out.print("조회를 원하는 부서번호: ");
		sc = new Scanner(System.in);
		try {
			list = new ArrayList<empVO>();
			pstmt = con.prepareStatement(emp.getSQL(emp.SEL_DNOINFO));
			int input = sc.nextInt();
			pstmt.setInt(1, input);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new empVO();
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 mm월 dd일");
				String date = form1.format(hdate);
				int dno = rs.getInt("dno");
				String dname = rs.getString("name");
				int sal = rs.getInt("sal");
				String loc = rs.getString("loc");
				vo.setEname(ename);
				vo.setEmpno(empno);
				vo.setJob(job);
				vo.setHiredate(date);
				vo.setDno(dno);
				vo.setLoc(loc);
				vo.setSal(sal);
				vo.setName(dname);
				list.add(vo);
			}
			
		}
		catch(Exception e) {
			
		}
		return list;
	}
	
	
	
	


}
