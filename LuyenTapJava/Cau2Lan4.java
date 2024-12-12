import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau2Lan4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dong = in.nextLine();
        String[] tus = dong.split(" ");
        ArrayList<String> tuList = new ArrayList<>();
        for(String tu : tus){
            tuList.add(tu);
        }
        for (int i = 0; i < tuList.size() - 1; i += 2){
            String gt = tuList.get(i);
            tuList.set(i, tuList.get(i + 1));
            tuList.set(i + 1, gt);
        }
        for (String tu : tuList){
            System.out.print(tu + " ");
        }
    }
}
