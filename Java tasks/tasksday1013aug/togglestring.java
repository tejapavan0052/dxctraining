package tasksday1013aug;

public class togglestring {
	public static void main(String[] args) {
		String input="HeLLo";
		char[] arr=input.toCharArray();
		for(char b:arr) {
		if(Character.isUpperCase(b)){
		b= Character.toLowerCase(b);
		}
		else if(Character.isLowerCase(b)){
		   b= Character.toUpperCase(b);
		}
		System.out.print(b);

		}
		
	}
}

 