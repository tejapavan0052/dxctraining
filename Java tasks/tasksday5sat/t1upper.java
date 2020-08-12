package tasksday5sat;

public class t1upper {
	public static boolean Upper(String data)
	{	
		boolean f=false;
	char[] arr=data.toCharArray();
	for(int i=0;i<data.length();i++)
	{
		if(arr[i]>=65 && arr[i]<=90)
		{
			return true;
		}
		
	}
	  return f;
	
			
			
	}
			
	public static void main(String[] args) {
		System.out.println(Upper("a"));
		
		

		
	}

}
