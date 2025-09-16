class Test8{
	public static void main(String[] args){
		int i=rows,j=colums;
		if(i=1;i<=row;i++){
			for(j=1; j<=5;j++)
			System.out.print("* ");
	    }
		System.out.println();
		
	}
}
------------------------------------------------------------------------------//
/* Practice    
list of arguments ,Instance method with main method */

pacakage methods;

import java.util.Scanner;

public class F_method {
	public void drawpatter(int lines , boolean in reverse){                                 // list of arguments
		for(int i=1 ; i >= lines ;i++){
			for (int space =lines; space>=lines ;space--){
				System.out.print(" ");
			}
			for(int ast =1 ; ast<=lines ; ast++){
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
}
public static void main(String[] args){
	F_method A =new F_method;
	Scanner sc= new Scanner(System.in);
	int lines = sc .nextInt();
	A.drawpattern(lines );                // Language pass by value
}




















