package chap7;
/*
 * ���� Ŭ���� (Employee) 
 *    1. ���� : ��������, �̸�, �ҼӺμ�
 *    2. ������ :
 *       ��� ��� ������ �Ű������� ����
 * �������� Ŭ���� (FormalEmployee)  
 *    1. ������ȣ
 *    2. ������ :
 *       ������ȣ, �̸�, �ҼӺμ��� �Ű������� ����
 * ���������� (InFormalEmployee)
 *    1. ��ุ����
 *    2. ������ :
 *       �̸�, ��� �������� �Ű������� ����          
 */
class Employee extends Object {
	String type, name, dept;
	Employee(String type,String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}
	public String toString() {
		return "����:" + type + ", �̸�:" + name + ", �μ�:" + dept; 
	}
}
class FormalEmployee extends Employee {
	String empno;
	FormalEmployee (String empno, String name, String dept) {
		super("������",name,dept);
		this.empno = empno;
	}
	public String toString() {
		return super.toString() + ", ������ȣ:" + empno; 
	}
}
class InFormalEmployee extends Employee {
	String expireDate;
	InFormalEmployee(String name,String expireDate ) {
		super("��������",name,"");
		this.expireDate = expireDate;
	}
	public String toString() {
		return super.toString() + ", ��� ������:" + expireDate; 
	}
}
public class EmployeeEx1 {
	public static void main(String[] args) {
		FormalEmployee fe = new FormalEmployee("0001","ȫ�浿","���ߺ�");
		InFormalEmployee ife = new InFormalEmployee("ȫ�浿","20191231");
		System.out.println(fe); //����, ������ȣ, �̸�, �μ� ����ϱ�
		System.out.println(ife);//����, �̸�, ��ุ���� ����ϱ�
	}
}
