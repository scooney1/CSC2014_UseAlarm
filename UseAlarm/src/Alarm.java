/**
 * Author:	Sam Cooney
 * Project:	UseAlarm
 * Date:	Dec 6, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

public class Alarm {	// Start Alarm.
	int hour, minute;	// Declare integer values.
	int alarmSet = 0;	// Declare integer value.
	
	public Alarm(int ahour, int aminute) {	// Constructor method.
		
		hour = ahour;		// Sets global variable.
		minute = aminute;	// Sets global variable.
	}	// End constructor.
	
	public void coutMin(int p1) {	// Method countMin.
		
		for(int i=1;i<=minute;i++) {	// Loop to print minutes.
			
			System.out.println(i);
		}
		System.out.println("\n");
	}	// End method.
	
	public void alarmSet() {	// Method alarmSet.
		
		alarmSet = 1;	// Set to 1.
	}	// End method.
	
	public void shutAlarm() {	// Method shutAlarm.
		
		alarmSet = 0;	// Set to 0.
	}	// End method.
	
	public String toString() {	// Method toString.
		
		if(alarmSet == 1) {	// Checks if 1.
			
			return("The alarm is turned on. " + hour + ":" + minute + "\n");
		} else {	// Checks if not 1.
			
			return("The alarm is turned off. " + hour + ":" + minute + "\n");
		}	
	}	// End method.

}	// End Alarm.
