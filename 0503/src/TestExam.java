import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0;
		int i=0;
		int sum=0;
		
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		
		System.out.println("1~"+num+"���� 3�� ����̸鼭 7�� ����� ���� ���� "+sum+"�Դϴ�.");
		
	}

}
