package ontap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	public Person(String firstName, String lastName, String email, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %d", firstName, lastName, email, age);
	}
	
	public boolean equals(Object o) {
		if(o!=null && o instanceof Person) {
			Person that = (Person)o;
			return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName) && this.email.equals(that.email) && this.age == that.age; 
		}
		return false;
	}
	
	public int compareTo(Person p) {
		if (this.age < p.age) return -1;
		else if (this.age > p.age) return 1;
		else return 0;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Cau5Lan6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		List<Person> ds = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String f = sc.next();
			String l = sc.next();
			String e = sc.next();
			int a = sc.nextInt();
			sc.nextLine();
			ds.add(new Person(f, l, e, a));
		}
		
		List<Person> vn = new ArrayList<>();
		for (Person p : ds) {
			if(p.getEmail().endsWith(".vn")) {
				vn.add(p);
			}
		}
		
		Collections.sort(vn, Collections.reverseOrder());
		
		for (int i = 0; i < Math.min(b,  vn.size()); i++) {
			System.out.println(vn.get(i));
		}
	}

}
