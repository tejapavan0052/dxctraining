package tasksday4;

public class t1firstchar {
	String myReplace(String str,char oldChar , char newChar)
	{
	char[] arr=str.toCharArray();
	for(int i=0;i<str.length();i++){
	if(arr[i]==oldChar)
	arr[0]=newChar;
	}
	String manStr=new String(arr);
	return manStr;
	}

	public static void main(String[] args) {
	 t1firstchar scm=new t1firstchar();
	 String data=scm.myReplace("test data", 't', 'w');

	System.out.println(data);


	}

}
