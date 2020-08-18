package sba.assesment2;

public class Q2 {
		public static void main(String[] args) {
		String input="This Is Java Programming";
		String[] input1 = input.split(" ");
		        for (int i=0;i<input1.length;i++) {
		        String c=input1[i];
		        StringBuilder sb=new StringBuilder(c);
		        sb.reverse();
		        String d=sb.toString();
		        System.out.println(d);
		       
		        }
		           
		       
		}
	}


		
