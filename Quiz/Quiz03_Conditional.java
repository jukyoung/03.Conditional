import java.util.Scanner;

public class Quiz03_Conditional {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int korean = Integer.parseInt(sc.nextLine());
		System.out.print("�������� : ");
		int math = Integer.parseInt(sc.nextLine());
		System.out.print("�������� : ");
		int english = Integer.parseInt(sc.nextLine());
		int total = korean + math + english;
		double average = total / 3;

		if (korean >= 40 && math >= 40 && english >= 40) {
			if (average >= 60) {
				System.out.println("���� : " + korean);
				System.out.println("���� : " + math);
				System.out.println("���� : " + english);
				System.out.println("�հ� : " + total);
				System.out.println("��� : " + average);
				System.out.println("�����մϴ�, �հ��Դϴ�!");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		}
	}
}
