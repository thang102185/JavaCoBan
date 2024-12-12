public class Cau1Lan9 {
    public static int centuryFromYear(int n){
        if (n <= 100){
            return 1;
        } else if (n % 100 == 0) {
            return n / 100;
        } else {
            return n / 100 + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(centuryFromYear(1999));
    }
}
