import java.util.*;

abstract class shape
{
	int a;
	abstract void printarea();	
	
}

class triangle extends shape
{	
	int b;
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.println("Enter the base and height ");
	a = s.nextInt();
	b = s.nextInt();
	area=0.5*a*b;
	System.out.println("Area of triangle is: "+area);
	}
}

class rectangle extends shape
{
	int b;
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.println("Enter the length and breadth  ");
	a = s.nextInt();
	b = s.nextInt();
	area=a*b;
	System.out.println("Area of rectangle is: "+area);
	}
}


class  circle extends shape
{
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.println("Enter the radius  ");
	a = s.nextInt();
	area=3.14*a*a;
	System.out.println("Area of circle is: "+area);
	}
}


class areamain
{
public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	rectangle r=new rectangle();
	triangle t = new triangle();
	circle c = new circle();
	String ch;
	do
	{
		System.out.println("Enter choice 1.Rectangle 2.Triangle 3.Circle");
		int choice= s.nextInt();
		switch(choice) 
        	{
            		case 1:r.printarea(); 
            		break;
            		case 2:t.printarea();
            		break;
            		case 3:c.printarea();
            		break;
            		default:System.out.println("Invalid input"); 
            		break;
        	}
		System.out.println("Do you wish to continue"); 
		System.out.println("Enter choice y/Y FOR YES AND N/n for no"); 
		ch = s.next();      
	}while(ch.equals("y") || ch.equals("Y"));	
}
}
