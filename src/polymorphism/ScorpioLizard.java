package polymorphism;

public class ScorpioLizard extends Reptile implements Poisonous {

	@Override
	public boolean isPoisonous() {
		return false;
	}

}
