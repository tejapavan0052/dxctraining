package tasksday5sat;

public class t3capsonly {
		public static boolean isCapsOnly(String data)
		{	
		boolean f=false;
		int c=0;
		char[] arr=data.toCharArray();
		for(int i=0;i<data.length();i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				c++;
			}
		}
		if(c==arr.length)
		{
			return true;
			}
			 
		  return f;
		
				
				
		}

		public static void main(String[] args) {
			System.out.println(isCapsOnly("Ainh"));
		}
	}


