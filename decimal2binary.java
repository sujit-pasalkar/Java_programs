
import java.util.*;
public class T {

	/**
	 * decimal number to binary conversion
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binaryNum = "";
		System.out.println("take decimal number input from user:");
		
		int decimalNum = sc.nextInt();
		System.out.println("Entered Number is:"+decimalNum);
		
//		logic
		
		do{
			int r = decimalNum%2;
			binaryNum += String.valueOf(r);
			decimalNum /= 2;
		}
		while(decimalNum != 0);
		System.out.println("binary len:"+binaryNum.length());
		
		String bn = "";
		for(int i= binaryNum.length()-1;i>=0;i--){
			bn += binaryNum.charAt(i);
		}
		System.out.println("binary num = "+bn);	
	}
}
