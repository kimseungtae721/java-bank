package quiz1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		   String star = "";
		   String star1 = "*****";
				
			Scanner scanner = new Scanner(System.in);
		   System.out.println("숫자를 입력하세요");
		   int num = scanner.nextInt();
		
		   if(num >= 1) { 
		     for(int i = 0; i < num; i++) 
		      System.out.println(star += "*");
		     }else if(num <= 1) { 
		    	 for(int i = 1 ; i<=5; i++) {
		    		 
		    	   for(int j = 2; j <= i; j++) { 
		    	   System.out.print(" ");
		    	   }
				   for(int k = 5-i; k >= 0; k--) {
					   System.out.print("*");
				   }
				   System.out.println();
		    	 }
			}
		   else { 
			   System.out.println("출력기능이 없습니다");
		   }
		   
		   }
	}