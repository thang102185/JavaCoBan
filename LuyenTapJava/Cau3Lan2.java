class IntegerSet{
    private boolean[] a;
    public IntegerSet(){
        a = new boolean[101];
    }
    public static IntegerSet union(IntegerSet a1, IntegerSet a2){
        IntegerSet ketqua = new IntegerSet();
        for(int i = 0; i<101; i++){
            if(a1.a[i] == true || a2.a[i] == true) {
                ketqua.a[i] = true;
            }
        }
        return ketqua;
    }
    public static IntegerSet intersection(IntegerSet a1, IntegerSet a2){
        IntegerSet ketqua = new IntegerSet();
        for(int i = 0; i<101; i++){
            if(a1.a[i] == true && a2.a[i] == true) {
                ketqua.a[i] = true;
            }
        }
        return ketqua;
    }
    public void insertElement(int k){
        if (k >= 0 && k < 101)
            a[k] = true;
    }
    public void deleteElement(int k){
        if (k >= 0 && k < 101)
            a[k] = false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < 101; i++){
            if (a[i]){
                s.append(" ").append(i);
            }
        }
        s.append("]");
        return s.toString();
    }
    public boolean isEqualTo(IntegerSet b){
        for(int i = 0; i < 101; i++){
            if(this.a[i] != b.a[i]){
                return false;
            }
        }
        return true;
    }
}
public class Cau3Lan2 {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        for (int i=0; i<10; i++)
            set1.insertElement(i);
        System.out.println("set1 = " + set1);

        IntegerSet set2 = new IntegerSet();
        for (int i=0; i<11; i++)
            set2.insertElement(i);
        System.out.println("set2 = " + set2);

        System.out.println("set1.isEqualTo(set2) => " + set1.isEqualTo(set2));
    }
}
