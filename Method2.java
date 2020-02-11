
import java.util.Scanner;

public class Method 
{

	public static void main(String[] args) 
	{
		Method m = new Method();
		
	int z = m.sum();
	System.out.println("Sum is:" +z);
	
    int d = m.div(40,6);
    System.out.println("Div is:" +d);
    
    int p = m.mul();
	System.out.println("Mul is:" +p);

	}
            public int sum()
            {
            System.out.println("SUM Method");
            int x=10,y=20,z;
            z = x+y;
            return z;
            }

            public int div(int x , int y)
            {
            System.out.println("DIVISION Method");
            int d = x/y;
            return d;
            }
            
            public int mul()
            {
            System.out.println("DIVISION Method");
            
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int num1 = in.nextInt();
            
            System.out.println("Enter second number: ");
            int num2 = in.nextInt();
            int p = num1*num2;
            return p;
             }
}
