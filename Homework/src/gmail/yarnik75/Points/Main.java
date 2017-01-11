package gmail.yarnik75.Points;
public class Main {

	public static void main(String[] args) {
		Point p1 = new Point("A", 33, 4);
		Point p2 = new Point("B", 4, 4);
		Point p3 = new Point("C", 21, 4);
		Point p4 = new Point("D", 2, -7);
		Point p5 = new Point("E", 0, 0);
		Point [] points = {p1, p2, p3, p4, p5};
		Array arr = new Array(points);
		arr.sort();
		arr.print();
		
				
    }
}