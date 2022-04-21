package main;

class App {
   public static void main(String[] args) {
	   int a[] = {10,20,30,40,50};
	   int sum = 0;
	   for(int i : a)
	   {
		   sum = sum + i;
	   }
	   System.out.print("All values are : ");
	   for(int i : a)
	   {
		   System.out.print(i+" ");
	   }
	   System.out.print("\nSum of all numbers are : "+sum+"\n");
   }
}
