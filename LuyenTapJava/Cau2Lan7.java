import java.util.Scanner;

public class Cau2Lan7 {
    public static boolean tang(double[] a, int n){
        for (int i = 1; i < n; i++){
            if (a[i] <= a[i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
        }
        if (n == 1) System.out.print("TANG");
        else {
            if (tang(arr, n)) {
                System.out.print("TANG");
            } else {
                System.out.println("KHONG_TANG");
            }
        }
    }
}
