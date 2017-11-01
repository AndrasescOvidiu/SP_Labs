import java.util.ArrayList;

public class Sectiune {
	private String text;
	ArrayList<Paragraf> paragrafe = new ArrayList<Paragraf> ();
	Sectiune(String n)
	{
		text = n;
	}
	public void print() {
		System.out.println("Sectiune: "+text);
	}
	public void add(Paragraf p) {
		paragrafe.add(p);
	}
}
