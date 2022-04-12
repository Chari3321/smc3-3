import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int i=0;
		int big=0;
		int bignum=0;
		
		for(i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번 입력 : ");
			arr[i]=sc.nextInt();
		}
		
		
		for(i=0;i<arr.length;i++) {
			if(big<=arr[i]) {
				big=arr[i];
				bignum=i+1;
			}
		}
		
		System.out.println("가장 큰 수는 "+bignum+"번째 숫자인 "+big);
		

	}

}
