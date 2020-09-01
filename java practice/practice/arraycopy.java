package practice;

public class arraycopy {

	public static void main(String[] args) {
		
		int[] x={4,5,8,7,8,8,9,6,5,5};

		int[] y=new int[x.length];
		//0 0 0 0 0 0 0 0 0 0 0 0 0 0

		System.arraycopy(x,0,y,0,1);
		System.arraycopy(x,2,y,1,1);
		System.arraycopy(x,4,y,2,1);
		System.arraycopy(x,6,y,3,1);


		for(int a:y)
		{
		System.out.print(a+", ");
		}

	}

}
