import java.util.Scanner;

public class Cau2Lan9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++){
            for (int j = n-1; j > i; j--){
                if (a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
