package studio3;

public class Sieve {

	public static void main(String[] args) {

	boolean sieve[]=new boolean[41];
	
		for (int j=1; j < sieve.length; j++) {
			sieve[j]=true;
		 }
	
		 for (int j=2; j < sieve.length; j++)
	     {
		 for (int i=2; j*i < sieve.length; i++) {
	           sieve[i*j]=false;}
	           
	     }
	
		 
		 for (int k=1; k < sieve.length; k++) {
			 if(sieve[k]==true) 
				 System.out.println(k);}
			 
		 
			 
		
	}

}
