import java.util.Scanner;

public class Quiz07_Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double m = Double.parseDouble(sc.nextLine());
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double kg = Double.parseDouble(sc.nextLine());
		double bmi = kg / (m * m);

		System.out.println("BMI ���� : " + bmi);

		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi < 23 && bmi >= 18.5) {
			System.out.println("����ü��");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("��");
		} else if (bmi > 30) {
			System.out.println("�� ��");
		}
	}
}