import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int i=0;
		int big=0;
		int bignum=0;
		
		for(i=0;i<arr.length;i++) {
			System.out.println((i+1)+"�� �Է� : ");
			arr[i]=sc.nextInt();
		}
		
		
		for(i=0;i<arr.length;i++) {
			if(big<=arr[i]) {
				big=arr[i];
				bignum=i+1;
			}
		}
		
		System.out.println("���� ū ���� "+bignum+"��° ������ "+big);
		

	}

}
