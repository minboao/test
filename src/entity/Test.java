package entity;

public class Test {
	static String yes() {
	  	int a = 1;
	  	int b = 1;	    
	    if (a == 1) {
	    	return "one";
	    }
	    if (b == 1) {
	    	return "two";
	    }
	    return "three";
  }
  public static void main(String[] args){
	  System.out.println(yes());	
  }
}