public class Cau1Lan7 {
    public static int intReverse(int n){
        int n1 = n;
        if (n < 0) {
            n1 = -n;
        }
        int n2;
        int kq = 0;
        while (n1 > 0) {
            n2 = n1 % 10;
            kq = kq * 10 + n2;
            n1 = n1 / 10;
        }
        if (n < 0) kq *= -1;
        return kq;
    }

    public static void main(String[] args) {
        // copy đoạn mã dưới đây vào main() của lớp Test
        int i = 98765;
        System.out.printf("%d\t%d\n", i, intReverse(i));

        i = -98765;
        System.out.printf("%d\t%d\n", i, intReverse(i));

        i = 98765000;
        System.out.printf("%d\t%d\n", i, intReverse(i));
    }
}
