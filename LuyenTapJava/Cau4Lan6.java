import java.util.Scanner;

class Point{
    private int x;
    private int y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void shift(int dx, int dy){
        x += dx;
        y += dy;
    }
    public double distance(Point that){
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2));
    }

    public String toString() {
        return String.format("Point(%d, %d)", getX(), getY());
    }
}

class Line{
    private Point PointA;
    private Point PointB;
    public Line(Point fromPoint, Point toPoint){
        PointA = fromPoint;
        PointB = toPoint;
    }
    public Point endPointA(){
        return PointA;
    }
    public Point endPointB(){
        return PointB;
    }
    public double length(){
        return PointA.distance(PointB);
    }

    public boolean isVertical(){
        return PointA.getX() == PointB.getX();
    }
    public boolean  isHorizontal(){
        return PointA.getY() == PointB.getY();
    }

    @Override
    public String toString() {
        return String.format("Line([%d, %d], [%d, %d])", PointA.getX(), PointA.getY(), PointB.getX(), PointB.getY());
    }
}
public class Cau4Lan6 {
    public static void main(String[] args) {
        // copy đoãn mã này vào main() của lớp Test
        Point p1 = new Point(-10, 10);
        Point p2 = new Point(-10, -5);

        Line l1 = new Line(p1, p2);
        System.out.println(l1);
        System.out.printf("l1.length() = %.2f", l1.length());
    }
}
