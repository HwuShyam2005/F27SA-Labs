package popcorn1;

import java.util.Scanner;
public class popcorn{
	static final int TIME_PER_PACKET=205;
    public static void main(String[] args) {
    
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("welcome to ipopcorn");
    	System.out.println("xxxxxxxxxxxxxxxxxxx");
    	
    	System.out.println("Hello,what is youre full name:");
    	String userName = scan.nextLine();
    	
    	System.out.println("Hello" +userName+ ", how many no of popcorn packets do you need:");
    	int packets = scan.nextInt();
    	
    	int time=packets + TIME_PER_PACKET;
    	System.out.println("Please set the time to:" +time);
    	
    	int min = time/60;
    	int sec = time%60;
    	
    	System.out.println("Please set the time to"+min+"minutes and"+sec+"seconds");
    	
    	scan.close();
    }
}