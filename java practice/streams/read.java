package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class read {


public static void main(String[] args) {

try {

FileReader rd=new FileReader("abx.txt");
BufferedReader brd=new BufferedReader(rd);

System.out.println(brd.readLine());

}
catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
}
