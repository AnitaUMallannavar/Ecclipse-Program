package topper.wrapper;

import java.io.PrintStream;

public class ReversStrintg {
        public static String reverse(String text) {
        		if(text==null) return null;
        	PrintStream ot = null;
			for(int i=text.length() -1;i>=0;i--) { 
              PrintStream append = ot.append((char) text.length);        
        	}
        	return ot.toString();
        }
	public static void main(String[] args) {
		String text="word";
		System.out.println("origional string - "+text);
		System.out.println("reversed string - "+reverse(text));
	}

}
