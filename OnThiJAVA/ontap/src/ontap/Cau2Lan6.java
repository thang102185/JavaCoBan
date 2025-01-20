package ontap;
import java.util.Scanner;
public class Cau2Lan6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int vt = 0;
		int min = a[0];
		for (int i=0; i<n; i++) {
			if (a[i] < min) {
				min = a[i];
				vt = i;
			}
		}
		System.out.print(vt+" "+min);
	}

}
