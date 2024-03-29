`	 package absintertask;
abstract class shape
{
	abstract void area(double a,int b);
	abstract void perimeter(double c,int d);
}
abstract class circle extends shape
{
	public void perimeter(double c,int d)
	{
	    System.out.println("area of triangle = " + 2*c*d);
    }	
}
public class areacal extends circle
{
    public void area(double a,int b)
    {
    	System.out.println("area of circle = " + a*b*b);
    }   
public static void main(String[] args)
{
   	areacal cr=new areacal();
   	cr.area(3.5,7);
   	cr.perimeter(4.5,8);
}
}
