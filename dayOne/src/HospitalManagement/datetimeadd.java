package HospitalManagement;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetimeadd {

	public static void main(String[] args) {
		String time="12:10";
		int min=10;
		String result=dateTime(time,10);
		System.out.println("Result : "+result);
	}

	static String dateTime(String pat_inTime, int totalConsultantTime) {

		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt = LocalTime.parse(pat_inTime);
		String outTime = df.format(lt.plusMinutes(totalConsultantTime));
		return outTime;
	}

}
