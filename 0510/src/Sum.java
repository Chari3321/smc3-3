import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작 숫자 : ");
		int n1=scan.nextInt();
		System.out.println("마지막 숫자 : ");
		int n2=scan.nextInt();
		int sum=0;
		
		for(int i=n1;i<=n2;i++) {
			sum+=i;
		}
		
		System.out.println(n1+"부터 "+n2+"까지의 합은 "+sum);
	}
}
