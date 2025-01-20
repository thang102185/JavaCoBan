//package ontap;
//class Point{
//	private int x;
//	private int y;
//	
//	public Point() {
//		x = 0;
//		y = 0;
//	}
//
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//	public void shift(int dx, int dy) {
//		x += dx;
//		y += dy;
//	}
//	
//	public double distance(Point p) {
//		return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Point(%d, %d)", x, y);
//	}
//}
//
//class Line{
//	private Point pointA;
//	private Point pointB;
//	public Line(Point pointA, Point pointB) {
//		this.pointA = pointA;
//		this.pointB = pointB;
//	}
//	public Point endPointA() {
//		return pointA;
//	}
//	public Point endPointB() {
//		return pointB;
//	}
//	
//	public double length() {
//		return pointA.distance(pointB);
//	}
//	public boolean isVertical() {
//		return pointA.getX() == pointB.getX();
//	}
//	@Override
//	public String toString() {
//		return String.format("Line([%d, %d], [%d, %d])", pointA.getX(), pointA.getY(), pointB.getX(), pointB.getY());
//	}
//	
//}
//public class Cau4Lan3 {
//
//	public static void main(String[] args) {
//		// copy đoãn mã này vào main() của lớp Test
//		Point p1 = new Point(1, 1);
//		System.out.println(p1);
//
//		System.out.println("p1.shift(2, 4);");
//		p1.shift(2, 4);
//		System.out.println(p1.toString());
//	}
//
//}
