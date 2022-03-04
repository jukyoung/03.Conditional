import java.util.Scanner;

public class Quiz01_For {
    public static void main(String[] args) {
    // <구구단 만들기> N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
    //첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자를 입력하시오 >> ");
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