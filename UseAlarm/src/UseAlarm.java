/**
 * Author:	Sam Cooney
 * Project:	UseAlarm
 * Date:	Dec 6, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;	// Import Scanner class.

public class UseAlarm {	// Start UseAlarm.
	
	public static void main(String[] args) {	// Start main.
		Scanner scan = new Scanner(System.in);	// Instantiate object of class Scanner.
		int hour, minute, onOff;	// Declare integer variables.
		
		do {	// Loop to enter hours.
			
			System.out.println("Enter an hour: ");
			hour = scan.nextInt();	// Scans in hour.
			scan.nextLine();		// Skips a line.
			if(hour < 1 || hour > 12) {	// Checks for valid number.
				
				System.out.println("This is an invalid number. Please try again.");
			}
			
		} while(hour < 1 || hour > 12);	// Loops.
		
		do {	// Loop to enter minutes.
			
			System.out.println("Enter a minute: ");
			minute = scan.nextInt();	// Scans in minute.
			scan.nextLine();			// Skips a line.
			if(minute < 1 || minute > 59) {	// Checks for valid number.
				
				System.out.println("This is an invalid number. Please try again.");
			}
			
		} while(minute < 1 || minute > 59);	// Loops.
		
		Alarm myAlarm = new Alarm(hour, minute);	// Instantiate object of class Alarm.
		
		System.out.println("Set the alarm by entering 1, or shut it off by entering 0.");
		onOff = scan.nextInt();	// Scans in onOff.
		scan.nextLine();		// Skips a line.
		myAlarm.coutMin(minute);	// Calls method countMin.
		if(onOff == 1) {	// Calls alarmSet if onOff is 1.
			
			myAlarm.alarmSet();
		} else if(onOff == 0) {	// Calls shut alarm if onOff is 0.
			
			myAlarm.shutAlarm();
		}
		
		System.out.println(myAlarm);	// Prints using toString method.
		
		scan.close();	// Close scan.
	}	// End main.

}	// End UseAlarm.
