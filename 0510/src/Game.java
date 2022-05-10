import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보!");
		String user=scan.next();
		String com="";
		int comN=(int)(Math.random()*3+1);
		
		switch(comN) {
			case 1 : com="가위"; break;
			case 2 : com="바위"; break;
			case 3 : com="보"; break;
			default : System.out.println("몬가...몬가 잘못됐음");
		}
		
		System.out.println(com);
		
		if(user.equals(com)) { System.out.println("비겼다."); }
		else if(user.equals("가위") && com.equals("바위")) { System.out.println("졌다."); }
		else if(user.equals("바위") && com.equals("보")) { System.out.println("졌다."); }
		else if(user.equals("보") && com.equals("가위")) { System.out.println("졌다."); }
		else if(user.equals("바위") && com.equals("가위")) { System.out.println("이겼다."); }
		else if(user.equals("가위") && com.equals("보")) { System.out.println("이겼다."); }
		else if(user.equals("보") && com.equals("바위")) { System.out.println("이겼다."); }
		else { System.out.println("뭔가 이상함"); }
	}
}