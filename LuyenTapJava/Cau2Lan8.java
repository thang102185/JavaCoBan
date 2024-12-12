import java.util.Scanner;

public class Cau2Lan8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double s = 0;
        for (int i = 0; i <= n; i++){
            s += (double) 1/(2*i+1);
        }
        System.out.printf("%.5f", s);
    }
}
