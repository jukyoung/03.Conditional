import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 1~ 100 사이의 두 정수, 사칙 연산자를 입력받아 결과를 출력하는 프로그램
		// 조건1: 두 정수 모두 1~100사이 / 조건2: 사칙연산자 검사
		Scanner sc = new Scanner(System.in);

		System.out.println("===== 정수 사칙연산 프로그램 (1 ~ 100 사이 입력) =====");

		System.out.print("첫 번째 정수를 입력해 주세요. >> ");
		int n1 = Integer.parseInt(sc.nextLine());

		if (n1 > 0 && n1 <= 100) { // 첫 번째 정수가 1 ~ 100 사이라면
			System.out.print("두 번째 정수를 입력해 주세요. >> ");
			int n2 = Integer.parseInt(sc.nextLine());

			if (n2 > 0 && n2 <= 100) { // 두 번째 정수가 1 ~ 100 사이라면
				System.out.print("연산자를 입력해 주세요(+, -, *, /) >> ");
				String opt = sc.nextLine();
				if (opt.equals("+")) {// 연산자 비교 swich로 해도됨
					System.out.println("연산결과 : " + (n1 + n2));
					if (opt.equals("-")) {
						System.out.println("연산결과 : " + (n1 - n2));
						if (opt.equals("*")) {
							System.out.println("연산결과 : " + (n1 * n2));
							if (opt.equals("/")) {
								System.out.println("연산결과 : " + (n1 / n2));
							}
						}
					}
				} else {// 연산자가 잘못됐다면
					System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
				}
			} else {// n2 조건이 아니라면
				System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
			}
		} else {// n1이 조건이 아니라면
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
		}
	}   // switch로 했을경우 switch(opt){
		// case "+" : System.out.println("연산결과 : " + (n1 + n2));
		// break;
		// case "-" : System.out.println("연산결과 : " + (n1 - n2));
		// break;
		// case "*" : System.out.println("연산결과 : " + (n1 * n2));
		// break;
		// case "/" : System.out.println("연산결과 : " + (n1 / n2));
		// break;
		// default : System.put.println("잘못된 입력입니다. 프로그램을 종료합니다.")}
		// -> if (opt.equals("+")) { 자리에 넣기
}
