public class TriangleExam {

	public static void main(String[] args) {
		 double width = 10.2;
		 double height = 17.3;
		 Triangle t1=new Triangle(width, height);
		 System.out.println("πÿ∫Ø "+ width + ", ≥Ù¿Ã "  + height + "¿Œ ªÔ∞¢«¸¿« ≥–¿Ã¥¬ " + t1.Area() + "¿Ã¥Ÿ.");
		 
		 t1.CngT();
		 System.out.println("πŸ≤Ô πÿ∫Ø "+ width + ", πŸ≤Ô ≥Ù¿Ã "  + height + "¿Œ ªÔ∞¢«¸¿« ≥–¿Ã¥¬ " + t1.Area() + "¿Ã¥Ÿ.");

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
