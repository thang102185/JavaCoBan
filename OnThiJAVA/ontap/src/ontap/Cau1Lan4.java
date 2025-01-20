package ontap;
import java.util.Scanner;
public class Cau1Lan4 {
	public static boolean isPrime(int n) {
		if (n<=1) return false;
		else if (n==2) return true;
		else {
			for (int i=2; i<=Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<=b) {
			for  (int i = a+1; i <b; i++) {
				if(isPrime(i))
					System.out.print(i+" ");
			}
		}
	}
}
