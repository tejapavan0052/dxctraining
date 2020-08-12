package tasksday5sat;

public class t4charcount {
	int countCaps(String data) {
		int c=0;
		char[] arr=data.toCharArray();
		for(int i=0;i<data.length();i++){
			if(arr[i]>=65 && arr[i]<=90)
			{
				c++;
			}
	}
		return c;
	}

	public static void main(String[] args) {
		t4charcount c=new t4charcount();

	System.out.println(c.countCaps("sdfgASDFG"));

	}

}
