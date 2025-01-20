package ontap;

public class Cau1Lan6 {
	public static int centuryFromYear(int n) {
		if (n >= 1 && n <= 99) return 1;
		else if (n % 100 == 0) return n / 100;
		else return n / 100 + 1;
	}
	public static void main(String[] args) {
		// copy đoạn mã dưới đây vào main() của lớp Test
		System.out.println(centuryFromYear(1));
		System.out.println(centuryFromYear(99));
		System.out.println(centuryFromYear(100));
		System.out.println(centuryFromYear(2001));
		
	}

}
