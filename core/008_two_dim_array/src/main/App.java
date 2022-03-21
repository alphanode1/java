// implementation of two dimentional array
// wap in java to input any matrix and print transpose of matrix

package main;

import java.util.Scanner;
import java.io.IOException;

class App {
   public static void main(String[] args) throws IOException {

	   Scanner scn = new Scanner(System.in);
	   int row,col;
	   System.out.println("Enter the size of row and column : ");
	   row = scn.nextInt();
	   col = scn.nextInt();

	   int matrix[][] = new int[row][col];
	   int i,j;

	   for(i = 0; i < matrix.length; i++){
		   for(j = 0; j < matrix[i].length; j++){
			   System.out.print("Enter the value of "+(i+1)+" "+(j+1)+" index : ");
			   matrix[i][j] = scn.nextInt();
		   }
	   }

	   System.out.println("Matrix is : ");
	   for(i = 0; i < matrix.length; i++){
		   for(j = 0; j < matrix[i].length; j++){
			   System.out.print(matrix[i][j]+"\t");
		   }
		   System.out.println();
	   }

	   System.out.println("Transpose of matrix is : ");
	   for(i = 0; i < col; i++){
		   for(j = 0; j < row; j++){
			   System.out.print(matrix[j][i]+"\t");
		   }
		   System.out.println();
	   }
   }
}
