package app;

import java.util.ArrayList;
import java.util.List;

public class Jasper {
	
	private List<Vaate> vaatteet;
	private AbstractFactory vaateTehdas;
	
	public Jasper(AbstractFactory vaateTehdas) {
		this.vaateTehdas = vaateTehdas;
	}
	
	public void luoVaatteet() {
		this.vaatteet = new ArrayList<>();
		vaatteet.add(vaateTehdas.createVaate("lippis"));
		vaatteet.add(vaateTehdas.createVaate("t-paita"));
		vaatteet.add(vaateTehdas.createVaate("farmarit"));
		vaatteet.add(vaateTehdas.createVaate("kengät"));
	}
	
	public void setFactory(AbstractFactory factory) {
		this.vaateTehdas = factory;
	}
	
	public void kerroVaatteet() {
		vaatteet.forEach(System.out::println);
	}
}
