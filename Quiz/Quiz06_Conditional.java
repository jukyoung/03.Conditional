import java.util.Scanner;

public class Quiz06_Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();

		if (grade.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (grade.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (grade.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("관리자, 회원, 비회원 중 하나를 입력하세요.");
		}
	}
}
