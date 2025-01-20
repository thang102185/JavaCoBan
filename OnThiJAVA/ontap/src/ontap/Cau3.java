package ontap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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

class Song extends Multimedia{
	private String singer;

	public Song(String name, double duration, String singer) {
		super(name, duration);
		this.singer = singer;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString(){
		return String.format("Song(%s, %.1f, %s)", getName(), getDuration(), singer);
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
public class Cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
