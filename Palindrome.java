package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String strRev=new StringBuffer(str).reverse().toString();
	      if (str.equals(strRev))
	          System.out.println("Palindrome!");
	       else
	          System.out.println("Not a Palindrome!");
		

	}

}
