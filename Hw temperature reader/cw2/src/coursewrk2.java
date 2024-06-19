import java.util.Scanner;
public class coursewrk2{
	public static void main (String[]args) {
	Scanner scan = new Scanner(System.in);
	
	int record;
	String name[];
	int temperature;
    int sum=0;
	
	System.out.println("Welcome to HW temperature reader");
	System.out.println("--------------------------------");
	
	String [] month= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
	
	for (int i = 0; i <	month.length; i++) {
		 System.out.println("enter the temperatures of the month" +month[i]+".>");
		 temperature = scan.nextInt();
		sum = +temperature;
	 }
System.out.println("the average temp of the year is :");
double average = (double)sum/12;




	
	
	
	
	
	}
}
	
  
  
  