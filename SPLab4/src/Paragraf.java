
public class Paragraf {
	private String text;
	private AlignStrategy obj;
	
	public void setAlign(AlignStrategy obj)
	{
		this.obj = obj;
	}
	Paragraf(String n)
	{
		text = n;
	}
	public void print() {
		System.out.println("Paragraf: "+text);
	}
	public void printAlign() {
		obj.printAlign(text);
	}
}
