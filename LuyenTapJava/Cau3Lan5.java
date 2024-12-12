class Fraction implements Comparable<Fraction>{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if(denominator == 0){
            throw new IllegalArgumentException("Mau so phai khac 0.");
        }
        if(denominator < 0){
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }
    public void reduce(){
        if(numerator != 0){
            int ucln = gcd(Math.abs(numerator), Math.abs(denominator));
            if(ucln > 1){
                numerator /= ucln;
                denominator /= ucln;
            }
        }
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static Fraction add(Fraction f1, Fraction f2){
        int tuKQ = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        int mauKQ = f1.denominator * f2.denominator;
        return new Fraction(tuKQ, mauKQ);
    }
    public static Fraction sub(Fraction f1, Fraction f2){
        int tuKQ = (f1.numerator * f2.denominator) - (f2.numerator * f1.denominator);
        int mauKQ = f1.denominator * f2.denominator;
        return new Fraction(tuKQ, mauKQ);
    }
    public static Fraction mul(Fraction f1, Fraction f2){
        int tuKQ = f1.numerator * f2.numerator;
        int mauKQ = f1.denominator * f2.denominator;
        return new Fraction(tuKQ, mauKQ);
    }
    public static Fraction div(Fraction f1, Fraction f2){
        if(f2.numerator == 0){
            throw new IllegalArgumentException("Loi chia cho 0.");
        }
        else {
            int tuKQ = f1.numerator * f2.denominator;
            int mauKQ = f1.denominator * f2.numerator;
            return new Fraction(tuKQ, mauKQ);
        }
    }

    @Override
    public int compareTo(Fraction that) {
        if((this.numerator * that.denominator) > (that.numerator * this.denominator)){
            return 1;
        } else if ((this.numerator * that.denominator) == (that.numerator * this.denominator)) {
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
    public float toFloat(){
        return (float) numerator / denominator;
    }
    public void invert(){
        if(numerator == 0){
            throw new IllegalArgumentException("Khong the nghich dao khi tu so bang 0.");
        }
        else{
            int gt = numerator;
            numerator = denominator;
            denominator = gt;
        }
    }
}
public class Cau3Lan5 {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction(1, 1000);
        System.out.println("ps1 = " + ps1);

        Fraction ps2 = new Fraction(1, 999);
        System.out.println("ps2 = " + ps2);

        if ( ps1.compareTo(ps2) == 1 )
System.out.println("ps1 > ps2");
else if ( ps1.compareTo(ps2) == -1 )
System.out.println("ps1 < ps2");
else
System.out.println("ps1 == ps2");
    }
}
