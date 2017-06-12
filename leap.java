import java.io.*;
import java.util.*;
class leap
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%4==0)
		{
			System.out.print(n+" is leap year");
		}
		else
		{
			System.out.print(n+"is not leap yer");
			
		}
	}
}
