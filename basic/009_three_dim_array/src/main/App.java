// implementation of three dimentional array
// to input 5 matrix and print all matrices.

package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class App {
   public static void main(String[] args) throws IOException {

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n,row,col,i,j,k;
	   System.out.print("Enter number of matrices : ");
	   n = Integer.parseInt(br.readLine());

	   System.out.print("Enter size of row for each matrix : ");
	   row = Integer.parseInt(br.readLine());
	   System.out.print("Enter size of column for each matrix : ");
	   col = Integer.parseInt(br.readLine());
	   int matrix[][][] = new int[n][row][col];

	   // taking input from the console
	   System.out.println("------ Enter "+n+" matrices ------");
	   // loop for matrix
	   for(i = 0; i < n; i++){
		   System.out.println("-- Enter value for matrix "+(i+1)+" --");
		   // loop for row
		   for(j = 0; j < row; j++ ){
			   // loop for col
			   for(k = 0; k < col; k++){
				   System.out.print("Enter value for "+(j+1)+" "+(k+1)+" index : ");
				   matrix[i][j][k] = Integer.parseInt(br.readLine());
			   }
		   }
	   }

	   // printing output con the console
	   System.out.println("All matrices are : ");
	   // loop for matrix
	   for(i = 0; i < n; i++){
		   System.out.println("---------- MATRIX "+(i+1)+"----------");
		   // loop for row
		   for(j = 0; j < row; j++ ){
			   // loop for col
			   for(k = 0; k < col; k++){
				   System.out.print(matrix[i][j][k]+"\t");
			   }
			   System.out.println();
		   }
	   }

   }
}
