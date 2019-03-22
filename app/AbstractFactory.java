package app;

public abstract class AbstractFactory {
	public abstract Vaate createVaate(String vaateKappale);
	public AbstractFactory createFactory(String nimi) {
		try {
			Class c = Class.forName("app." + nimi + "Factory");
			AbstractFactory f = (AbstractFactory) c.newInstance();
			return f;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
