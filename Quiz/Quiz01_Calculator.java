import java.util.Scanner;

public class Quiz01_Calculator {
     public static void main(String[] args) {
		
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("=== ���� ���α׷� ===");
		 System.out.print("���� �Է�1 > ");
		 int n1 = Integer.parseInt(sc.nextLine());
		 
		 System.out.print("���� �Է�2 > ");
		 int n2 = Integer.parseInt(sc.nextLine());
		 
		 System.out.print("������ �Է�(=,-,*,/) > ");
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
			 System.out.println("�ùٸ� �����ڰ� �ƴմϴ�.");
		 }
	}
}
