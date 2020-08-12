package taskday3;


public class t3reverse {

	public static void main(String[] args) {
		int x = 1234, rev = 0,d;

        while(x != 0) {
            d = x % 10;
            rev = rev * 10 + d;
            x = x/10;
        }
        System.out.println( rev);
		
	}

}
