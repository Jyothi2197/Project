



public class Vehicle
{
	int model;
	int color;
	Vehicle(int m,int c)
	{
		model=m;
		color=c;
		
	}	
		void display(String m, String c) 
		{
		System.out.println("model:"+m);
		System.out.println("color:"+c);
		
		}
}
class car extends Vehicle
{
	
	car(int m, int c)
	{
		super(m, c);
		
	}

void display(String m, String c)
	{
		System.out.println("Swift:"+m);
		System.out.println("Black:"+c);
	}
class bus extends Vehicle
{

	bus(int m, int c)
	{
		super(m, c);
	
	}
	void display(String m, String c)
	{
		System.out.println("Benz:"+m);
		System.out.println("Black:"+c);
	}

}



	public static void main(String[] args) {
		car.display();
		bus.display();

	}


}



