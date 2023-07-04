package logic;

public class FindSmallwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hello Intelizign members";    
	      String word = "", small = "", large="";    
	      String[] words = new String[100];    
	      int length = 0;    
	       System.out.println(string.length());   
	      
	      string = string + " ";    
	          
	      for(int i = 0; i < string.length(); i++)
	      { 
	      if(string.charAt(i) != ' ')
	      {    
	              word = word + string.charAt(i);    
	         }    
	          else{    
	               
	              words[length] = word;        
	              length++;    	                 
	              word = "";    
	          }    
	      }            
	       
	      small = large = words[0]; 
	 
	      for(int k = 0; k < length; k++){   	              
	          
	          if(small.length() > words[k].length())  
	          {
	              small = words[k];
	          }
	   System.out.println(small);
	          if(large.length() < words[k].length())    
	          {
	        	  large = words[k];   
	          }
	          System.out.println(large);
	      }    
	      System.out.println("Smallest word: " + small);    
	      System.out.println("Largest word: " + large);    
	  } 
	

}
