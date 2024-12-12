import java.util.Arrays;

class HugeInteger{
    private int[] digits = new int[40];

    public HugeInteger() {
        Arrays.fill(digits, 0);
    }

    public HugeInteger(String number) {
        parse(number);
    }
    public void parse(String number){
        Arrays.fill(digits, 0);
        int len = number.length();
        for (int i = 0; i<len; i++){
            digits[39 - i] = number.charAt(len - 1 - i) - '0';
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        boolean isHead0 = true;
        for (int cs : digits){
            if(cs != 0 || !isHead0){
                s.append(cs);
                isHead0 = false;
            }
        }
        if(!isHead0) return s.toString();
        else return "0";
    }
    public HugeInteger add(HugeInteger h){
        HugeInteger kq = new HugeInteger();
        int nho = 0;
        for (int i = 39; i >= 0; i--){
            int sum = this.digits[i] + h.digits[i] + nho;
            kq.digits[i] = sum % 10;
            nho = sum / 10;
        }
        return kq;
    }
    public HugeInteger subtract(HugeInteger h){
        HugeInteger kq = new HugeInteger();
        int muon = 0;
        for(int i = 39; i>=0; i--){
            int diff = this.digits[i] - h.digits[i] - muon;
            if (diff < 0){
                diff += 10;
                muon = 1;
            }
            else{
                muon = 0;
            }
            kq.digits[i] = diff;
        }
        return kq;
    }
    public boolean isEqualTo(HugeInteger h){
        return Arrays.equals(this.digits, h.digits);
    }
    public boolean isNotEqualTo(HugeInteger h){
        return !this.isEqualTo(h);
    }
    public boolean isGreaterThan(HugeInteger h){
        for(int i = 0; i < 40; i++){
            if(this.digits[i] > h.digits[i]) return true;
            if(this.digits[i] < h.digits[i]) return false;
        }
        return false;
    }
    public boolean isLessThan(HugeInteger h){
        for(int i = 0; i < 40; i++){
            if(this.digits[i] < h.digits[i]) return true;
            if(this.digits[i] > h.digits[i]) return false;
        }
        return false;
    }
    public boolean isGreaterThanOrEqualTo(HugeInteger h){
        return this.isGreaterThan(h) || this.isEqualTo(h);
    }
    public boolean isLessThanOrEqualTo(HugeInteger h){
        return this.isLessThan(h) || this.isEqualTo(h);
    }
    public boolean isZero(){
        for (int cs : digits){
            if(cs != 0) return false;
        }
        return true;
    }
}
public class Cau4Lan5 {
    public static void main(String[] args) {
        // copy đoạn mã sau rồi dán vào main() của lớp Test
        try {
            HugeInteger hi1 = new HugeInteger("0");
            HugeInteger hi2 = new HugeInteger("00");
            HugeInteger hi3 = new HugeInteger("0000000000000000000000000000000000000000");
            HugeInteger hi4 = new HugeInteger("0000000000000000000000000000000000000001");
            System.out.println("hi1 = " + hi1);
            System.out.println("hi2 = " + hi2);
            System.out.println("hi3 = " + hi3);
            System.out.println("hi4 = " + hi4);
            System.out.println("hi1.isZero() => " + hi1.isZero());
            System.out.println("hi2.isZero() => " + hi2.isZero());
            System.out.println("hi3.isZero() => " + hi3.isZero());
            System.out.println("hi4.isZero() => " + hi4.isZero());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
