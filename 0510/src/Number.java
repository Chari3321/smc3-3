import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        
        int []arr=new int[10];
        
        int i=0;
        
        for(i=0;i<10;i++) {
        	arr[i]=(int)(Math.random()*50+1);
        	System.out.print(arr[i]+" ");
        }
        
        
        for(i=0;i<10;i++) {
        	if(num==arr[i]) {
        		System.out.println("\n��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
        		break;
        	}
        }
        if(i==10) {
        	System.out.println("\n��! ���� ��ȸ��~");
        }
 
	}
}


