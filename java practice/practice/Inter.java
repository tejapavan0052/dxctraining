package practice;
class Person{}

interface Flyer{
void fly();
}
 class Bird implements Flyer{
public void fly() {
System.out.println("BRID FLY");
}
}
class SuperMan extends Person implements Flyer{

public void fly() {
System.out.println("SuperMan flyies");
}
}

abstract class AirCraft implements Flyer
{

}


class AirPlane extends AirCraft
{

@Override
public void fly() {
System.out.println("Air plane flies");
}

}


public class Inter{
public static void main(String[] args) {

}

}

