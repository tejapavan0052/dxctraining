package tasksday811aug;

class t2containnum {  
    public static boolean onlyDigits(String str, int n) 
    { 
        for (int i = 0; i < str.length(); i++) 
        {
        	if(str.matches("[0-9]+"))
        	//if (str.charAt(i) >= '0'&& str.charAt(i) <= '9')
        	{ 
                return true; 
            } 
            else { 
                return false; 
            } 
        } 
        return false; 
    } 
   
    public static void main(String args[]) 
    { 
        
        String str = "1234sdfgh"; 
        int len = str.length();  
        System.out.println(onlyDigits(str, len)); 
    } 
} 