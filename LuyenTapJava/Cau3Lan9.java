import java.util.ArrayList;

class Candidate{
    private int id;
    private String name;
    private String gender;
    private String birthday;
    private String email;
    private double gpa;

    public Candidate(int id, String name, String gender, String birthday, String email, double gpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %s, %.2f", id, name, gender, birthday, email, gpa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
class CandidateManagement{
    private ArrayList<Candidate> candidateList;

    public CandidateManagement() {
        candidateList = new ArrayList<>();
    }
    public void addCandidate(Candidate c){
        candidateList.add(c);
    }
    public void removeCandidateById(int id){
        for (Candidate c : candidateList){
            if (c.getId() == id){
                candidateList.remove(c);
                break;
            }
        }
    }
    public void display(){
        for (Candidate c : candidateList){
            System.out.println(c.toString());
        }
    }
}
public class Cau3Lan9 {
    public static void main(String[] args) {
        // copy đoạn mã này vào main() của lớp Test
        Candidate c1 = new Candidate(1, "Mark", "Male", "20-May-1999", "mark@facebook.com", 2.9);
        Candidate c2 = new Candidate(2, "Mary", "Female", "20-Dec-2000", "mary@intel.com", 3.0);
        Candidate c3 = new Candidate(3, "Bill", "Male", "31-May-1980", "bill@microsoft.com", 3.9);
        Candidate c4 = new Candidate(4, "Rose", "Female", "01-Jan-2009", "rose@apple.com", 4.0);

        CandidateManagement cm = new CandidateManagement();
        cm.addCandidate(c1);
        cm.addCandidate(c2);
        cm.addCandidate(c3);
        cm.addCandidate(c4);
        cm.addCandidate(new Candidate(5, "Thuong", "Male", "20-May-1980", "thuongvv@vimaru.edu.vn", 3.9));
        cm.display();
    }
}
