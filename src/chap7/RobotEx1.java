package chap7;
/*
 * Robot �� �������� DanceRobot, SingRobot, DrawRobot �� �ִ�
 * Robot Ŭ������ action �޼��带 ����� ������.
 * DanceRobot�� ���� ���� �߰�.
 * SingRobot �� ���� �뷡�� �θ���
 * DrawRobot�� ���� �׸��� �׸���.
 * 
 *  Robot Ŭ������ ������ ���� Robot �� ������ �޴´�.
 *  action �޼���� �߻�޼���� �����ϱ�.
 */
abstract class Robot {
	String type;
	Robot(String type) {
		this.type = type;
	}
	abstract void action();
}
class DanceRobot extends Robot {
	DanceRobot() {
		super("DanceRobot");
	}
	@Override
	void action() {
		System.out.println(type + "�κ��� ���� ��ϴ�");
	}
}
class SingRobot extends Robot {
	SingRobot() {
		super("SingRobot");
	}
	@Override
	void action() {
		System.out.println(type + "�κ��� �뷡�� �θ��ϴ�.");
	}
}
class DrawRobot extends Robot {
	DrawRobot() {
		super("DrawRobot");
	}
	@Override
	void action() {
		System.out.println(type + "�κ��� �׸��� �׸��ϴ�.");
	}
}
public class RobotEx1 {
	public static void main(String[] args) {
		 Robot[] r = new Robot[3];
		 r[0] = new DanceRobot();
		 r[1] = new SingRobot();
		 r[2] = new DrawRobot();
		 for(Robot rb : r) {
			 rb.action();
		 }
	}
}
