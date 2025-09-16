//While Loops

class Test7{
	public static void main(String[] args){
		int i=1;
		while(i<=10){
			System.out.println("Hello world");    //till this if we run it will go infinte loop
			i++;                                  // show 10 times
		}
	}
}


public class Recurtion {
	static int count=1;             // when we want single copy , for recurtion we need single copy thath's y take static 
	public void m1(){
		System.out.println("Hellow World");
		count++;
		if(count<=10) {
			m1();
		}else {
			System.exit(0);    // JVM Shutdown
		}
	}
	
}












 // when we want single copy , for recurtion we need single copy thath's y take static 	