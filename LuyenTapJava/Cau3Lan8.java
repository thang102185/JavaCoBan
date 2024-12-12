import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Multimedia{
    protected String name;
    protected double duration;

    public Multimedia(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    abstract public String toString();
}
class Song extends Multimedia {
    private String singer;

    public Song(String name, double duration, String singer) {
        super(name, duration);
        this.singer = singer;
    }

    @Override
    public String toString() {
        return String.format("Song(%s, %.1f, %s)", getName(), getDuration(), singer);
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
class Video extends Multimedia{
    public Video(String name, double duration) {
        super(name, duration);
    }

    @Override
    public String toString() {
        return String.format("Video(%s, %.1f)", getName(), getDuration());
    }
}
public class Cau3Lan8 {
    public static void main(String[] args) {
        // copy đoạn mã dưới đây vào main() của lớp Test
        List< Multimedia > list = new ArrayList< Multimedia >();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Multimedia m = null;
        for (int i=0; i < n; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split("\t");
            if (tokens[0].equalsIgnoreCase("Song")) {
                m = new Song(tokens[1], Double.parseDouble(tokens[2]), tokens[3]);
            } else if (tokens[0].equalsIgnoreCase("Video")) {
                m = new Video(tokens[1], Double.parseDouble(tokens[2]));
            }
            list.add(m);
        }


        for (Multimedia m2: list) {
            System.out.println(m2);
        }
    }
}
