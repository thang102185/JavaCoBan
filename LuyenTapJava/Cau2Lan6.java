import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cau2Lan6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        wordList.sort(Collections.reverseOrder());
        for(String word : wordList){
            System.out.print(word + " ");
        }
    }
}
