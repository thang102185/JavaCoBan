//package ontap;
//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
//class SinhVien implements Comparable<SinhVien>{
//	protected String maSv;
//	protected String hoTen;
//	protected String chuyenNganh;
//	public SinhVien(String maSv, String hoTen, String chuyenNganh) {
//		this.maSv = maSv;
//		this.hoTen = hoTen;
//		this.chuyenNganh = chuyenNganh;
//	}
//	public String getMaSv() {
//		return maSv;
//	}
//	public void setMaSv(String maSv) {
//		this.maSv = maSv;
//	}
//	public String getHoTen() {
//		return hoTen;
//	}
//	public void setHoTen(String hoTen) {
//		this.hoTen = hoTen;
//	}
//	public String getChuyenNganh() {
//		return chuyenNganh;
//	}
//	public void setChuyenNganh(String chuyenNganh) {
//		this.chuyenNganh = chuyenNganh;
//	}
//	
//	public void inThongTin() {
//		System.out.printf("SinhVien(%s, %s, %s)", maSv, hoTen, chuyenNganh);
//	}
//	@Override
//	public String toString() {
//		return String.format("SinhVien(%s, %s, %s)", maSv, hoTen, chuyenNganh);
//	}
//	
//	public int compareTo(SinhVien s) {
//		return this.maSv.compareTo(s.maSv);
//	}
//}
//class SinhVienVMU extends SinhVien{
//	private int mosWord;
//	private int mosExcel;
//	public SinhVienVMU(String maSv, String hoTen, String chuyenNganh, int mosWord, int mosExcel) {
//		super(maSv, hoTen, chuyenNganh);
//		this.mosWord = mosWord;
//		this.mosExcel = mosExcel;
//	}
//	public int getMosWord() {
//		return mosWord;
//	}
//	public void setMosWord(int mosWord) {
//		this.mosWord = mosWord;
//	}
//	public int getMosExcel() {
//		return mosExcel;
//	}
//	public void setMosExcel(int mosExcel) {
//		this.mosExcel = mosExcel;
//	}
//	@Override
//	public String toString() {
//		return String.format("SinhVienVMU(%s, %s, %s, %d, %d)", getMaSv(), getHoTen(), getChuyenNganh(), getMosWord(), getMosExcel());
//	}
//}
//public class Cau5lan5 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		List<SinhVien> ds = new ArrayList<>();
//		sc.nextLine();
//		for (int i=0; i<n; i++) {
//			String[] data = sc.nextLine().split("\t");
//			String m = data[0];
//			String t = data[1];
//			String c = data[2];
//			if (data.length == 5) {
//				ds.add(new SinhVienVMU(m, t, c, Integer.parseInt(data[3]), Integer.parseInt(data[4])));
//			}
//			else if (data.length == 3) {
//				ds.add(new SinhVien(m, t, c));
//			}
//		}
//		
//		for (SinhVien s : ds) {
//			if (s instanceof SinhVienVMU) {
//				SinhVienVMU sv = (SinhVienVMU)s;
//				if (sv.getMosExcel() >= 700 && sv.getMosWord() >= 700) {
//					System.out.println(sv.toString());
//				}
//			}
//		}
//	}
//}
