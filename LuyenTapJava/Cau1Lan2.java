public class Cau1Lan2 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        else if (n == 2) return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        // copy đoạn mã dưới đây vào main() của lớp Test
        for (int i=1; i<101; i++) {
            System.out.printf("%d\t%b\n", i, isPrime(i));
        }
    }
}
