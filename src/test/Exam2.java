package test;
/*
회사에는 여러 유형의 직원들이 있다.
직원은 정규직원과 비정규직원 으로 나뉜다.
비정규직원은 임시직원과 인턴 사원으로 나뉜다.

모든 직원은 직원구분(type), 이름(name) 정보를 가진다.
정규직원은 직원번호(empNo), 직급(position),  연봉(salary)을 멤버로 가진다.
비정규직원은 계약만료일(expireDate), 기본임금(primaryPay)을 멤버로 가진다.
임시직원은 시간당 임금(timePay), 근무시간(empTime)을 멤버로 가진다.
인턴사원은 임금지급율(payRate)을 멤버로 가진다.

 직원클래스(Employee)
 정규직원(FormalEmployee)
 비정규직원(InformalEmployee)
 임시직원 (TempEmployee)
 인턴직원(InternEmployee) 클래스를  한다.    

 클래스의 객체 생성시 각각의 멤버변수를 입력받아 객체를 생성한다.
  
 모든 직원은 급여를 받는다. getPay() 메서드.
 정규직원은 급여로 연봉 / 12 로 
 비정규직원은 기본입금
 임시직원 기본임금 + (시간당 임금 * 근무시간)
 인턴사원은 기본임금 * 임금지급율      

각각의 클래스를 구현하기
[결과]
정규직사원 :김정규의 급여 : 416
비정규직사원 :이비정의 급여 : 1000
임시직사원 :박임시의 급여 : 50
인턴사원사원 :김인턴의 급여 : 1600
*/
abstract class Employee {
	String type;
	String name;

	public Employee(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	abstract int getPay();
}
class FormalEmployee extends Employee {
	String empno;
	String position;
	int salary;
	public FormalEmployee(String name, String empno, int salary,String position ) {
		super("정규직", name);
		this.empno = empno;
		this.position = position;
		this.salary = salary;
	}
	@Override
	int getPay() {
		return salary/12;
	}	
}
class InformalEmployee extends Employee {
	String expireDate;
	int primaryPay;
	public InformalEmployee(String type, String name, String expireDate, int primaryPay) {
		super(type, name);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	public InformalEmployee(String name, String expireDate, int primaryPay) {
		super("비정규직", name);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	@Override
	int getPay() {
		return primaryPay;
	}
}
class TempEmployee extends InformalEmployee {
	int timePay;
	int empTime;
	public TempEmployee(String name, String expireDate, int primaryPay, int timePay, int empTime) {
		super("임시직", name, expireDate, primaryPay);
		this.timePay = timePay;
		this.empTime = empTime;
	}
	@Override
	int getPay() {
		return primaryPay + (timePay * empTime);
	}
}
class InternEmployee extends InformalEmployee {
	float payRate;

	public InternEmployee(String name, String expireDate, int primaryPay, float payRate) {
		super("인턴사원", name, expireDate, primaryPay);
		this.payRate = payRate;
	}
	@Override
	int getPay() {
		return (int)(primaryPay * payRate);
	}
}
public class Exam2 {
	public static void main(String[] args) {
		  Employee[] emps = new Employee[4];
		  emps[0]= new FormalEmployee("김정규", "1", 5000, "과장");
		  emps[1] = new InformalEmployee("이비정", "20191231", 1000);
		  emps[2] = new TempEmployee("박임시", "20191231", 0, 1, 50);
		  emps[3] = new InternEmployee("김인턴", "20191231", 2000, 0.8f);
		  for (Employee e : emps) {
		   System.out.println(e.type + "사원 :" + e.name + "의 급여 : " + e.getPay());
		  }
	}
}
