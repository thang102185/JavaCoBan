import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private byte age;
    private double gpa;

    public Student() {
        id = 0;
        name = null;
        age = 0;
        gpa = 0.0;
    }

    public Student(int id, String name, byte age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public byte getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%d, name=%s, age=%d, gpa=%.1f]", getId(), getName(), getAge(), getGpa());
    }
    public void input(Scanner scanner){
        id = Integer.parseInt(scanner.nextLine());
        name = scanner.nextLine();
        age = Byte.parseByte(scanner.nextLine());
        gpa = Double.parseDouble(scanner.nextLine());
    }
}
public class Cau3Lan4 {
    public static void main(String[] args) {
        // copy đoãn mã dưới đây vào main() của lớp Test

        Student stud1 = new Student(1, "Bill", (byte) 23, 8.9);

        Student stud2 = new Student();
        stud2.setId(2);
        stud2.setName("Thuong");
        stud2.setAge((byte)45);
        stud2.setGpa(3.0);

        System.out.println(stud1.getId() + "," + stud1.getName() + "," + stud1.getAge() + "," + stud1.getGpa());
        System.out.println(stud2);
    }
}
