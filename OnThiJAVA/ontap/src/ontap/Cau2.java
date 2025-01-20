package ontap;
import java.util.Scanner;
public class Cau2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] a = new double[n];
		double tong = 0;
		for (int i=0; i<n; i++) {
			a[i] = input.nextDouble();
			tong += a[i];
		}
		double tb = tong / n;
		System.out.printf("%.3f", tb);
	}

}
