package tasksday5sat;

public class t2containnumber {
	public static boolean isNum(String data)
	{	
	boolean f=false;
	char[] arr=data.toCharArray();
	for(int i=0;i<data.length();i++)
	{
		if(arr[i]>='0' && arr[i]<='9')
		{
			return true;
		}
		
	}
	  return f;
	
			
			
	}

	public static void main(String[] args) {
		System.out.println(isNum("rinh"));

	}

}
