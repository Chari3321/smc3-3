import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� ��!");
		String user=scan.next();
		String com="";
		int comN=(int)(Math.random()*3+1);
		
		switch(comN) {
			case 1 : com="����"; break;
			case 2 : com="����"; break;
			case 3 : com="��"; break;
			default : System.out.println("��...�� �߸�����");
		}
		
		System.out.println(com);
		
		if(user.equals(com)) { System.out.println("����."); }
		else if(user.equals("����") && com.equals("����")) { System.out.println("����."); }
		else if(user.equals("����") && com.equals("��")) { System.out.println("����."); }
		else if(user.equals("��") && com.equals("����")) { System.out.println("����."); }
		else if(user.equals("����") && com.equals("����")) { System.out.println("�̰��."); }
		else if(user.equals("����") && com.equals("��")) { System.out.println("�̰��."); }
		else if(user.equals("��") && com.equals("����")) { System.out.println("�̰��."); }
		else { System.out.println("���� �̻���"); }
	}
}