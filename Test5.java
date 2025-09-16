//Scanner(taking user input)

import java.util.Scanner;
class Test5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age  =(int)sc.nextFloat();
		System.out.println("Enter the double age");
		double Age =sc.nextDouble();
		System.out.println(Age);
		
		
		
		if(age>=0 & age<=18){
			System.out.println("Child");
		}else if(age>=18 & age<=60){
			System.out.println("Adult");
		}else if(age>=60 & age<=100){
			System.out.println("Senior Citizen");
		}else{
			System.out.println("Invalid Age");
		}
	}
}
