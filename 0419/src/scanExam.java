import java.util.Scanner;

public class scanExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1000 이하의 자연수를 입력하세요 : ");
		int a=sc.nextInt();
		int b=0;
		int sum=0;
		
		for(int i=1;i*4<a; i++) {
			b=i*4;
			System.out.println(b);
			sum+=b;
		}
		System.out.println("1~"+a+"까지의 4의 배수의 합은 " + sum + "입니다.");

	}

}
