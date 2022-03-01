import java.util.Scanner;

public class Quiz05_Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id = "myId";
		String password = "myPassword12";

		System.out.print("아이디 : ");
		String id1 = sc.nextLine();
		System.out.print("비밀먼호 : ");
		String password1 = sc.nextLine();

		if (id1.equals(id) && password1.equals(password)) {
			System.out.println("로그인 성공");
		} else if (id != id1 && password.equals(password1)) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (id.equals(id1) && password != password1) {
			System.out.println("비밀번호가 틀렸습니다.");
		}

	}
}
