import java.io.*;
import java.util.*;
class kerthi
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number a");
		a=sc.nextInt();
		System.out.print("enter  the number b");
		b=sc.nextInt();
		System.out.print("enter the numberc");
		c=sc.nextInt();
		if(a>c&&b>c)
		{
			System.out.print("a is greater");
		}
		else if(b>c)
		{
			System.out.print(" b is greater");
		}
		else
		{
			System.out.print("c is greater");
		}
	}
}
