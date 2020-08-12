package taskday7mon;

public class charcount
{
public void Count(String str)
{
int c1=0,c2=0;
char c=' ';
char b=' ';
char[] ch=str.toCharArray();
for(int i=0;i<str.length();i++) {
c1=0;
for(int j=0;j<str.length()-i;j++) {
if(ch[i]==ch[i+j]) {
c1++;
c=ch[i];
}
}
if(c2<c1) {
c2=c1;
b=c;
}

}
System.out.println(c2+" "+b);
}

public static void main(String[] args) {

charcount ch=new charcount();
ch.Count("Hello World");
}

}

