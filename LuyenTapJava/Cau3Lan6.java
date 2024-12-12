import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course{
    private String code;
    private String name;
    private double duration;
    private String status;
    private String flag;

    public Course() {
        code = null;
        name = null;
        duration = 0.0;
        status = null;
        flag = null;
    }

    public Course(String code, String name, double duration, String status, String flag) {
        this.setCode(code);
        this.name = name;
        this.duration = duration;
        this.setStatus(status);
        this.setFlag(flag);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public String getStatus() {
        return status;
    }

    public String getFlag() {
        return flag;
    }

    public void setCode(String code) {
        if (code != null && code.matches("^FW\\d{3}$")) {
            this.code = code;
        } else {
            throw new IllegalArgumentException("Tham so khong hop le.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setStatus(String status) {
        if ("active".equals(status) || "in-active".equals(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Tham so khong hop le.");
        }
    }

    public void setFlag(String flag) {
        if ("optional".equals(flag) || "mandatory".equals(flag) || "N/A".equals(flag)) {
            this.flag = flag;
        } else {
            throw new IllegalArgumentException("Tham so khong hop le.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%.2f\t%s\t%s", getCode(), getName(), getDuration(), getStatus(), getFlag());
    }
}
class CourseManagement{
    private List<Course> courseList;
    public CourseManagement(){
        courseList = new ArrayList<>();
    }
    public void addCourse(Course c){
        courseList.add(c);
    }
    public void removeCourseByCode(String code){
        for (Course c : courseList){
            if (c.getCode().equals(code)){
                courseList.remove(c);
            }
        }
    }
    public void display(){
        for (Course c : courseList){
            System.out.println(c);
        }
    }
    public ArrayList<Course> find(String type, Object data){
        ArrayList<Course> kq = new ArrayList<>();
        for (Course c : courseList){
            switch (type){
                case "code":
                    if (c.getCode().equals(data)) kq.add(c);
                    break;
                case "name":
                    if (c.getName().equals(data)) kq.add(c);
                    break;
                case "status":
                    if (c.getStatus().equals(data)) kq.add(c);
                    break;
                case "flag":
                    if (c.getFlag().equals(data)) kq.add(c);
                    break;
                case "duration":
                    if (c.getDuration() == (double) data) kq.add(c);
                default:
                    throw new IllegalArgumentException("Tham so khong hop le.");
            }
        }
        return kq;
    }
}
public class Cau3Lan6 {
    public static void main(String[] args) {

    }
}
