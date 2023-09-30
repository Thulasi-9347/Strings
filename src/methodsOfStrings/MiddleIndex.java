package methodsOfStrings;

public class MiddleIndex {
	/*
	public static void main(String[] args) {
		
		 String str = "kodnest Technologies";
		 
	      int c=0;
	      int l=str.length();
	      for(int i=0;i<=l;i++)
	      {
	    	  
	    	  if(str.charAt(i)==str.charAt('o'))
	    	  {
	    		  
	    		  c=c+1;
	    	  }
	      }
	      System.out.println(c);
		 
		 /*
		   int  count=0;
		  
	
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
			{
			 if(count=='o')
			{
				count++;
				}
			}
			
		}
	System.out.println(count);
	
	*/	
	      String str=new String("javapython");
	          public static int pairCounter( String str )
	          { 
	            //count pairs and aaa counts as 2
	        	  
	            int count = 0;
	            int stringLength = str.length();
	            String string = str;
	            
	            for( int i = 1; i <= stringLength; i++ )
	            {
	               char first = string.charAt( 0 );
	               if( first == string.charAt( i ) )
	               {
	                  count++;
	               }
	               string = string.substring( i );
	            }
	            return count;
	          }
	      

}


