package app;

public class BossTuote implements Vaate{
	
	private String vaateKappale;
	
	public BossTuote(String vaateKappale) {
		this.vaateKappale = vaateKappale;
	}
	
	@Override
	public String toString() {
		return "Bossin: " + vaateKappale;
	}
}
