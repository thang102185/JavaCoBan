import java.util.Scanner;
import java.util.Arrays;
public class Cau2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int v : a){
            System.out.print(v + " ");
        }
    }
}
