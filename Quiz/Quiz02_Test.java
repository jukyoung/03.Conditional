import java.util.Scanner;

public class Quiz02_Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== ������ �˾ƺ��� �ɸ��׽�Ʈ ===");
		System.out.println("�����ο� �ð��� ���� �; ���۷� ������ �� ���. \n���ۿ��� ���� �ε�� ������ ������ ��ſ��� �Ѱ��� ������ �ִµ��� �װ��� �ٷ� ����!");
		System.out.println("������, ��, ��, �� �߿� �Ѱ��� ������ �����ϼ���.");
		System.out.print(">> ");
		String animal = sc.nextLine();

		if (animal.equals("������")) {
			System.out.println(animal + "�� ������ ���!" + "\n����� ��Ʈ������ �ֿ����� '������� ����'");
			System.out.println("�ΰ����迡�� ���� ū ��Ʈ������ �޴� ���. \n��ȸ��Ȱ�� �ϸ� �ڽŰ� ���� �ʴ� ������� ��ȭ�ϰ� ������ �ϴ°Ϳ� ���� ��Ʈ������ �޽��ϴ�. ");
		} else if (animal.equals("��")) {
			System.out.println(animal + "�� ������ ���!" + "\n����� ��Ʈ������ �ֿ����� '����'");
			System.out.println("���ָ� �ϰ� ���� �ʴٸ� �ؾ��Ѵٴ� ���ڰ��信 �ô޸��� �ֳ׿�.");
		} else if (animal.equals("��")) {
			System.out.println(animal + "�� ������ ���!" + "\n����� ��Ʈ������ �ֿ����� '�ϰ� ����'");
			System.out.println("�̷��� ���� ������ �߾а��� �����θ� ������ �ֳ׿�.");
		} else if (animal.equals("��")) {
			System.out.println(animal + "�� ������ ���!" + "\n����� ��Ʈ������ �ֿ����� '�ݺ��Ǵ� �ϻ�'");
			System.out.println("�¹��� ���� �ݺ��Ǵ� �ϻ� ���� ��Ʈ������ �޴� ���. \n������ �Ӹ����� ������� ���� ������ �� �����ϴ�.");
		} else {
			System.out.println("���⿡ ���� �����Դϴ�. ������ �ٽ� �����ϼ���.");
		}

	}
}
