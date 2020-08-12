package taskday3;

public class t4countnoofzeros {

	public static void main(String[] args) {
		int num=102020000,c= 0;
		while(num!=0)
		{
			if(num%10==1) {
				c++;
			num=num/10;
			}
			else {
				break;
			}
			
			System.out.println(num);
			
			
		}

	    	 
	    

	  
	}

}
