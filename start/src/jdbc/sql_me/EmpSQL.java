package jdbc.sql_me;

/*
 	사원들의 정보와 관련된 데이터베이스작업을 할 떄 필요한 질의명령을 모아놓았다가 요구하면 
 	해당 질의명령을 내보내주는 기능을 가진 클래스
 	
  
  
  */
public class EmpSQL {
	//코드변수
	public final int SEL_ALL = 1001;
	public final int SEL_DNOINFO=1002;
	public final int SEL_JOBINFO=1003;
	public final int SEL_JOBLIST=1004;
	
	//질의명령을 기억하고 있다가 요청하면 반환해주는 함수
	public String getSQL(int code) {
		//이 함수가 할일 : 질의명령으로 된 문자열 반환해주는 일.
		//질의명령은 한 행으로 작성하면 가독성에 문제가 있기 때문에 보통 줄바꿈 , 들여쓰기를 이용해서 작성한다.
		//여기서도 이 방법을 사용할 건데, 문자열을 결합연산할때마다 힙영역에 새로운 객체를 만들게 된다는 점에 있어서 이 문제점을 피할 목적으로 
		//StringBuffer을 사용해서 처리하기로 한다. 최종적으로는 StringBuffer에 결합된 문자열을 반환하면 된다.
		//반환값을 만들 변수
		StringBuffer buff= new StringBuffer();
		//코드가 어떤거냐에 따라 달라짐
		switch(code) {	
			case SEL_ALL : 
				buff.append("select ");
				buff.append("	empno, ename, job, hiredate ");
				buff.append("from ");
				buff.append("	emp ");
				break;
			case SEL_DNOINFO : 
				buff.append("select ");
				buff.append("	empno, ename, job, sal, e.deptno dno, hiredate, d.dname name, d.loc loc ");
				buff.append("from ");
				buff.append("	emp e, dept d ");
				buff.append("where ");
				buff.append("	e.deptno = d.deptno and e.deptno = ? ");
				
				break;
			case SEL_JOBINFO : 
				buff.append("select ");
				buff.append("	empno, ename, job, hiredate, sal, grade, nvl(to_char(comm),'커미션 없음') comm ");
				buff.append("from ");
				buff.append("	emp , salgrade ");
				buff.append("where ");
				buff.append("	sal between losal and hisal and job = ? ");
				break;
			case SEL_JOBLIST :
				buff.append("select distinct ");
				buff.append("	job ");
				buff.append("from ");
				buff.append("	emp ");
			
			}
		return buff.toString();
	}
	
	
	
}
