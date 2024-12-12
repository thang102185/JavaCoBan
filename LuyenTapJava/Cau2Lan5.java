import java.util.Scanner;

public class Cau2Lan5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        int min = a[0];
        int vt = 0;
        for(int i = 0; i<n; i++){
            if(min > a[i]){
                min = a[i];
                vt = i;
            }
        }
        System.out.print(vt + " " + min);
    }
}
