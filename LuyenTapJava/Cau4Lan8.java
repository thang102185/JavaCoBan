class Rational{
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator != 0){
            if (denominator < 0){
                numerator *= -1;
                denominator *= -1;
            }
            this.numerator = numerator;
            this.denominator = denominator;
            if(this.numerator != 0){
                rutGon();
            }
        }
    }

    public Rational() {
        numerator = 1;
        denominator = 1;
    }

    public void rutGon(){
        int ucln = UCLN(Math.abs(this.numerator), Math.abs(this.denominator));
        if(ucln > 1){
            this.numerator = this.numerator / ucln;
            this.denominator = this.denominator / ucln;
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

    public static Rational addRational(Rational r1, Rational r2){
        int t = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int m = r1.denominator * r2.denominator;
        return new Rational(t, m);
    }
    public static Rational substractRational(Rational r1, Rational r2){
        int t = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int m = r1.denominator * r2.denominator;
        return new Rational(t, m);
    }
    public static Rational multiplyRational(Rational r1, Rational r2){
        int t = r1.numerator * r2.numerator;
        int m = r1.denominator * r2.denominator;
        return new Rational(t, m);
    }
    public static Rational devideRational(Rational r1, Rational r2){
        int t = r1.numerator * r2.denominator;
        int m = r1.denominator * r2.numerator;
        return new Rational(t, m);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
    public String toFloatString(int precision){
        float kq = (float) numerator/denominator;
        return String.format("%."+ precision + "f", kq);
    }
}
public class Cau4Lan8 {
    public static void main(String[] args) {
        Rational ps1 = new Rational(0, -4);
        System.out.println("ps1 = " + ps1);

        Rational ps2 = new Rational(-2, 100);
        System.out.println("ps2 = " + ps2);

        Rational ps3 = Rational.addRational(ps1, ps2);
        System.out.println("ps3 = ps1 + ps2");
        System.out.println("ps3 = " + ps3);
        System.out.println("ps3 = " + ps3.toFloatString(3));
    }
}
