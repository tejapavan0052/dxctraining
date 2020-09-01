package practice;

class Calc{
public void sum(){
System.out.println("sum method");
}
public void mul(){
System.out.println("mul method");
}
}

class SciCalc extends Calc{

}

public class cacu {

public static void main(String[] args) {
SciCalc sc=new SciCalc();
sc.sum();
sc.mul();
}

}

