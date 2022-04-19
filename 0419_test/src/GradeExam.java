import java.util.Scanner;

public class GradeExam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Grade me=new Grade();
		
		System.out.print("영어 수학 과학 순서대로 3개 점수 입력 : ");
		me.english=sc.nextInt();
		me.math=sc.nextInt();
		me.science=sc.nextInt();
		
		System.out.println("평균은 : " + me.average());

	}

}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}