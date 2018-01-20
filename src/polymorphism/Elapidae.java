package polymorphism;

public class Elapidae extends Snake implements Poisonous {

	@Override
	public boolean isPoisonous() {
		return true;
	}

}
