//import java.util.ArrayList;
//import java.util.List;
//import java.util.ArrayList;
//
//abstract class Person{
//    protected String fullName;
//    protected String gender;
//    protected String phone;
//    protected String email;
//    public Person(String fullName, String gender, String phone, String email){
//        this.fullName = fullName;
//        this.gender = gender;
//        this.phone = phone;
//        this.email = email;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public void purchaseParkingPass(){}
//    public abstract String toString();
//}
//class Student extends Person{
//    private String studentId;
//    private double theory;
//    private double practice;
//
//    public Student(String fullName, String gender, String phone, String email, String studentId, double theory, double practice) {
//        super(fullName, gender, phone, email);
//        this.studentId = studentId;
//        if(theory >= 0 && theory <= 10)
//            this.theory = theory;
//        if(practice >= 0 && practice <= 10)
//            this.practice = practice;
//    }
//
//    public String getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    public double getTheory() {
//        return theory;
//    }
//
//    public void setTheory(double theory) {
//        if(theory >= 0 && theory <= 10)
//            this.theory = theory;
//    }
//
//    public double getPractice() {
//        return practice;
//    }
//
//    public void setPractice(double practice) {
//        if(practice >= 0 && practice <= 10)
//            this.practice = practice;
//    }
//    public double calculateFinalMark(){
//        return ((theory + practice) / 2);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Student(%s, %s, %s, %s, %s, %.2f, %.2f)", getFullName(), getGender(), getPhone(), getEmail(), getStudentId(), getTheory(), getPractice());
//    }
//}
//class Teacher extends Person{
//    private double basicSalary;
//    private double subsidy;
//
//    public Teacher(String fullName, String gender, String phone, String email, double basicSalary, double subsidy) {
//        super(fullName, gender, phone, email);
//        this.basicSalary = basicSalary;
//        this.subsidy = subsidy;
//    }
//
//    public double getBasicSalary() {
//        return basicSalary;
//    }
//
//    public void setBasicSalary(double basicSalary) {
//        this.basicSalary = basicSalary;
//    }
//
//    public double getSubsidy() {
//        return subsidy;
//    }
//
//    public void setSubsidy(double subsidy) {
//        this.subsidy = subsidy;
//    }
//    public double calculateSalary(){
//        return  (basicSalary + subsidy);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Teacher(%s, %s, %s, %s, %.2f, %.2f)", getFullName(), getGender(), getPhone(), getEmail(), getBasicSalary(), getSubsidy());
//    }
//}
//
//public class Cau4Lan2 {
//    public static void main(String[] args) {
//        // copy đoạn mã này vào main() của lớp Test
//        // dòng mã dưới:
//        List<Person> list = new ArrayList<Person>();
//        //List list = new ArrayList();
//        list.add( new Teacher("Vo Van Thuong", "Nam", "0903170915", "thuongvv@vimaru.edu.vn", 7000000, 3000000) );
//        list.add( new Student("Dang Khanh Phuong", "Nu", "0903170915", "kp@danang.gov.vn", "12345", 7.0, 9.0) );
//
//        list.add( new Teacher("Le Dai Nhan", "Nam", "0905269932", "dn@vimaru.edu.vn", 10000000, 5000000) );
//        list.add( new Student("Dang Kim Yen", "Nu", "0905123456", "ky@danang.gov.vn", "12345", 6.0, 7.0) );
//
//        for (Person p: list) {
//            System.out.println(p);
//        }
//    }
//}
