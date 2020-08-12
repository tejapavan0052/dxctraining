package taskday7mon;

public class Substr {
String SubString(String data,int index) {
        int j=0;
        char[] str=data.toCharArray();
        char[] str1=new char[str.length-index];
        for(int i=index;i<str.length;i++) {
        str1[j]=str[i];
        j++;
        }
        String manstr=new String(str1);
        return manstr;
}
String SubString(String data,int index1,int index2) {
int j=0;
       char[] str=data.toCharArray();
       char[] str1=new char[str.length-index2];
       for(int i=0;i<index1;i++) {
        str1[j]=str[i];
        j++;
       }
       for(int i=index1+index2;i<str.length;i++) {
        str1[j]=str[i];
        j++;
       }
       String manstr=new String(str1);
       return manstr;

}
public static void main(String args[]) {
Substr substr=new Substr();
String SubString=substr.SubString("hello",1);
System.out.println(SubString);
String SubString1=substr.SubString("hello World",2,3);
System.out.println(SubString1);

   }

}
