
public class Main {

	public static void main(String[] args) {
		Sectiune capu1 = new Sectiune("Cap1");
		
		
		Paragraf p1 = new Paragraf("P1");
		Paragraf p2 = new Paragraf("P2");
		Paragraf p3 = new Paragraf("Ptrei");
		p1.setAlign(new CenterAlign());
		p2.setAlign(new LeftAlign());
		p3.setAlign(new RightAlign());
		
		capu1.add(p1);capu1.add(p2);capu1.add(p3);
		for (int i=0;i<capu1.paragrafe.size();i++)
			capu1.paragrafe.get(i).printAlign();
		
	}

}

