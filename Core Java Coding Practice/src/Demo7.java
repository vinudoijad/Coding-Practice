/*String str=” java is Object oriented programming language”; , Write code to 
 * remove extra space*/


public class Demo7 {
	
	public static void main(String[] args) {
		
		String str= "My Name is Vinayak";
		str= str.replaceAll("\\s","");
		
	System.out.println(str);
	}
	
	
	}
