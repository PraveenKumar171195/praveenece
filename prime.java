import java.util.*;
class prime
{
pulic static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt(),i,k=0;
int p[]=new int[];
for(i=1;i<=n;i++)
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
 if(if(p[j]+p[t]==n)
  System.out.print(p[j]+" "+p[t]);
  }
}
 }
}
 
 
}
}
