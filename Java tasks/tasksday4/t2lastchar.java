package tasksday4;

public class t2lastchar {
	String myReplace(String str,char oldChar , char newChar)
	{
	char[] arr=str.toCharArray();
	for(int i=1;i<str.length();i++){
	if(arr[i]==oldChar)
	arr[8]=newChar;
	}
	String manStr=new String(arr);
	return manStr;
	}
	public static void main(String[] args) {
	 t2lastchar scm=new t2lastchar();
	 String data=scm.myReplace("test data", 't', 'h');

	System.out.println(data);




	}

}
