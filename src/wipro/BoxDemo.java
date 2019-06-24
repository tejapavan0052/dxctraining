package wipro;
class Box{
	double length;
	double width;
	double height;
	double volume()
	{
		return length*width*height;
	}
}
public class BoxDemo {
public static void main(String args[])
{
Box b=new Box();
b.length=5;
b.width=10;
b.height=50;
System.out.println(b.volume());
}
}
