package ontap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Cau2Lan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] words = line.split(" ");
		Arrays.sort(words, Collections.reverseOrder());;
		for (String s : words) {
			System.out.print(s + " ");
		}
	}

}
