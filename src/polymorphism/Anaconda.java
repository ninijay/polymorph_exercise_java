package polymorphism;

public class Anaconda extends Snake {

	@Override
	public boolean isPoisonous() {
		return false;
	}
	
	/***
	 * Just for fun and giggles
	 * @return
	 */
	public boolean hasBuns()
	{
		return true;
	}

}
