package ontap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
abstract class SanPham implements Comparable<SanPham>{
	protected String maSanPham;
	protected String tenSanPham;
	protected String moTa;
	public SanPham(String maSanPham, String tenSanPham, String moTa) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.moTa = moTa;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	@Override
	public abstract String toString();
	public int compareTo(SanPham that) {
		return this.tenSanPham.compareTo(that.tenSanPham);
	}
}
class SanPhamDongGoi extends SanPham {
	private String kichThuoc;
	private String khoiLuong;
	private String yeuCauVanChuyen;
	private double giaMoiKien;
	public SanPhamDongGoi(String maSanPham, String tenSanPham, String moTa, String kichThuoc, String khoiLuong,
			String yeuCauVanChuyen, double giaMoiKien) {
		super(maSanPham, tenSanPham, moTa);
		this.kichThuoc = kichThuoc;
		this.khoiLuong = khoiLuong;
		this.yeuCauVanChuyen = yeuCauVanChuyen;
		this.giaMoiKien = giaMoiKien;
	}
	public String getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(String kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	public String getKhoiLuong() {
		return khoiLuong;
	}
	public void setKhoiLuong(String khoiLuong) {
		this.khoiLuong = khoiLuong;
	}
	public String getYeuCauVanChuyen() {
		return yeuCauVanChuyen;
	}
	public void setYeuCauVanChuyen(String yeuCauVanChuyen) {
		this.yeuCauVanChuyen = yeuCauVanChuyen;
	}
	public double getGiaMoiKien() {
		return giaMoiKien;
	}
	public void setGiaMoiKien(double giaMoiKien) {
		this.giaMoiKien = giaMoiKien;
	}
	@Override
	public String toString() {
		return String.format("SanPhamDongGoi(%s, %s, %s, %s, %s, %s, %.2f)", getMaSanPham(), getTenSanPham(), getMoTa(), getKichThuoc(), getKhoiLuong(), getYeuCauVanChuyen(), getGiaMoiKien());
	}
}
class SanPhamLong extends SanPham{
	private String khoiLuongRieng;
	private String dacTinh;
	private double giaMoiKg;
	
	public SanPhamLong(String maSanPham, String tenSanPham, String moTa, String khoiLuongRieng, String dacTinh,
			double giaMoiKg) {
		super(maSanPham, tenSanPham, moTa);
		this.khoiLuongRieng = khoiLuongRieng;
		this.dacTinh = dacTinh;
		this.giaMoiKg = giaMoiKg;
	}
	public String getKhoiLuongRieng() {
		return khoiLuongRieng;
	}
	public void setKhoiLuongRieng(String khoiLuongRieng) {
		this.khoiLuongRieng = khoiLuongRieng;
	}
	public String getDacTinh() {
		return dacTinh;
	}
	public void setDacTinh(String dacTinh) {
		this.dacTinh = dacTinh;
	}
	public double getGiaMoiKg() {
		return giaMoiKg;
	}
	public void setGiaMoiKg(double giaMoiKg) {
		this.giaMoiKg = giaMoiKg;
	}
	@Override
	public String toString() {
		return String.format("SanPhamLong(%s, %s, %s, %s, %s, %.2f)", getMaSanPham(), getTenSanPham(), getMoTa(), getKhoiLuongRieng(), getDacTinh(), getGiaMoiKg());
	}
}
public class Cau5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<SanPham> DS = new ArrayList<>();
		for (int i=0; i<n; i++) {
			String line = sc.nextLine();
			String[] data = line.split("\t");
			String msp = data[0];
			String tsp = data[1];
			String mt = data[2];
			if (data.length == 7) {
				String kt = data[3];
				String kl = data[4];
				String yc = data[5];
				double gmk = Double.parseDouble(data[6]);
				SanPhamDongGoi sp = new SanPhamDongGoi(msp, tsp, mt, kt, kl, yc, gmk);
				DS.add(sp);
			}
			else if(data.length == 6) {
				String klr = data[3];
				String dt = data[4];
				double gmkg = Double.parseDouble(data[5]);
				SanPhamLong sp = new SanPhamLong(msp, tsp, mt, klr, dt, gmkg);
				DS.add(sp);
			}
		}
		Collections.sort(DS, Collections.reverseOrder());
		for (SanPham sp : DS) {
			System.out.println(sp.toString());
		}
	}
}
