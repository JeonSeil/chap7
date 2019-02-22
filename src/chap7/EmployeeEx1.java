package chap7;
/*
 * 직원 클래스 (Employee) 
 *    1. 변수 : 직원구분, 이름, 소속부서
 *    2. 생성자 :
 *       모든 멤버 변수를 매개변수로 가짐
 * 정규직원 클래스 (FormalEmployee)  
 *    1. 직원번호
 *    2. 생성자 :
 *       직원번호, 이름, 소속부서를 매개변수로 가짐
 * 비정규직원 (InFormalEmployee)
 *    1. 계약만료일
 *    2. 생성자 :
 *       이름, 계약 만료일을 매개변수로 가짐          
 */
class Employee extends Object {
	String type, name, dept;
	Employee(String type,String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}
	public String toString() {
		return "구분:" + type + ", 이름:" + name + ", 부서:" + dept; 
	}
}
class FormalEmployee extends Employee {
	String empno;
	FormalEmployee (String empno, String name, String dept) {
		super("정규직",name,dept);
		this.empno = empno;
	}
	public String toString() {
		return super.toString() + ", 직원번호:" + empno; 
	}
}
class InFormalEmployee extends Employee {
	String expireDate;
	InFormalEmployee(String name,String expireDate ) {
		super("비정규직",name,"");
		this.expireDate = expireDate;
	}
	public String toString() {
		return super.toString() + ", 계약 만료일:" + expireDate; 
	}
}
public class EmployeeEx1 {
	public static void main(String[] args) {
		FormalEmployee fe = new FormalEmployee("0001","홍길동","개발부");
		InFormalEmployee ife = new InFormalEmployee("홍길동","20191231");
		System.out.println(fe); //구분, 직원번호, 이름, 부서 출력하기
		System.out.println(ife);//구분, 이름, 계약만료일 출력하기
	}
}
