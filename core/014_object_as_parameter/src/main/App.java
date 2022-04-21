package main;

class App {
   public static void main(String[] args) {
	   PassObj obj1 = new PassObj(100, 11);
	   PassObj obj2 = new PassObj(100, 11);
	   PassObj obj3 = new PassObj(-1, -1);

	   System.out.println("obj1 == obj2 : " + obj1.equalTo(obj2));	// true
	   System.out.println("obj1 == obj3 : " + obj1.equalTo(obj3));	// false
   }
}
