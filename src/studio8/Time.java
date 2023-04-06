package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minutes;
	private boolean is12;
	
	
	/**
	 * 
	 * @param hour - hours in 24 hour format, range from 1 to 23
	 * @param minutes - minutes, range from 1 to 59
	 */
	public Time(int hour, int minutes, boolean is12)
	{
		
		this.hour=hour;
		this.minutes=minutes;
		
			
	}
	
	public String toString()
	{
		
//		if (is12 && hour >12)
//			return (hour-12) +":"+ minutes + "in 12 hours format";
//		
//		else if (is12)
//			return (hour) +":"+ minutes + "in 12 hours format";
//		
		if (is12) {
			if (hour>12) {
				return (hour-12) +":"+ minutes ;
			} else {
				return (hour) +":"+ minutes ; 
			}
		}			
		else {
			return hour +":"+ minutes;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minutes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minutes == other.minutes;
	}


	public static void main(String[] args) {
		Time t1=new Time(15,23, true);
		Time t2=new Time(01,23, true);
		Time t3=new Time(06,56, true);
		Time t4=new Time(19,52, false);
		Time t5=new Time(16,26, true);
		 
		Date date2 = new Date(12,25,2023, true);
		 
		 
		LinkedList<Time> list = new LinkedList<Time>();
    	list.add(t1);
    	list.add(t2);
    	list.add(t3);
    	list.add(t4);
    	list.add(t1);
    	
    	
    	System.out.println(list);
    	
    	HashSet<Time> set = new HashSet<Time>();
    	set.add(t5);
    	set.add(t5);
    	set.add(t5);
    	
    	System.out.println(set);
 
    	
    }

	

}