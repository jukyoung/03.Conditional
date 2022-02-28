import java.util.Scanner;

public class Exam01_Switch {
	public static void main(String[] args) {
        /*
         * switch : 조건문 if 문과 유사
         *          대소관계가 아니라 equal 비교 (같다,틀리다 비교)
         * switch(값){
         *   case 조건 : 실행코드
         *   case 조건 : 실행코드
         *   case 조건 : 실행코드
         *   .
         *   .
         *  }
         * */
		// "사과"라는 문자열을 3개의 문자열과 비교하여 코드를 실행
		
		/* switch 문을 쓸때 주의해야 하는 점
		 * 
		 */
//		switch ("사과") {// String, char, int와 같은 값 비교
//		case "바나나":
//			System.out.println("바나나입니다.");
//			break;
//		case "사과":
//			System.out.println("사과입니다.");
//			break;
//		case "파인애플":
//			System.out.println("파인애플입니다.");
//			break;
//		}
		
		//if와 switch 비교
		
//		if("사과".equals("바나나")) {
//			System.out.println("바나나입니다.");
//		}else if("사과".equals("사과")) {
//			System.out.println("사과입니다.");
//		}else if("사과".equals("파인애플"){
//		System.out.println("파인애플입니다.");
//	}
		// 1을 입력하면 1을 출력하고 2를 입력하면 2를 출력 3을 입력하면 3을 출력하시오
		// 1,2,3 이 아닌 수를 입력한다면 "잘못 입력했습니다."
		//switch
		Scanner sc = new Scanner(System.in);
		System.out.print("1,2,3 중 입력하세요 >> ");
		//if문의 else와 같은 역할  switch문의 default
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
		default: // 뜻 : 기본값
			System.out.println("잘못 입력했습니다.");
		}
		
		
	}
}
