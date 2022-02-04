public class Simpleinterest {

	public static void main (String [] args) {
		
		double prin = 120000, rate =20, interest = 0.0;
		int time =2;

		interest= (prin*time*rate)/100;
		

		System.out.println ("Your loan of " + prin + " cedis at a rate of " + rate + " per annum, and over a period of " + time + " years has an interest of " + interest );
} 

}