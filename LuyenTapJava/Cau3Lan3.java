import java.util.ArrayList;
import java.util.Collections;

class Person implements  Comparable<Person>{
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
        return String.format("Person(%s, %s, %s, %d)", firstName, lastName, email, age);
    }
    public boolean equals(Object o){
        if(o != null && o instanceof Person){
            Person p = (Person) o;
            return (firstName.equals(p.firstName) && lastName.equals(p.lastName) && email.equals(p.email) && age == p.age);
        }
        return false;
    }

    @Override
    public int compareTo(Person p) {
        if(age > p.age) return 1;
        else if(age == p.age) return 0;
        else return -1;
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
class SocialNetwork{
    private ArrayList<Person> friendList;

    public SocialNetwork() {
        friendList = new ArrayList<>();
    }
    public void add(Person p){
        friendList.add(p);
    }
    public void add(String firstName, String lastName, String email, int age){
        friendList.add(new Person(firstName, lastName, email, age));
    }
    public boolean remove(String email){
        for (Person p : friendList){
            if (p.getEmail().equals(email)){
                friendList.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Person p : friendList){
            s.append(p.toString()).append("\n");
        }
        return s.toString();
    }
    public void sortAsc(){
        Collections.sort(friendList);
    }
    public void sortDesc(){
        Collections.sort(friendList, Collections.reverseOrder());
    }
    public int getNumFriends(){
        return friendList.size();
    }
    public void clearFriends(){
        friendList.clear();
    }
}
public class Cau3Lan3 {
    public static void main(String[] args) {
        // copy đoạn mã dưới đây vào main() của lớp Test
        Person p1 = new Person("Thuong", "Vo", "thuongvv@vimaru.edu.vn", 44);
        Person p2 = new Person("Nhi", "Vo", "nhi@yhn.vn", 19);

        SocialNetwork sn = new SocialNetwork();
        sn.add(p1);
        sn.add(p2);
        sn.add("Truc", "Vo", "truc@yhn.vn", 17);

        System.out.print(sn);
    }
}
