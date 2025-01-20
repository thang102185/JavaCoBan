package ontap;

public class Cau1 {
	public static int ucln(int a, int b) {
		if (a<=0 || b <=0) return -1;
		while(a*b!=0) {
			if (a>=b) a = a % b;
			else b = b % a;
		}
		return a + b;
	}
	public static int bcnn(int a, int b) {
		if (a<=0 || b <=0) return -1;
		return (a*b) / ucln(a, b);
	}
	public static void main(String[] args) {
		System.out.println(ucln(6, 9));
		System.out.println(bcnn(6, 9));

	}

}
