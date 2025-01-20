//package ontap;
//import java.util.*;
//abstract class Mobile implements Comparable<Mobile>{
//	protected String manufacture;
//	protected String operatingSystem;
//	protected String model;
//	protected double cost;
//	protected int year;
//
//	public Mobile(String manufacture, String operatingSystem, String model, double cost, int year) {
//		this.manufacture = manufacture;
//		this.operatingSystem = operatingSystem;
//		this.model = model;
//		this.cost = cost;
//		this.year = year;
//	}
//
//	public String getManufacture() {
//		return manufacture;
//	}
//
//	public void setManufacture(String manufacture) {
//		this.manufacture = manufacture;
//	}
//
//	public String getOperatingSystem() {
//		return operatingSystem;
//	}
//
//	public void setOperatingSystem(String operatingSystem) {
//		this.operatingSystem = operatingSystem;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public double getCost() {
//		return cost;
//	}
//
//	public void setCost(double cost) {
//		this.cost = cost;
//	}
//
//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		this.year = year;
//	}
//	abstract public String toString();
//	public int compareTo(Mobile that){
//		if (this.cost < that.cost){
//			return -1;
//		} else if (this.cost > that.cost) {
//			return 1;
//		}
//		else return 0;
//	}
//}
//class Android extends Mobile{
//	public Android(String manufacture, String operatingSystem, String model, double cost, int year) {
//		super(manufacture, operatingSystem, model, cost, year);
//	}
//
//	public String getModel() {
//		return "This is Android Mobile - " + super.getModel();
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Android Mobile(%s, %s, %s, %.2f, %d)", getManufacture(), getOperatingSystem(), super.getModel(), getCost(), getYear());
//	}
//}
//class Blackberry extends Mobile {
//	public Blackberry(String manufacture, String operatingSystem, String model, double cost, int year) {
//		super(manufacture, operatingSystem, model, cost, year);
//	}
//
//	public String getModel() {
//		return "This is Blackberry Mobile - " + super.getModel();
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Blackberry Mobile(%s, %s, %s, %.2f, %d)",	getManufacture(), getOperatingSystem(), super.getModel(), getCost(), getYear());
//	}
//}
//public class Cau5Lan3 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String[] Line = scanner.nextLine().split("\t");
//		int n = Integer.parseInt(Line[0]);
//		int b = Integer.parseInt(Line[1]);
//
//		List<Mobile> mobiles = new ArrayList<>();
//
//		for (int i = 0; i < n; i++) {
//			String[] data = scanner.nextLine().split("\t");
//			if (data[0].equals("Android")) {
//				mobiles.add(new Android(data[1], data[2], data[3], Double.parseDouble(data[4]), Integer.parseInt(data[5])));
//			} else if (data[0].equals("Blackberry")) {
//				mobiles.add(new Blackberry(data[1], data[2], data[3], Double.parseDouble(data[4]), Integer.parseInt(data[5])));
//			}
//		}
//
//		// Sắp xếp theo cost giảm dần
//		Collections.sort(mobiles, Collections.reverseOrder());
//
//		// In ra b điện thoại có cost cao nhất
//		for (Mobile m : mobiles) {
//			if(b > 0) {
//				System.out.println(m.toString());
//				b-=1;
//			}
//		}
//	}
//}
