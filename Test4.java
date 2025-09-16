// If Else 
	
// class Test4{
	// public static void main(String[] args){
		// int x=5 ,y=10 ;
		// if(x<y)
			// System.out.println("Y is Greater");
		// else
			// System.out.println(" Smaller");
	// }
// }
/*--------------------------------------------------------
// class P1{
	// public static void main(String[] args){
		// int a=4 , b=10,c=0 ;
		// if(a>b){
			// System.out.println("A");
		// }else {
			// System.out.println(c);
		// }
		// if(b>a){
			// System.out.println("B");
		// }else{
			// System.out.println(c);
		// }
			
	// }
// }

/*class Q1{
	
	public static void main(String[] args){
		int i=10;
		if(i>0){
			if(i%2==0){
				System.out.print("even");
			}else{
				System.out.print("odd");
			}
		}else{
			System.out.println();
		}
	}
}*/
/*------------------------------------------------------------*/

/*import java.util.*;
class Q2{
	public static void main(String[] args){
		int i=5;
         for(i=1;i<=5;i++){
			 for(int j=1;j<=i;j++){
				 System.out.print("* ");
			 }System.out.println();
		 }
	}
}*/

/*G:\Java Programs>java Q2
*
**
***
****
***** */
/*--------------------------------------------------------------------------*/

/*import java.util.*;
class Q3{
	public static void main(String[] args){
		int row=5 , colum=4;
		 for(int i=1;i<=row;i++){
			 for(int j=1; j<=colum; j++){
				 System.out.print("* ");
			 }System.out.println();
		 }
	}
	
}
G:\Java Programs>java Q3
* * * *
* * * *
* * * *
* * * *
* * * *
/*-------------------------------------------------------------------------------------*/
/*
import java.util.*;
class Q4{
	public static void main(String[] args){
		int row=5 , colum=4;
		 for(int i=1;i<=row;i++){
			 for(int k=row-1; k>=i ; k--){
			 System.out.print(" ");
			 }
			 for(int j=1; j<=colum; j++){
				 System.out.print("* ");
			 }System.out.println();
		 }
	}
	
}
G:\Java Programs>java Q4
    * * * *
   * * * *
  * * * *
 * * * *
* * * *
------------------------------------------------------------------------------------------------*/

/*import java.util.*;
class Q5{
	public static void main(String[] args){
		int count=5;
		for(int i=1;i<=count;i++){
			for(int k=count-1; k>=1;k--){
				System.out.print(" ");
			for(int j==1 ; j=i*2-1;j++){
				System.out.print("*");	
			}
			}System.out.println();
		  }
		}
	}*/
/*--------------------------------------------------------------------------------------------------------------*/

/*import java.util.*;
class Q6{
	public static void main(String[] args){
		int  a = 5;
		for(int i= 1; i<=5 ; i++) {
			
		  for(int j=1 ;j<=5-i ;j++){
			System.out.print(" ");
		}
		for(int j=1 ;j<=2*i-1 ;j++){
			
			if(j==1 || j==2*i-1 || i==5){
				System.out.print("*");
			
			}else{
				System.out.print(" ");
			}
			
		}System.out.println();
	}
  }
} */
/*G:\Java Programs>java Q6
    *
   * *
  *   *
 *     *
*********  */

//----------------------------------------------------------------------------------------------------------//
/* import java.util.*;
class Q9{
	public static void main(String[] args){
		int  a = 5;
		for(int i= 1; i<=5 ; i++) {
			
		  for(int j=1 ;j<=5-i ;j++){
			System.out.print(" ");
		}
		for(int j=1 ;j<=2*i-1 ;j++){
			
			if(j==1 || j==2*i-1 || i==5){
				System.out.print("*");
			
			}else{
				System.out.print("*");
			}
			
		}System.out.println();
	}
  }
}
G:\Java Programs>java Q9
    *
   ***
  *****
 *******
*********  */

/*------------------------------------------------------------------------------------------------------*/
/*import java.util.*;
class Q10{
	public static void main(String[] args){
		char  ch = 'a';
		for(char a= 97; a<=100 ; a++) {
			
		  for(char j='a' ;j<=a-1 ;j++){
			System.out.print(j);
			
		}System.out.println();
			
		}System.out.println();
	}
  } */
/*G:\Java Programs>java Q10

a
ab
abc   */
/*--------------------------------------------------------------------------------------------------------------*/
/*import java.util.*;
class Q11{
	public static void main(String[] args){
		for(int line=1; line<=4; ++line){
			for(int space=3; space>=line; --space){
				System.out.print(" ");
			}
			int num=1 ;
			char ch='a';
			if(line%2==0){
				for(;num<=line; num++){
					System.out.print(num+" ");
				}
			}else{
				for(int i=1; i<=line;++i){
					System.out.print(ch+" ");
					ch++;
				}
					
				}
				System.out.println();
			}
		}
	}
G:\Java Programs>java Q11
   a
  1 2
 a b c
1 2 3 4
/*----------------------------------------------------------------------------------------------------*/
/*
import java.util.*;
class Q12{
	public static void main(String[] args){
	for( int line=1 ;line<=5;++ line){
		for(int space=3 ;space>=line ;--space){
			System.out.print(" ");
		}
		int n=1;
		char C='b';
		if(line%2==0){
			for(;n<=line ;n++){
				System.out.print(n+" ");
			}
				}else{
				for(int i=1;i<=line ;++i){
					System.out.print(C+" ");
				C++;
			}
		}System.out.println();
	}
	}
}
G:\Java Programs>java Q12
   b
  1 2
 b c d
1 2 3 4
b c d e f  */

/*--------------------------------------------------------------------------------------------------*/
/*import java.util.*;
class Q7{
	public static void main(String[] args){
		int row=5;
         for(int i=1;i<=5;i++){
			 for(int j=1;j<=i;j++){
				 System.out.print(j);
			 }System.out.println();
		 }
	}
} */
/*G:\Java Programs>java Q7
G:\Java Programs>java Q7
1
12
123
1234
12345   */
/*------------------------------------------------------------------------------------------------------------*/

/*import java.util.*;
class Q8{
	public static void main(String[] args){
	     int row=5;
         for(char  i='a'; i<='e' ;i++){
			 System.out.println();
			 for(char j= 'a';j<= 'e';j++){
				 System.out.print(j);
			 }
		 }System.out.println();
	}
	
} */
/*---------------------------------------------------------------------------------------------------------------*/
/*
import java.util.*;
class Q13{
	public static void main(String[] args){
		int size=5;
		for(int i=0; i<size; i++){
			for(int j=0;j<size;j++){
				if(i==0||i==size-1||j==0||j==size-1){
					System.out.print( "* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
			
	}
}
/*
G:\Java Programs>java Q13
* * * * *
*       *
*       *
*       *
* * * * *
              */
/*-------------------------------------------------------------------------------------------------------------------*/
/*
import java.util.*;
class Q14{
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("* ");
			}
				
			System.out.println();
		}

	}
}
G:\Java Programs>java Q14
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
------------------------------------------------------------------------------------------------------------------- */

import java.util.*;
class Q15{
	public static void main(String[] args){
		for(int i=1;i<=5 ;i++){
			for(int j=1;j<=5;j++){
				if(i==0 || i==j-1 || j==0 || j==i-1){
				System.out.print("* ");
				}else{
					System.out.print(" ");
					
				}
			}
			
		System.out.println();
		}
			
		}
	}  














