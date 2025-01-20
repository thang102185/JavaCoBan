//package ontap;
//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Collections;
//
//class Person implements Comparable<Person>{
//	private String firstName;
//	private String lastName;
//	private String email;
//	private int age;
//	public Person(String firstName, String lastName, String email, int age) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return String.format("Person(%s, %s, %s, %d)", firstName, lastName, email, age);
//	}
//	
//	public boolean equals(Object o) {
//		if(o!=null && o instanceof Person) {
//			Person that = (Person)o;
//			return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName) && this.email.equals(that.email) && this.age == that.age; 
//		}
//		return false;
//	}
//	
//	public int compareTo(Person p) {
//		if (this.age < p.age) return -1;
//		else if (this.age > p.age) return 1;
//		else return 0;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//}
//
//class SocialNetwork{
//	private ArrayList<Person> friendList;
//
//	public SocialNetwork() {
//		friendList = new ArrayList<Person>();
//	}
//	
//	public void add(Person p) {
//		friendList.add(p);
//	}
//	
//	public void add(String f, String l, String e, int a) {
//		friendList.add(new Person(f, l, e, a));
//	}
//	
//	public boolean remove(String email) {
//		for (Person p : friendList) {
//			if(p.getEmail().equals(email)) {
//				friendList.remove(p);
//				return true;
//			}
//		}
//		return false;
//	}
//
//	@Override
//	public String toString() {
//		StringBuilder s = new StringBuilder();
//		for(Person p : friendList) {
//			s.append(p.toString()).append("\n");
//		}
//		return s.toString();
//	}
//	
//	public void sortAsc() {
//		Collections.sort(friendList);
//	}
//	public void sortDesc() {
//		Collections.sort(friendList, Collections.reverseOrder());
//	}
//	public int  getNumFriends() {
//		return friendList.size();
//	}
//	public void clearFriends() {
//		friendList.clear();
//	}
//}
//public class Cau3Lan4 {
//
//	public static void main(String[] args) {
//		// copy đoạn mã dưới đây vào main() của lớp Test
//		Person p1 = new Person("Thuong", "Vo", "thuongvv@vimaru.edu.vn", 44);
//		Person p2 = new Person("Nhi", "Vo", "nhi@yhn.vn", 19);
//
//		SocialNetwork sn = new SocialNetwork();
//		sn.add(p1);
//		sn.add(p2);
//		sn.add("Truc", "Vo", "truc@yhn.vn", 17);
//
//		System.out.print(sn);
//	}
//
//}
