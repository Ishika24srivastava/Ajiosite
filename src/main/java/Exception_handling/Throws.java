package Exception_handling;

import java.io.IOException;

class M{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  


public class Throws {
	public static void main(String args[]){  
	    try{  
	     M m=new M();  
	     m.method();  
	    }catch(Exception e){System.out.println("exception handled");}     
	  
	    System.out.println("normal flow...");  
	  }  
}
