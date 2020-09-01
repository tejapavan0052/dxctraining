package com.mytask.phonenumber;

class India extends Country{
	int count=0;
	@Override
	public boolean phoneNumberFormat(String number) {
		// TODO Auto-generated method stub
		System.out.println(number);
		char[] arr=number.toCharArray();
		if(arr[0]=='+' && arr[1]=='9' && arr[2]=='1' && arr[3]=='-')
		{
			for(int i=4;i<number.length();i++)
			{
				if(arr[i]>='0' && arr[i]<='9')
					count++;
				else
					return false;
			}
		}
		else 
		{
				return false;
				
		}
		if(count==10)
			return true;
		else
			return false;
}


	}
		
				
				
		
		
	