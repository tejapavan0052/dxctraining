package tasksday1013aug;

public class Revwrse {

	public static void main(String[] args) {
		String input="HELLO",input1="",who;
		
		int len= input.length();
		for ( int i = len- 1 ; i >= 0 ; i-- )
			{
		input1= input1+ input.charAt(i);
			}
		System.out.println("Reverse String is: "+input1);
		
	}

}
/*StringBuffer input1=new StringBuffer();
		input1.append(cap);
		input1=input1.reverse();
		String input2=input1;*/