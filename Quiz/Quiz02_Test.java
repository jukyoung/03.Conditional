import java.util.Scanner;

public class Quiz02_Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== 동물로 알아보는 심리테스트 ===");
		System.out.println("자유로운 시간을 즐기고 싶어서 정글로 떠나게 된 당신. \n정글에서 만난 인디언 부족의 족장이 당신에게 한가지 선물을 주는데요 그것은 바로 동물!");
		System.out.println("원숭이, 양, 소, 말 중에 한가지 동물을 선택하세요.");
		System.out.print(">> ");
		String animal = sc.nextLine();

		if (animal.equals("원숭이")) {
			System.out.println(animal + "를 선택한 당신!" + "\n당신의 스트레스의 주원인은 '사람과의 관계'");
			System.out.println("인간관계에서 가장 큰 스트레스를 받는 당신. \n사회생활을 하며 자신과 맞지 않는 사람과도 대화하고 어울려야 하는것에 많은 스트레스를 받습니다. ");
		} else if (animal.equals("양")) {
			System.out.println(animal + "을 선택한 당신!" + "\n당신의 스트레스의 주원인은 '연애'");
			System.out.println("연애를 하고 있지 않다면 해야한다는 강박관념에 시달리고 있네요.");
		} else if (animal.equals("소")) {
			System.out.println(animal + "를 선택한 당신!" + "\n당신의 스트레스의 주원인은 '일과 성공'");
			System.out.println("미래에 대한 걱정과 중압감이 스스로를 조르고 있네요.");
		} else if (animal.equals("말")) {
			System.out.println(animal + "을 선택한 당신!" + "\n당신의 스트레스의 주원인은 '반복되는 일상'");
			System.out.println("쳇바퀴 돌듯 반복되는 일상에 가장 스트레스를 받는 당신. \n복잡한 머릿속을 비워내는 것이 먼저일 것 같습니다.");
		} else {
			System.out.println("보기에 없는 동물입니다. 동물을 다시 선택하세요.");
		}

	}
}
