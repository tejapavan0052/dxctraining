package taskday7mon;

public class Calculation {
int sum(int... x){
int i;
int sum=0;
int min=x[0];
int max=x[1];
float avg;
int c=0;
int odd=0;
int even=0;

for(i=0;i<x.length;i++)
{
sum=sum+x[i];
}
avg=((sum/x.length));

System.out.println("Average is "+avg);
for(i=0;i<x.length;i++) {
if(x[i]<min)
{
min=x[i];
}

}
System.out.println("min value "+min);
for(i=0;i<x.length;i++) {
if(x[i]>max)
{
max=x[i];
}
}
System.out.println("Max value "+max);
System.out.println("Even no are");
for(i=0;i<x.length;i++) {
if(x[i]%2==0)
{
even=even+1;
System.out.println(x[i]);
}
             
}
System.out.println("Count of even are "+even);
System.out.println("odd no are");
for(i=0;i<x.length;i++) {
if(x[i]%2!=0)
{
odd=odd+1;
System.out.println(x[i]);
}

}
System.out.println("Count of odd are "+odd);
for(i=0;i<x.length;i++) {
if(x[i]%3==0)
{
c=c+1;
}

}
System.out.println("Divisible by 3 are "+c);
return sum;


}
public static void main(String[] args) {
Calculation c=new Calculation();
System.out.println(c.sum(10,20,1,2,3,25,32));

}

}
