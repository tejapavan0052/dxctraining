package tasksday4;

public class t3compare {
	public static boolean checkEqual(char c1,char c2) {
		if(c1==c2||c1==(c2+32)||c1==(c2-32)) {
			return true;
			}
		else return false;
		}
	public static void main(String[] args) {
		System.out.println(checkEqual('a','A'));		
			}
	}


