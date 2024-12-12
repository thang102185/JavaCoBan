public class Cau1Lan4 {
    public static void printRectangle(int side){
        for (int i =  0; i<side; i++){
            for (int j = 0; j<side; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // copy đoạn mã dưới đây vào main() của lớp Test
        printRectangle(2);
    }
}
