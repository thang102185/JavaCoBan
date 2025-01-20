package ontap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Rectangle implements Comparable<Rectangle>{
	protected int length;
	protected int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int area() {
		return length*width;
	}
	@Override
	public String toString() {
		return String.format("Rectangle(%d, %d)", length, width);
	}
	public int compareTo(Rectangle r) {
		if (this.area() < r.area()) return -1;
		else if (this.area() > r.area()) return 1;
		else return 0;
	}
}
class Square extends Rectangle{
	private double diagonal;

	public Square(int side) {
		super(side, side);
		diagonal = side * 1.4142;
	}
	public int getSide() {
		return getLength();
	}
	@Override
	public String toString() {
		return String.format("Square(%d)", getSide());
	}
	
}
public class Cau4Lan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		List<Rectangle> ds = new ArrayList<>();
		for (int i=0; i<n; i++) {
			int l = sc.nextInt();
			int w = sc.nextInt();
			if(l!=w) {
				ds.add(new Rectangle(l, w));
			}
			else if (l==w) {
				ds.add(new Square(l));
			}
		}
		Collections.sort(ds, Collections.reverseOrder());
		System.out.println("Shape\tArea");
		for(Rectangle r : ds) {
			if(b > 0 && (r.getLength() > 2 && r.getWidth() > 2)) {
				System.out.println(r.toString()+"\t"+r.area());
				b-=1;
			}
		}	
	}

}
