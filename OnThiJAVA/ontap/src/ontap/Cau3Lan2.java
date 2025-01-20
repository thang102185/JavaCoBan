package ontap;
class PhanSo{
	private int tu;
	private int mau;
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	public PhanSo(int tu, int mau) {
		if (mau == 0) {
			throw new IllegalArgumentException("Mau so phai khac 0.");
		}
		else {
			if (mau < 0) {
				mau = -mau;
				tu = -tu;
			}
			this.tu = tu;
			this.mau = mau;
			rutGon();
			daoDau();
		}
	}
	public void inPhanSo() {
		System.out.print(tu+"/"+mau);
	}
	public String toString() {
		return String.format("%d/%d", tu, mau);
	}
	public void daoDau() {
		tu = -tu;
	}
	public void nghichDao() {
		rutGon();
		if(tu==0) {
			throw new IllegalArgumentException("Khong the nghich dao khi tu so bang 0.");
		}
		else {
			int gt = tu;
			tu = mau;
			mau = gt;
		}
	}
	public double toDouble() {
		return (double) tu / mau;
	}
	public void rutGon() {
		if(tu != 0) {
			int uc = ucln(Math.abs(tu), Math.abs(mau));
			tu = tu / uc;
			mau = mau / uc;
		}
	}
	public int ucln(int a, int b) {
		while(a*b!=0) {
			if (a>=b) a = a%b;
			else b = b%a;
		}
		return a+b;
	}
	public PhanSo cong(PhanSo that) {
		int t = tu*that.mau + that.tu * mau;
		int m = mau * that.mau;
		return new PhanSo(t, m);
	}
}
public class Cau3Lan2 {

	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo(-16, -4);
		System.out.println("ps1 = " + ps1);
		System.out.println("ps1.daoDau();");
		ps1.daoDau();
		System.out.println("ps1 = " + ps1);

		PhanSo ps2 = new PhanSo(-5, 1000);
		System.out.println("ps2 = " + ps2);
		System.out.println("ps2.nghichDao();");
		ps2.nghichDao();
		System.out.println("ps2 = " + ps2);
	}

}
