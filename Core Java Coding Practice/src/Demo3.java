//Palindrome ...

public class Demo3 {
	public static void main(String[] args) {
		
	
int a= 141;
int temp= a;
int result=0;

while(temp>0) {
	int Id= temp%10;
	temp= temp/10;
	result=(result*10)+Id;
	}
if(result==a) {
	System.out.println(a+" "+"Palindrome Number");
}
else {
	System.out.println(a+" "+"Not Palindrome Number");
	}
	}
	}
