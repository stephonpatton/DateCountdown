public class main_class {
	public static void main(String[] args) {
		Dates da = new Dates();
		da.isolateDate();	
	} //end of main
}


/*
 * Ask user for designated date in mm/dd/yy format
 * Save the date to a String variable
 * Separate the month, day, and year
 * Parse the String to an Int
 * If statement to determine number of days in that month
 * Figure out todays day (whether from user input or a java class)
 * Determine the number of days between the two dates
 * Print it out 
*/





//DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
//Calendar cal = Calendar.getInstance();
//
//String mm = "";
//String dd = "";
//String yy = "";
//	
//Scanner kb = new Scanner(System.in);
//System.out.println("Enter the date you want to countdown to in mm/dd/yy format: ");
//String input = kb.nextLine();
//if(input.length() == 8) {
//		mm = input.substring(0, 2);
//		dd = input.substring(3,5);
//		yy = input.substring(6);
//	}
//else {
//	System.out.println("Invalid format");
//	}
//int month = Integer.parseInt(mm);
//int day = Integer.parseInt(dd);
//int year = Integer.parseInt(yy);
//
//switch(month) {
//case 1: 
//case 3:
//case 5: 
//case 7:
//case 8:
//case 10:
//case 12:
//	break; //31
//case 4:
//case 6:
//case 9:
//case 11:
//	break; //30
//case 2:
//	break; //28
//	
//	}
//
//
//
//kb.close();