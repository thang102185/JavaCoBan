import java.util.Scanner;

public class Cau2lan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n ; i++){
            a[i] = in.nextDouble();
        }
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        System.out.printf("%.3f", sum / n);
    }
}