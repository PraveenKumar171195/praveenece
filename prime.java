import java.util.*;
class prime
{
pulic static void main(String args[])
{
		Scanner s=new Scanner(System.in);
int n=s.nextInt(),i,k=0;
int p[]=new int[n];
TreeSet ts=new TreeSet();
for(i=1;i<20;i++)
{
if(i%2==0||i%3==0||i%5==0||i%7==0||i%9==0)
continue;
else
{
p[k]=i;
k++;
}
}
for(int j=0;j<p.length;j++)
{
 for(int t=0;t<p.length;t++)
 {
 if(p[j]+p[t]==n)
 {
  ts.add(p[j]);
  ts.add(p[t]);
 }
 }
}
System.out.print(ts);
}
}
