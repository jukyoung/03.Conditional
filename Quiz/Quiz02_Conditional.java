import java.util.Scanner;

public class Quiz02_Conditional {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num >= 0 && num % 2 == 0) {
			System.out.println("¦����");
		} else if (num % 2 == 1) {
			System.out.println("Ȧ����");
		} else if (num < 0) {
			System.out.println("����� �Է����ּ���.");
		}
	}
}
