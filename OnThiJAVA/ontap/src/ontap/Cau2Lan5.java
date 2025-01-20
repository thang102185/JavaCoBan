package ontap;
import java.util.Scanner;
public class Cau2Lan5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] words = line.split(" ");
		for (int i = 0; i < words.length - 1; i+=2) {
			String gt = words[i];
			words[i] = words[i+1];
			words[i+1] = gt;
		}
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
		}
	}

}
