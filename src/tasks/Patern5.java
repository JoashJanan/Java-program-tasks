package tasks;

public class Patern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5-i;j++)	
{
	System.out.print(i);
}
System.out.println();
}
String name="joash",s="";
int n=name.length();
char rev;

for(int m=0;m<n;m++){
	rev=name.charAt(m);
	s=rev+s;
}
System.out.println(s);
char g;
String f="";
System.out.println();
for(int y=name.length()-1;y>=0;y--)
{
	g=name.charAt(y);
	f=f+g;
	System.out.println(f);
	}

	}

}
