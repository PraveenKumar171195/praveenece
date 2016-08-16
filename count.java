import.java.util.*;
class count
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int c=0;
while(a!=0)
{
c+=1;
a/=10;
}
System.out.println(c);
}
}
