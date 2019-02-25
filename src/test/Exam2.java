package test;
/*
ȸ�翡�� ���� ������ �������� �ִ�.
������ ���������� ���������� ���� ������.
������������ �ӽ������� ���� ������� ������.

��� ������ ��������(type), �̸�(name) ������ ������.
���������� ������ȣ(empNo), ����(position),  ����(salary)�� ����� ������.
������������ ��ุ����(expireDate), �⺻�ӱ�(primaryPay)�� ����� ������.
�ӽ������� �ð��� �ӱ�(timePay), �ٹ��ð�(empTime)�� ����� ������.
���ϻ���� �ӱ�������(payRate)�� ����� ������.

 ����Ŭ����(Employee)
 ��������(FormalEmployee)
 ����������(InformalEmployee)
 �ӽ����� (TempEmployee)
 ��������(InternEmployee) Ŭ������  �Ѵ�.    

 Ŭ������ ��ü ������ ������ ��������� �Է¹޾� ��ü�� �����Ѵ�.
  
 ��� ������ �޿��� �޴´�. getPay() �޼���.
 ���������� �޿��� ���� / 12 �� 
 ������������ �⺻�Ա�
 �ӽ����� �⺻�ӱ� + (�ð��� �ӱ� * �ٹ��ð�)
 ���ϻ���� �⺻�ӱ� * �ӱ�������      

������ Ŭ������ �����ϱ�
[���]
��������� :�������� �޿� : 416
����������� :�̺����� �޿� : 1000
�ӽ������ :���ӽ��� �޿� : 50
���ϻ����� :�������� �޿� : 1600
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
		super("������", name);
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
		super("��������", name);
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
		super("�ӽ���", name, expireDate, primaryPay);
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
		super("���ϻ��", name, expireDate, primaryPay);
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
		  emps[0]= new FormalEmployee("������", "1", 5000, "����");
		  emps[1] = new InformalEmployee("�̺���", "20191231", 1000);
		  emps[2] = new TempEmployee("���ӽ�", "20191231", 0, 1, 50);
		  emps[3] = new InternEmployee("������", "20191231", 2000, 0.8f);
		  for (Employee e : emps) {
		   System.out.println(e.type + "��� :" + e.name + "�� �޿� : " + e.getPay());
		  }
	}
}
