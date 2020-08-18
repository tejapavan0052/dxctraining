package sba.assesment2;
class CustomException extends RuntimeException{

public CustomException() {
super("Not Valid. Please Enter Valid Marks between 0 and 100");
}
}

class Marks
{
void Stumarks(int Marks)throws CustomException
{
if(Marks > 100)
throw new CustomException();

else
System.out.println(Marks+" Marks are valid");
}

}


