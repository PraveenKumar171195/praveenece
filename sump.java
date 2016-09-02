import java.util.*;
class sump
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextint();
int y[]=new int[n],sum=0;
if(n>9)
{
for(int i=0;i<y.length;i++)
 {
 y[i]=n%10;
 n/=10;
 }
 for(int i=1;i<=y.length;i++)
 {
  for(int j=0;j<i;j++)
  {
  sum+=y[j];
  }
}
}
System.out.print(sum);
}
}
