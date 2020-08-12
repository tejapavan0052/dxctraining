package taskday3;

public class t5countlastzeros {
	public static void main(String[] args) {
	int num=102020000,c= 0;

    while(num != 0)
    {
    	if(num%10==0)
    	{
    		c++;
    		num /= 10;
    	}
    	else {
    		break;
    	}
    	 
    }

    System.out.println(c);

}
}
