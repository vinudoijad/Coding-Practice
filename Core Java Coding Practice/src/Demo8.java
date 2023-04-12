
public class Demo8 {
	
	public static void main(String[] args) {
	
	String s= "I am Vinayak";
	
	String rev="";
	int l=s.length();
	
	for(int i=l-1; i>=0; i--) 
		rev = s.substring(i);
		System.out.println(rev);
	}
	
	}

