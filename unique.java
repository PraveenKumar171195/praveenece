import java.util.*;
class unique
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextint();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(a[i]!=a[j])
System.out.print(a[i])
}
}
}
}
