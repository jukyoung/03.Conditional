import java.util.Scanner;

public class Exam01_Switch {
	public static void main(String[] args) {
        /*
         * switch : ���ǹ� if ���� ����
         *          ��Ұ��谡 �ƴ϶� equal �� (����,Ʋ���� ��)
         * switch(��){
         *   case ���� : �����ڵ�
         *   case ���� : �����ڵ�
         *   case ���� : �����ڵ�
         *   .
         *   .
         *  }
         * */
		// "���"��� ���ڿ��� 3���� ���ڿ��� ���Ͽ� �ڵ带 ����
		
		/* switch ���� ���� �����ؾ� �ϴ� ��
		 * 
		 */
//		switch ("���") {// String, char, int�� ���� �� ��
//		case "�ٳ���":
//			System.out.println("�ٳ����Դϴ�.");
//			break;
//		case "���":
//			System.out.println("����Դϴ�.");
//			break;
//		case "���ξ���":
//			System.out.println("���ξ����Դϴ�.");
//			break;
//		}
		
		//if�� switch ��
		
//		if("���".equals("�ٳ���")) {
//			System.out.println("�ٳ����Դϴ�.");
//		}else if("���".equals("���")) {
//			System.out.println("����Դϴ�.");
//		}else if("���".equals("���ξ���"){
//		System.out.println("���ξ����Դϴ�.");
//	}
		// 1�� �Է��ϸ� 1�� ����ϰ� 2�� �Է��ϸ� 2�� ��� 3�� �Է��ϸ� 3�� ����Ͻÿ�
		// 1,2,3 �� �ƴ� ���� �Է��Ѵٸ� "�߸� �Է��߽��ϴ�."
		//switch
		Scanner sc = new Scanner(System.in);
		System.out.print("1,2,3 �� �Է��ϼ��� >> ");
		//if���� else�� ���� ����  switch���� default
		int num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default: // �� : �⺻��
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
		
	}
}
