import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 1~ 100 ������ �� ����, ��Ģ �����ڸ� �Է¹޾� ����� ����ϴ� ���α׷�
		// ����1: �� ���� ��� 1~100���� / ����2: ��Ģ������ �˻�
		Scanner sc = new Scanner(System.in);

		System.out.println("===== ���� ��Ģ���� ���α׷� (1 ~ 100 ���� �Է�) =====");

		System.out.print("ù ��° ������ �Է��� �ּ���. >> ");
		int n1 = Integer.parseInt(sc.nextLine());

		if (n1 > 0 && n1 <= 100) { // ù ��° ������ 1 ~ 100 ���̶��
			System.out.print("�� ��° ������ �Է��� �ּ���. >> ");
			int n2 = Integer.parseInt(sc.nextLine());

			if (n2 > 0 && n2 <= 100) { // �� ��° ������ 1 ~ 100 ���̶��
				System.out.print("�����ڸ� �Է��� �ּ���(+, -, *, /) >> ");
				String opt = sc.nextLine();
				if (opt.equals("+")) {// ������ �� swich�� �ص���
					System.out.println("������ : " + (n1 + n2));
					if (opt.equals("-")) {
						System.out.println("������ : " + (n1 - n2));
						if (opt.equals("*")) {
							System.out.println("������ : " + (n1 * n2));
							if (opt.equals("/")) {
								System.out.println("������ : " + (n1 / n2));
							}
						}
					}
				} else {// �����ڰ� �߸��ƴٸ�
					System.out.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
				}
			} else {// n2 ������ �ƴ϶��
				System.out.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
			}
		} else {// n1�� ������ �ƴ϶��
			System.out.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
		}
	}   // switch�� ������� switch(opt){
		// case "+" : System.out.println("������ : " + (n1 + n2));
		// break;
		// case "-" : System.out.println("������ : " + (n1 - n2));
		// break;
		// case "*" : System.out.println("������ : " + (n1 * n2));
		// break;
		// case "/" : System.out.println("������ : " + (n1 / n2));
		// break;
		// default : System.put.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.")}
		// -> if (opt.equals("+")) { �ڸ��� �ֱ�
}
