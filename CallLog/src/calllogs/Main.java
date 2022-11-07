package calllogs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;



public class Main {
	public static void main(String args[]) throws ParseException
	{
		
//Date  formating
		String pattern="dd-mm-yyyy hh:mm:ss";
		SimpleDateFormat ft = new SimpleDateFormat (pattern);
		
//		ArrayList
	    ArrayList<CallLog> list=new  ArrayList<>();
        list.add(new CallLog("0422201430",ft.parse("10-10-2015 10:00:00"),ft.parse("10-10-2015 16:08:01")));
		list.add( new CallLog("0422201430",ft.parse("12-10-2015 12:00:00"),ft.parse("18-10-2015 16:08:01")));
		list.add( new CallLog("0422201430",ft.parse("11-10-2015 12:00:00"),ft.parse("18-10-2015 16:08:01")));
		Collections.sort( list,new sortbystart());
		
		 ArrayList<CallLog> list2=new  ArrayList<>();
		 list2.add(new CallLog("0422201430",ft.parse("16-10-2015 16:08:01"),ft.parse("10-10-2015 16:08:01")));
		 list2.add( new CallLog("0422201430",ft.parse("18-10-2015 16:08:01"),ft.parse("18-10-2015 16:08:01")));
		 
		 Collections.sort( list2,new sortbystart());
		
		
		
		Map<String ,ArrayList>  map=new HashMap<>();
		map.put("C102", list);
		map.put("C101", list2);
		
		   for(Map.Entry m:map.entrySet())  
		     {  
		        System.out.println( "Customer Name :"+m.getKey()+"\n"+"Contact Number Call Starts Call Ends"+" \n"+m.getValue().toString());   
		     }  
	
	
	}

}