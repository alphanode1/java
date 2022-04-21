package main;

class PassObj{
	int a,b;
	PassObj(int i, int j){
		a = i;
		b = j;
	}
	boolean equalTo(PassObj obj){
		if(obj.a == a && obj.b == b) return true;
		else return false;
	}
}
