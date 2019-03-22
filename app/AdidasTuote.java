package app;

public class AdidasTuote implements Vaate{
	
	private String vaateKappale;
	
	public AdidasTuote(String vaateKappale) {
		this.vaateKappale = vaateKappale;
	}
	
	@Override
	public String toString() {
		return "Adidaksen: " + vaateKappale;
	}
}
