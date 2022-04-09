package emp.controller;

import java.util.ArrayList;

import emp.dao.EmpDao;
import emp.vo.empVO;

public class EmpController {
	private EmpDao eDao;
	
	public EmpController() {
	//전체 출력
		eDao = new EmpDao();
//	ArrayList<empVO> list = eDao.getAll();
//	for(empVO e: list) {
//		System.out.println(e);}
	
	
	// 20부서를 입력해서 부서원들의 정보를 조회
//	ArrayList<empVO> list2 = eDao.getDno();
//	for(empVO e: list2) {
//		System.out.println(e);
	//	 SALESMAN 직급을 가진 사원들의 정보 조회
	ArrayList<empVO> list3 = eDao.getJOB();
	for(empVO e: list3) {
		System.out.println(e);
	
	}
	}

	public static void main(String[] args) {
	new EmpController();

	}

}
