package task;

public class PassByRef {
int a=10;	
	void call(int a)
	{
		a=a+10;
	}
void callref(PassByRef pf)
{
	pf.a=pf.a+10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PassByRef ps=new PassByRef();
System.out.println("before call:"+ps.a);
ps.call(10);
System.out.println("after call:"+ps.a);

System.out.println("before call byref:"+ps.a);
ps.callref(ps);
System.out.println("after call byref:"+ps.a);

}

}
