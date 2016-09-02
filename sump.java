import java.util.*;
class sump
{
public static void main(String args[])
{
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
int y[]=new int[n],sum=0;
String k=n+"";
if(n>9)
{
for(int i=0;i<k.length();i++)
 {
 y[i]=Integer.parseInt(k.charAt(i)+"");
 }
 for(int i=1;i<=k.length();i++)
 {
  for(int j=0;j<i;j++)
  sum+=y[j];
}
}
System.out.println(sum);
}
}
