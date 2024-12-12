import java.util.Scanner;

public class Cau2Lan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tk_diem = new int[11];
        for (int i = 0; i < n; i++){
            int diem = in.nextInt();
            tk_diem[diem] ++;
        }
        System.out.printf("Diem\tSo SV\tTi le\n");
        for(int i = 0; i<11; i++){
            System.out.printf("%d\t%d\t%.2f%%\n", i, tk_diem[i], ((double)tk_diem[i] / n) * 100);
        }
    }
}
