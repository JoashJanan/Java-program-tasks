package logic;

public class FindLargeSmallString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name="hello intelizign employee";
	String word="", small="",large="";
	int s=0;
	String[] words= new String[100]; 
	
	System.out.println(name);
	//name = name + " "; 
	System.out.println(name);
	for(int i=0;i<name.length();i++)
	{
		if(name.charAt(i)!= ' ')
		{
			word=word+name.charAt(i);
		}
		else
		{
			words[s]=word;
			s++;
			word="";
		}
	}
	
	small=large=words[0];
	
	for(int k=0;k<s;k++)
	{
		if(small.length()>words[k].length())
		{
			small=words[k];
		}
		if(large.length()<words[k].length())
		{
			large=words[k];
		}
		
	}
	
	System.out.println("large words:"+large);
	System.out.println("small words:"+small);
	
	}

}
