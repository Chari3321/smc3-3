import java.util.Scanner;

public class scanExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1000 ������ �ڿ����� �Է��ϼ��� : ");
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=1;i*4<a; i++) {
			System.out.println(i*4);
			sum+=i*4;
		}
		System.out.println("1~"+a+"������ 4�� ����� ���� " + sum + "�Դϴ�.");

	}

}
