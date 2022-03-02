import java.util.Scanner;

public class Quiz03_Conditional {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 : ");
		int math = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 : ");
		int english = Integer.parseInt(sc.nextLine());
		int total = korean + math + english;
		double average = total / 3;

		if (korean >= 40 && math >= 40 && english >= 40 && average >= 60) {
				System.out.println("국어 : " + korean);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + english);
				System.out.println("합계 : " + total);
				System.out.println("평균 : " + average);
				System.out.println("축하합니다, 합격입니다!");
			} else {
				System.out.println("불합격입니다.");
			}
		}
	}
