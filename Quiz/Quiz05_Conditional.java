import java.util.Scanner;

public class Quiz05_Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id = "myId";
		String password = "myPassword12";

		System.out.print("���̵� : ");
		String id1 = sc.nextLine();
		System.out.print("��и�ȣ : ");
		String password1 = sc.nextLine();

		if (id1.equals(id) && password1.equals(password)) {
			System.out.println("�α��� ����");
		} else if (id != id1 && password.equals(password1)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else if (id.equals(id1) && password != password1) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}

	}
}
