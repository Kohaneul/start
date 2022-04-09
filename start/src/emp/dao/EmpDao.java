package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import emp.db.ScottJDBC;
import emp.sql.EmpSQL;
import emp.vo.empVO;

public class EmpDao {
	Scanner sc = new Scanner(System.in);
	private ScottJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private EmpSQL eSQL;
	
	public EmpDao() {
		db = new ScottJDBC();
		eSQL = new EmpSQL();
	}
	
	public ArrayList<empVO> getAll(){
		ArrayList<empVO> list = null;
		
		con = db.getCon();
		String sql = eSQL.setSQL(eSQL.SEL_ALL);
		stmt = db.setStmt(con);
		list = new ArrayList<empVO>();
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				empVO eVO = new empVO();
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat form = new SimpleDateFormat("yyyy년mm월dd일");
				String date = form.format(hdate);
				eVO.setEmpno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHiredate(date);
				list.add(eVO);
			}
						
		}
		catch(Exception e) {
			
		}
		return list;
		
	}
	
	public ArrayList<empVO> getJOB(){
		ArrayList<empVO> list = null;
		try {
			list = new ArrayList<empVO>();
			con = db.getCon();
			String sql = eSQL.setSQL(eSQL.SEL_JOB);
			pstmt = db.setPstmt(con, eSQL.SEL_JOB);
			System.out.println("조회를 원하는 직책 번호를 입력하세요");
			String str = sc.nextLine();
			pstmt.setString(1, str);
			
				jobAll();
			rs = pstmt.executeQuery();
			while(rs.next()) {
				empVO eVO = new empVO();
				//empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션없음') comm 
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat form = new SimpleDateFormat("yyyy년mm월dd일");
				String date = form.format(hdate);
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");
				eVO.setEmpno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHiredate(date);
				eVO.setSal(sal);
				eVO.setGrade(grade);
				eVO.setComm(comm);
				list.add(eVO);
				
			}
			
			}
			catch(Exception e) {
				
			}
			return list;
		}
		
	public void jobAll() {
		con = db.getCon();
		
		try {
			String sql = eSQL.setSQL(eSQL.SEL_JOB_ALL);
			stmt = db.setStmt(con);
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String job = rs.getString("job");
				System.out.print(job+" | ");
			}
		}
		catch(Exception e) {
			
		}
	}
	
	
	public ArrayList<empVO> getDno(){
		ArrayList<empVO> list = null;
		try {
			list = new ArrayList<empVO>();
			con = db.getCon();
			String sql = eSQL.setSQL(eSQL.SEL_DNO);
			pstmt = db.setPstmt(con, eSQL.SEL_DNO);
			System.out.println("조회를 원하는 부서 번호를 입력하세요");
			int num = sc.nextInt();
			pstmt.setInt(1, num);
			
				
			rs = pstmt.executeQuery();
			while(rs.next()) {
				empVO eVO = new empVO();
				//empno, ename, job, hiredate, sal, e.deptno, dname, loc 
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				SimpleDateFormat form = new SimpleDateFormat("yyyy년mm월dd일");
				String date = form.format(hdate);
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				eVO.setEmpno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHiredate(date);
				eVO.setSal(sal);
				eVO.setDeptno(deptno);
				eVO.setDname(dname);
				eVO.setLoc(loc);
				
				list.add(eVO);
				
			}
			
			}
			catch(Exception e) {
				
			}
			return list;
		}
	
	
}
