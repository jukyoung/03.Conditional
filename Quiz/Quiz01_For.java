import java.util.Scanner;

public class Quiz01_For {
    public static void main(String[] args) {
    // <������ �����> N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
    //ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���ڸ� �Է��Ͻÿ� >> ");
	int n = Integer.parseInt(sc.nextLine());
	
	for(int i = 1; i < 10; i++) {
		switch(n) {
		case 1 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 2 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 3 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 4 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 5 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 6 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 7 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 8 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
		case 9 :
			System.out.println(n + " * " + i + " = " + (n * i));
			break;
	}
}
}
}