public class Cau1Lan3 {
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        // copy đoạn mã dưới đây vào main() của lớp Test
        for (int i=1; i<101; i++) {
            System.out.printf("%d\t%b\n", i, isPerfect(i));
        }
    }
}
