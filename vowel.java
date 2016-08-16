import java.util.*;
class vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char t=(s.next()).charAt(0);
if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U')
System.out.print("vowel");
else
System.out.println("not vowel");
}
}
