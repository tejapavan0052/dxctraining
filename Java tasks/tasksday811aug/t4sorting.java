package tasksday811aug;

public class t4sorting {
	public static void main(String args[]) {
		int[] a= {9,7,5,3,1,6,8};
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {

		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}

		}
		System.out.print("Ascending Order:");
		    for (int i = 0; i < a.length - 1; i++)
		    {
		        System.out.print(a[i] + ",");
		    }
		    System.out.print(a[a.length - 1]);
		}

		}
