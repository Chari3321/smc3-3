import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String s = sc.next();

		int total = 0;

		switch (s) {
		case "-":
			total = n1 - n2;
			break;
		case "+":
			total = n1 + n2;
			break;
		case "*":
			total = n1 * n2;
			break;
		case "/":
			total = n1 / n2;
			break;
		}
		
		System.out.println(total);
	}

}
