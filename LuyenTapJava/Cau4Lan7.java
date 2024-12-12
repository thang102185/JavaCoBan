class PhanSo{
    private int tu;
    private int mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        if (mau == 0){
            throw new IllegalArgumentException("Mau so phai khac 0.");
        }
        if(mau < 0){
            tu = -tu;
            mau = -mau;
        }
        this.tu = tu;
        this.mau = mau;
        if (tu != 0 && mau != 0)
        {
            rutGon();
        }
    }
    public void inPhanSo(){
        System.out.printf("%d/%d", tu, mau);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", tu, mau);
    }
    public void daoDau(){
        this.tu *= -1;
    }
    public void nghichDao(){
        if (tu == 0){
            throw new IllegalArgumentException("Khong the nghich dao khi tu so bang 0.");
        }
        else {
            int temp = tu;
            tu = mau;
            mau = temp;
            if(mau < 0){
                tu = -tu;
                mau = -mau;
            }
            rutGon();
        }
    }
    public double toDouble(){
        return (double) tu / mau;
    }
    public void rutGon(){
        int ucln = UCLN(Math.abs(this.tu), Math.abs(this.mau));
        if(ucln > 1){
            this.tu = this.tu / ucln;
            this.mau = this.mau / ucln;
        }
    }
    public int UCLN(int a, int b){
        while (a * b != 0){
            if (a >= b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        return a + b;
    }
    public PhanSo cong(PhanSo that){
        int t = this.tu * that.mau + that.tu * this.mau;
        int m = this.mau * that.mau;
        return new PhanSo(t, m);
    }
}
public class Cau4Lan7 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(0, -4);
        System.out.println("ps1 = " + ps1);
        System.out.print("ps1 = ");
        ps1.inPhanSo();

        PhanSo ps2 = new PhanSo(-2, 100);
        System.out.println("\nps2 = " + ps2);
        System.out.print("ps2 = ");
        ps2.inPhanSo();

        PhanSo ps3 = ps1.cong(ps2);
        System.out.println("\nps3 = ps1.cong(ps2);");
        System.out.println("ps3 = " + ps3);
        System.out.printf("ps3 = %.2f", ps3.toDouble());
    }
}
