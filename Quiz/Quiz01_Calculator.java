import java.util.Scanner;

public class Quiz01_Calculator {
     public static void main(String[] args) {
		
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("=== 계산기 프로그램 ===");
		 System.out.print("숫자 입력1 > ");
		 int n1 = Integer.parseInt(sc.nextLine());
		 
		 System.out.print("숫자 입력2 > ");
		 int n2 = Integer.parseInt(sc.nextLine());
		 
		 System.out.print("연산자 입력(=,-,*,/) > ");
		 String c1 = sc.nextLine();
		 
		 if(c1.equals("+")) {
			 System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		 }else if(c1.equals("-")) {
			 System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		 }else if(c1.equals("*")) {
			 System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		 }else if(c1.equals("/")) {
			 System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		 }else {
			 System.out.println("올바른 연산자가 아닙니다.");
		 }
	}
}
