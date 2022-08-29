//import java.util.*;
public class pallin_snigdha2
{
	public int pallin( int n)
	{
		int temp,rev=0,r;
        temp=n;
        while(temp>0)
        {
        	r=temp%10;
        	rev*=10;
        	//rev=(rev*10)+r;
        	rev +=r;
        	temp=temp/10;
        }
        if(n==rev)
        {
        	return 1;
        }
        else
        {
        	return 0;
        }
        
	}

}