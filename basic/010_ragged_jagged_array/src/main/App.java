// implementation of ragged or jagged or rectangular array

/*
*	4 8
*	3 5 6 1
*	8
*	2 4 5
*	1 4
*/

package main;

import java.util.Scanner;

class App {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	   // only row size is defined here in ragged array
	   int a[][] = new int[5][];

	   // allocating size of column for each row
	   a[0] = new int[2];
	   a[1] = new int[4];
	   a[2] = new int[1];
	   a[3] = new int[3];
	   a[4] = new int[2];

	   int i,j;
	   System.out.println("----- Enter Value Of Matrix -----");
	   for(i = 0; i < 5; i++){
		   for(j = 0; j < a[i].length; j++){
			   System.out.print("Value for index "+(i+1)+" "+(j+1)+" : ");
			   a[i][j] = sc.nextInt();
		   }
	   }
	   System.out.println("Ragged matrix : ");
	   for(i = 0; i < 5; i++){
		   for(j = 0; j < a[i].length; j++){
			   System.out.print(a[i][j]+"\t");
		   }
		   System.out.println();
	   }

   }
}
