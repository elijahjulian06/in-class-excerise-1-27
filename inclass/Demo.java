import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Lion or Tiger for a roar");
		String animal = sc.nextLine();
		Animal animal2 = null;
		if(animal.equals("lion") || animal.equals("Lion"))
			{
				animal2 = new Lion();	
			}
		if(animal.equals("tiger") || animal.equals("Tiger"))
			{
				animal2 = new Tiger();
			}
		animal2.roar();
	}
}
