package emp.sql;

public class EmpSQL {
	public static int SEL_ALL = 1;
	public static int SEL_DNO = 2;
	public static int SEL_JOB = 3;
	public static int SEL_JOB_ALL = 4;
	
	
	public String setSQL(int num) {
		StringBuffer buff = new StringBuffer();
	
		if (num == SEL_ALL) {
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate ");
			buff.append("FROM ");
			buff.append("	emp ");
		} else if (num == SEL_DNO) {
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
			buff.append("FROM ");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	AND e.deptno = ? ");
		} else if (num == SEL_JOB) {
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션없음') comm ");
			buff.append("FROM ");
			buff.append("	emp, salgrade ");
			buff.append("WHERE ");
			buff.append("	sal BETWEEN losal AND hisal ");
			buff.append("	AND job = ? ");
		} else if (num == SEL_JOB_ALL) {
			buff.append("SELECT ");
			buff.append("	DISTINCT job ");
			buff.append("FROM ");
			buff.append("	emp ");
		}
		
		
		
		
		
		return buff.toString();	
		
		}
		
	}


