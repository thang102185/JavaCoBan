import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Book{
    private String name;
    private int numOfPages;
    private double price;

    public Book() {
        name = null;
        numOfPages = 0;
        price = 0.0;
    }

    public Book(String name, int numOfPages, double price) {
        this.name = name;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s\t%d\t%.2f\n", getName(), getNumOfPages(), getPrice());
    }
}
class BookReaderWriter{
    private Scanner scanner;

    public BookReaderWriter(Scanner scanner) {
        this.scanner = scanner;
    }
    public Book readRecord(){
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        String name = parts[0];
        int numOfPages = Integer.parseInt(parts[1]);
        double price = Double.parseDouble(parts[2]);
        return new Book(name, numOfPages, price);
    }
    public void writeRecord(Book b){
        System.out.printf(b.toString());
    }
}
public class Cau4Lan4 {
    public static void main(String[] args) {
        // copy đoạn mã này vào main() của lớp Test
        Scanner scanner = new Scanner(System.in);
        BookReaderWriter readWrite = new BookReaderWriter(scanner);
        Book book1 = readWrite.readRecord();
        Book book2 = readWrite.readRecord();
        readWrite.writeRecord(book1);
        readWrite.writeRecord(book2);
    }
}
