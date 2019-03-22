package app;

public class BossFactory extends AbstractFactory{

	@Override
	public Vaate createVaate(String vaateKappale) {
		return new BossTuote(vaateKappale);
	}

}
