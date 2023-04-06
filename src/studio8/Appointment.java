package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Time time;
	private Date date;
	
	public Appointment(Time time, Date date)
	{
		this.time=time;
		this.date=date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

    public static void main(String[] args) {
    	
    	Date date1 = new Date(12,25,2023, false);
    	Date date2 = new Date(12,25,2023, true);
    	Date date3 = new Date(5,11,2003, false);
    	Date date4 = new Date(6,26,1923, false);
    	Date date5 = new Date(2,28,1806, false);
    	
    	Time t1=new Time(15,23, true);
		Time t2=new Time(01,23, true);
		Time t3=new Time(06,56, true);
		Time t4=new Time(19,52, false);
		Time t5=new Time(16,26, true);
		 
    	Appointment A1=new Appointment(t5, date3);
    	Appointment A2=new Appointment(t3, date2);
    	Appointment A3=new Appointment(t3, date4);
    	Appointment A4=new Appointment(t2, date1);
    	Appointment A5=new Appointment(t1, date1);
    	
    	HashSet<Appointment> Calendar = new HashSet<Appointment>();
    	Calendar.add(A1);
    	Calendar.add(A2);
    	Calendar.add(A3);
    	Calendar.add(A2);
    	Calendar.add(A4);
    	
    	System.out.println(Calendar);
    	
    	
    	
    	
    	
    	
    }
	
	
}
