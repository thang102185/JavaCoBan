import java.util.ArrayList;
import java.util.List;

class NguoiDung implements Comparable<NguoiDung>{
    private String hoVaTen;
    private String email;
    private String dienThoai;
    private String diaChi;
    private String matKhau;

    public NguoiDung() {
        hoVaTen = null;
        email = null;
        dienThoai = null;
        diaChi = null;
        matKhau = null;
    }

    public NguoiDung(String hoVaTen, String email, String dienThoai, String diaChi, String matKhau) {
        this.hoVaTen = hoVaTen;
        this.email = email;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return String.format("NguoiDung(%s, %s, %s, %s, %s)", hoVaTen, email, dienThoai, diaChi, matKhau);
    }

    @Override
    public int compareTo(NguoiDung n) {
        return this.email.compareTo(n.email);
    }
}
class QuanLyNguoiDung{
    private List<NguoiDung> list;

    public QuanLyNguoiDung() {
        list = new ArrayList<>();
    }
    public boolean themNguoiDung(NguoiDung n){
        for (NguoiDung p : list){
            if (n.compareTo(p) == 0) {
                return false;
            }
        }
        list.add(n);
        return true;
    }
    public NguoiDung timTheoEmail(String email){
        for (NguoiDung p : list){
            if (p.getEmail().equals(email)){
                return p;
            }
        }
        return null;
    }
    public NguoiDung timTheoDienThoai(String dienThoai){
        for (NguoiDung p : list){
            if (p.getDienThoai().equals(dienThoai)){
                return p;
            }
        }
        return null;
    }
    public boolean doiMatKhau(String email, String matKhauMoi){
        NguoiDung n = timTheoEmail(email);
        if (n != null){
            n.setMatKhau(matKhauMoi);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (NguoiDung p : list){
            s.append(p.toString()).append("\n");
        }
        return s.toString();
    }
}
public class Cau4Lan9 {
    public static void main(String[] args) {
        // copy đoạn mã sau vào main() của lớp Test
        NguoiDung nd1 = new NguoiDung("Pham Xuan Duong", "pxduong@vmu.edu.vn", "0901234567", "484 Lach Tray", "123@abc");

        NguoiDung nd2 = new NguoiDung();
        nd2.setDiaChi("So 1D16");
        nd2.setDienThoai("0909123456");
        nd2.setEmail("admin@vimaru.edu.vn");
        nd2.setHoVaTen("Luong Khanh Thien");
        nd2.setMatKhau("12345@Abc");

        NguoiDung nd3 = new NguoiDung("Nguyen Minh Duc", "nmduc@vmu.edu.vn", "0909987654", "484 Lach Tray", "456@xyz");

        QuanLyNguoiDung qlnd = new QuanLyNguoiDung();
        qlnd.themNguoiDung(nd1);
        qlnd.themNguoiDung(nd2);
        qlnd.themNguoiDung(nd3);

        System.out.print(qlnd.toString());
    }
}
