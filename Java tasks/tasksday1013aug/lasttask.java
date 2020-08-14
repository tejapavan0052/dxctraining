package tasksday1013aug;

public class lasttask {
	public String input(String data){

		StringBuilder sb=new StringBuilder(data);
		String input= sb.reverse().toString();
		//try to replace rev with ur own rev method
		String input1= input.toLowerCase();
		//try to replace toLower with ur own toLower method

		char[] arr= data.toCharArray();
		char[] revdata=input1.toCharArray();

		for(int i=0;i<data.length();i++)
		{

		if(arr[i] >= 65 && arr[i]<=90)
		{
		revdata[i]=(char)(revdata[i]-32);
		}

		}

		input1=new String(revdata);

		return input1;
		}



		public static void main(String[] args) {

		String data="HeLloWORld";
		System.out.println(data);
		System.out.println("result "+new lasttask().input(data));

		}

		}
