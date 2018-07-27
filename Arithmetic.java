import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Arithmetic {
	
	int num1, num2, num3;

	public Arithmetic(int num1, int num2) {
	
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public abstract int calculate();

}

class Addition extends Arithmetic
{

	public Addition(int num1, int num2) {
		super(num1, num2);
	}
	
	public int calculate()
	{
		return this.num1+this.num2;
	}
	
}


class Subtraction extends Arithmetic
{

	public Subtraction(int num1, int num2) {
		super(num1, num2);
	}
	
	public int calculate()
	{
		return this.num1-this.num2;
	}
	
}

class Multiplication extends Arithmetic
{

	public Multiplication(int num1, int num2) {
		super(num1, num2);
	}
	
	public int calculate()
	{
		return this.num1*this.num2;
	}
	
}


class Division extends Arithmetic
{

	public Division(int num1, int num2) {
		super(num1, num2);
	}
	
	public int calculate()
	{
		return this.num1/this.num2;
	}
	
}



class TestArithmetic
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter 2 numbers: ");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your choice:");
		int choice = Integer.parseInt(br.readLine());

		Arithmetic a[] = {new Addition(x,y), new Subtraction(x,y), new Multiplication(x,y), new Division(x,y)};
		
		int ans = a[choice-1].calculate();
		System.out.println(ans);
		
	}
}


















