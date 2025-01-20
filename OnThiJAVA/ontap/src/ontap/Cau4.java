//package ontap;
//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
//
//class Point{
//	private int x;
//	private int y;
//	public Point() {
//		x = 0;
//		y = 0;
//	}
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	public int getX() {
//		return x;
//	}
//	public void setX(int x) {
//		this.x = x;
//	}
//	public int getY() {
//		return y;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//	public void shift(int dx, int dy) {
//		x += dx;
//		y += dy;
//	}
//	public double distance(Point p) {
//		return Math.sqrt((p.x - x)*(p.x - x) + (p.y - y)* (p.y - y));
//	}
//	@Override
//	public String toString() {
//		return String.format("Point(%d, %d)", x , y);
//	}
//}
//class Line{
//	private Point PointA;
//	private Point PointB;
//	public Line(Point pointA, Point pointB) {
//		PointA = pointA;
//		PointB = pointB;
//	}
//	public Point endPointA() {
//		return PointA;
//	}
//	public Point endPointB() {
//		return PointB;
//	}
//	public double length() {
//		return PointA.distance(PointB);
//	}
//	public boolean isVertical() {
//		return PointA.getX() == PointB.getX();
//	}
//	public boolean isHorizontal() {
//		return PointA.getY() == PointB.getY();
//	}
//	@Override
//	public String toString() {
//		return PointA.toString() + "-->" + PointB.toString();
//	}
//}
//public class Cau4 {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		double L = input.nextDouble();
//		List<Line> ds = new ArrayList<>();
//		for (int i=0; i<n; i++) {
//			int x1 = input.nextInt();
//			int y1 = input.nextInt();
//			int x2 = input.nextInt();
//			int y2 = input.nextInt();
//			
//			Point p1 = new Point(x1, y1);
//			Point p2 = new Point(x2, y2);
//			ds.add(new Line(p1, p2));
//		}
//		System.out.printf("Nhung duong thang dai hon %.2f\n", L);
//		System.out.println("Line\tLength");
//		for (Line i : ds) {
//			if (i.length() > L) {
//				System.out.printf("%s\t%.2f\n", i.toString(), i.length());
//			}
//		}
//	}
//
//}
