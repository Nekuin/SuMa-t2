package app;

public class AdidasFactory extends AbstractFactory{

	@Override
	public Vaate createVaate(String vaateKappale) {
		return new AdidasTuote(vaateKappale);
	}
}
