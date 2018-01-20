package polymorphism;

import javafx.scene.shape.Ellipse;

public class Main {

	public static void main(String[] args) {
		Reptile reptile; Elapidae elapidae; Poisonous poisonous; Snake snake;
		
		snake = new Elapidae();
		poisonous = new Elapidae();
		
		// Compile Error; Type mismatch
		// reptile = poisonous;
		
		// Compile Error; Type mismatch
		// reptile = (Snake) poisonous;
		
		// Causes runtime- exception
		try
		{
			reptile = (Reptile) poisonous;
		}
		catch (Exception e)
		{
			System.out.println("Runtime Error: Elapidae cannot be cast to Reptile");
		}
		// Compile Error; Type mismatch
		// elapidae = poisonous;
		
		poisonous = new ScorpioLizard();
		// Causes runtime- exception
		try
		{
			snake = (Snake) poisonous;
		}
		catch (Exception e)
		{
			System.out.println("Runtime Error: ScorpioLizard cannot be cast to Snake");
		}
		
		// Compile Error; Type mismatch
		// Reptile reptile2 = snake;
		
		// Compile Error; Type mismatch/ Cannot cast
		// elapidae = (Elapidae) new Anaconda();
		
		snake = new Cobra();
		poisonous = (Poisonous) snake;
		
		// Compile Error; Type mismatch/ Cannot cast
		// elapidae = (Poisonous) snake;
		
		// Compile Error; Type mismatch/ Cannot cast
		// elapidae = snake;
		
		// No instance of abstract class possible
		// snake = new Snake();
		
		// Takes the value from Cobra (see line 47)
		System.out.println(poisonous.isPoisonous() + ": Takes the value from Cobra (see line 47)");
		
		// Compile Error: Reptile doesn't hace isPoisonous()
		// System.out.println(reptile.isPoisonous());
	
		snake = new Anaconda();
		System.out.println(snake.isPoisonous() + ": Takes the value from Anaconda (see line 66)");
		
		// Causes runtime- exception
		try
		{
			((Poisonous) snake).isPoisonous();
		}
		catch (Exception e)
		{
			System.out.println("Runtime Error: Anaconda cannot be cast to Poisonous");
		}
		
		// Causes runtime- exception
		try
		{
			poisonous = (Poisonous) new Anaconda();
		}
		catch (Exception e)
		{
			System.out.println("Runtime Error: Anaconda cannot be cast to Poisonous");
		}
				
	}

}
