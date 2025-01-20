package ontap;

public class Cau1Lan2 {
	public static void printRectangle(int size) {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printRectangle(3);

	}

}
