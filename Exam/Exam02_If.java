import java.util.Scanner;

public class Exam02_If {
	public static void main(String[] args) {

		// 좀 더 복잡한 조건문
		// 입력값 -> 사용자가 입력한 값이 50보다 작다면 1을 출력
		// 50 이상이라면 2를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 >> ");
		int input = Integer.parseInt(sc.nextLine());

		/*
		  if(input < 50) { System.out.println("1"); 
		  }else if(input >= 50) {
		      System.out.println("2"); }
		 */
		// 입력된 수가 0~50 사이라면 1을 출력
		// 51~100 사이라면 2를 출력
		// 1. 입력 >= 0 // 입력 <= 50
//		if (0 <= input && input <= 50) {
//			System.out.println(1);
//		} else if (51 <= input && input <= 100) { // 2.입력 >= 51 // 입력 <= 100
//			System.out.println(2);
//		} // 51 <= input 이 조건식이 필수일까..? 
		 //-> 이 조건이 없을때 만약 사용자가 -1을 입력했다 치면 input <= 100 조건에 맞아서 2라는 출력값이 나옴
		
		// 입력된 점수에 따라 해당하는 결과를 출력
		/* 100점 : 학업우수상
		 * 70~99점 : 시험 통과
		 * 69점 이하 : 재시험 대상
		 * 69점 이하 그 중 30점 이하 : 보충학습 대상*/
		if(input == 100) {
			System.out.println("학업우수상");
		}else if(input >=70 && input <= 99) {
			System.out.println("시험 통과");
		}else if(input >= 0 && input <= 69) {
			System.out.println("재시험 대상");
			if(input <= 30) {
				System.out.println("보충학습 대상");
			}
		}else {
			System.out.println("점수를 잘못 입력했습니다.");
		}
	
				
		// 중첩 if문 조건들 속에서 세부 조건을 하고싶으면 (if문 내부에 if문 넣기)
		// 예 90점 이상 학생이라면 A를 출력 95점 이상 학생이 있다면 학업우수상 주겠다. 
//		int score = 91;
//		if(score >= 90){
//		System.out.println("A");
//		if(score>= 95) {
//			System.out.println("학업우수상");
//			if(score == 100) {
//				System.out.println("만점");
//			}
		 }
			}
		
		
		
	

