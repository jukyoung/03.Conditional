import java.util.Scanner;

public class Exam02_If {
	public static void main(String[] args) {

		// �� �� ������ ���ǹ�
		// �Է°� -> ����ڰ� �Է��� ���� 50���� �۴ٸ� 1�� ���
		// 50 �̻��̶�� 2�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >> ");
		int input = Integer.parseInt(sc.nextLine());

		/*
		  if(input < 50) { System.out.println("1"); 
		  }else if(input >= 50) {
		      System.out.println("2"); }
		 */
		// �Էµ� ���� 0~50 ���̶�� 1�� ���
		// 51~100 ���̶�� 2�� ���
		// 1. �Է� >= 0 // �Է� <= 50
//		if (0 <= input && input <= 50) {
//			System.out.println(1);
//		} else if (51 <= input && input <= 100) { // 2.�Է� >= 51 // �Է� <= 100
//			System.out.println(2);
//		} // 51 <= input �� ���ǽ��� �ʼ��ϱ�..? 
		 //-> �� ������ ������ ���� ����ڰ� -1�� �Է��ߴ� ġ�� input <= 100 ���ǿ� �¾Ƽ� 2��� ��°��� ����
		
		// �Էµ� ������ ���� �ش��ϴ� ����� ���
		/* 100�� : �о������
		 * 70~99�� : ���� ���
		 * 69�� ���� : ����� ���
		 * 69�� ���� �� �� 30�� ���� : �����н� ���*/
		if(input == 100) {
			System.out.println("�о������");
		}else if(input >=70 && input <= 99) {
			System.out.println("���� ���");
		}else if(input >= 0 && input <= 69) {
			System.out.println("����� ���");
			if(input <= 30) {
				System.out.println("�����н� ���");
			}
		}else {
			System.out.println("������ �߸� �Է��߽��ϴ�.");
		}
	
				
		// ��ø if�� ���ǵ� �ӿ��� ���� ������ �ϰ������ (if�� ���ο� if�� �ֱ�)
		// �� 90�� �̻� �л��̶�� A�� ��� 95�� �̻� �л��� �ִٸ� �о������ �ְڴ�. 
//		int score = 91;
//		if(score >= 90){
//		System.out.println("A");
//		if(score>= 95) {
//			System.out.println("�о������");
//			if(score == 100) {
//				System.out.println("����");
//			}
		 }
			}
		
		
		
	

