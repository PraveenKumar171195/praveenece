import java.util.*;
class spow
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=0,pow=0;
		String p=n+"";
		while(n!=0)
		{
		c++;
		n/=10;
		}
		for(int i=0;i<c;i++)
		{
		 pow+=Math.pow(Integer.parseInt(p.charAt(i)+""),c);
		}
		System.out.println(pow);
}
}
