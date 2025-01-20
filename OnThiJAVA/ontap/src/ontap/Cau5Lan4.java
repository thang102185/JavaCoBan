package ontap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

abstract class Mobile implements Comparable<Mobile>{
	protected String manufacture;
	protected String operatingSystem;
	protected String model;
	protected double cost;
	protected int year;
	public Mobile(String manufacture, String operatingSystem, String model, double cost, int year) {
		this.manufacture = manufacture;
		this.operatingSystem = operatingSystem;
		this.model = model;
		this.cost = cost;
		this.year = year;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	abstract public String toString();
	
	public int compareTo(Mobile m) {
		if (this.cost < m.cost) return -1;
		else if (this.cost > m.cost) return 1;
		else return 0;
	}
}

class Android extends Mobile{

	public Android(String manufacture, String operatingSystem, String model, double cost, int year) {
		super(manufacture, operatingSystem, model, cost, year);
	}
	public String getModel() {
		return "This is Android Mobile - " + super.getModel();
	}
	@Override
	public String toString() {
		return String.format("Android Mobile(%s, %s, %s, %.2f, %d)", getManufacture(), getOperatingSystem(), super.getModel(), getCost(), getYear());
	}
}

class Blackberry extends Mobile{

	public Blackberry(String manufacture, String operatingSystem, String model, double cost, int year) {
		super(manufacture, operatingSystem, model, cost, year);
	}
	public String getModel() {
		return "This is Blackberry Mobile - " + super.getModel();
	}
	public String toString() {
		return String.format("Blackberry Mobile(%s, %s, %s, %.2f, %d)", getManufacture(), getOperatingSystem(), super.getModel(), getCost(), getYear());
	}
}
public class Cau5Lan4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split("\t");
		int n = Integer.parseInt(line[0]);
		int y = Integer.parseInt(line[1]);
		List<Mobile> ds = new ArrayList<>();
		for (int i=0; i<n; i++) {
			String[] data = sc.nextLine().split("\t");
			String d = data[0];
			String m = data[1];
			String o = data[2];
			String mo = data[3];
			double c = Double.parseDouble(data[4]);
			int ye = Integer.parseInt(data[5]);
			if (d.equals("Blackberry")) {
				ds.add(new Blackberry(m, o, mo, c, ye));
			}
			else if (d.equals("Android")) {
				ds.add(new Android(m, o, mo, c, ye));
			}
		}
		
		for (Mobile m : ds) {
			if(m.getYear() == y) {
				System.out.println(m.toString());
			}
		}
	}

}
