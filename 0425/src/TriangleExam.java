public class TriangleExam {

	public static void main(String[] args) {
		 double width = 10.2;
		 double height = 17.3;
		 Triangle t1=new Triangle(width, height);
		 System.out.println("�غ� "+ width + ", ���� "  + height + "�� �ﰢ���� ���̴� " + t1.Area() + "�̴�.");
		 
		 t1.CngT();
		 System.out.println("�ٲ� �غ� "+ width + ", �ٲ� ���� "  + height + "�� �ﰢ���� ���̴� " + t1.Area() + "�̴�.");

	}

}

class Triangle {
	double width;
	double height;
	public Triangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public void CngT() {
		width=7.5;
		height=9.2;
	}
	public double Area() {
		return width*height/2;
	}
}
