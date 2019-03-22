package app;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("koulussa");
		
		Jasper jasper = new Jasper(new VaateFactory().createFactory("Adidas"));
		jasper.luoVaatteet();
		jasper.kerroVaatteet();
		
		System.out.println("\ntyöelämässä");
		jasper.setFactory(new VaateFactory().createFactory("Boss"));
		jasper.luoVaatteet();
		jasper.kerroVaatteet();
		
	}

}
