import java.util.Scanner;

public class Quiz07_Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double m = Double.parseDouble(sc.nextLine());
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = Double.parseDouble(sc.nextLine());
		double bmi = kg / (m * m);

		System.out.println("BMI 지수 : " + bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23 && bmi >= 18.5) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else if (bmi > 30) {
			System.out.println("고도 비만");
		}
	}
}