// taking input using BufferedReader
package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class App {
   public static void main(String[] args) throws IOException {
	   // InputStreamReader isr = new InputStreamReader(System.in);
	   // BufferedReader br = new BufferedReader(isr);
	   // we can use nameless object instead
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int a,b,c,gt;
	   System.out.print("Enter first numbers : ");
	   a=Integer.parseInt(br.readLine());
	   System.out.print("Enter second numbers : ");
	   b=Integer.parseInt(br.readLine());
	   System.out.print("Enter third numbers : ");
	   c=Integer.parseInt(br.readLine());

	   gt=a>b&&a>c?a:(b>c?b:c);

	   System.out.println("Greatest number = " +gt);
   }
}
