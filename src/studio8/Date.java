package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private  int month;
	private  int day;
	private  int year;
	private boolean isHoliday;
	
	
	/**
	 * 
	 * @param month 
	 * @param day
	 * @param year
	 * @param isHoliday -boolean, if the date is of a holiday bruh 
	 */
	public Date(int month, int day, int year, boolean isHoliday)
	{
		this.month=month;
		this.day=day;
		this.year=year;
		this.isHoliday = isHoliday;
	}
	
	public String toString() {
		return month +"/" + day + "/" +year; 
	}
	 
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}



	
    public static void main(String[] args) {
    	Date date1 = new Date(12,25,2023, false);
    	Date date2 = new Date(12,25,2023, true);
    	Date date3 = new Date(5,11,2003, false);
    	Date date4 = new Date(6,26,1923, false);
    	Date date5 = new Date(2,28,1806, false);
    	
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(date1);
    	list.add(date2);
    	list.add(date3);
    	list.add(date4);
    	list.add(date5);
    	
    	
    	System.out.println(list);
    }

}
