import java.util.Scanner;

public class Quiz06_Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String grade = sc.nextLine();

		if (grade.equals("������")) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} else if (grade.equals("ȸ��")) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} else if (grade.equals("��ȸ��")) {
			System.out.println("�Խñ� ��ȸ");
		} else {
			System.out.println("������, ȸ��, ��ȸ�� �� �ϳ��� �Է��ϼ���.");
		}
	}
}
