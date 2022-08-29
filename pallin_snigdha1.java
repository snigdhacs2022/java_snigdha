import java.util.*;
public class pallin_snigdha1
{
	public static void  main(String[] args) 
	{
		
		pallin_snigdha2 ob=new pallin_snigdha2();
		//public int pallin();
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enter a number:-");
		int n=Sc.nextInt();
		int r=ob.pallin(n);
		if(r==1)
		{
			System.out.println("The given number is Pallindrome");
		}
		else 
		{
            System.out.println("The given number is  not Pallindrome");
		}

	}
} 