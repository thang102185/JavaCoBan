public class Cau1 {
    public static void printBinary(int n){
        if (n == 0){
            return;
        }
        if(n > 0){
            printBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            printBinary(i);
            System.out.println();
        }
    }
}
