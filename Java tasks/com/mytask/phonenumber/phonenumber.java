package com.mytask.phonenumber;

interface PhoneNumber
{
	 boolean phoneNumberFormat(String number);
	 
}

abstract class Country implements PhoneNumber
{

	public boolean phoneNumberFormat(String number) {
		// TODO Auto-generated method stub
		return false;
	}
	
}


class Brazil extends Country 
{

	@Override
	public boolean phoneNumberFormat(String number) {
		// TODO Auto-generated method stub
		return false;
	}
}
class Norway extends Country 
{

	@Override
	public boolean phoneNumberFormat(String number) {
		// TODO Auto-generated method stub
		return false;
	}
}
