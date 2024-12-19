package Task;

import java.util.*;
import java.time.*;
import java.text.*;

public class DateFunctionTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Date in the Format ('dd/mm/yyy') : ");
		String given_date = sc.next();
		//System.out.print("");
		
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		
		try {

			 // Parse the input date
            Date date = df.parse(given_date);
            System.out.println("The Given Date is : " + df.format(date));

            // Use Calendar to add days, months, and years
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Adding 4 days, 4 months, and 4 years
            calendar.add(Calendar.DAY_OF_MONTH, 4);
            calendar.add(Calendar.MONTH, 4);
            calendar.add(Calendar.YEAR, 4);

            // Correct handling of months overflow
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH) + 1; 
            int year = calendar.get(Calendar.YEAR);

            // Display the updated date
            System.out.printf("Date after adding 4 days, 4 months, and 4 years: %02d/%02d/%04d\n", day, month, year);
		}
		catch(ParseException e) {
			System.out.print("Invalid date Format");
		}
		sc.close();
	}
}