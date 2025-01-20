package ontap;

public class Cau1Lan5 {
	public static void printHexa(int n) {
		if(n==0) {
			return;
		}
		else if (n > 0) {
			printHexa(n/16);
			int reminder = n % 16;
			if (reminder >= 10 && reminder <= 15) {
				System.out.print((char) ('A' + (reminder - 10)));
			}
			else {
				System.out.print(reminder);
			}
		}
	}
	public static void main(String[] args) {
		for (int i=1; i<=16; i++) {
			printHexa(i);
			System.out.println();
		}
	}

}
