package calllogs;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class CallLog 
{
//private String Name;
private String	numberCalled ;
private Date	startTime ;
private Date	endTime;



public CallLog( String numberCalled, Date startTime, Date endTime) {
	super();
//	Name = name;
	this.numberCalled = numberCalled;
	this.startTime = startTime;
	this.endTime = endTime;
}
//public String getName() {
//	return Name;
//}
//public void setName(String name) {
//	Name = name;
//}
public String getNumberCalled() {
	return numberCalled;
}
public void setNumberCalled(String numberCalled) {
	this.numberCalled = numberCalled;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
@Override
public String toString() 
{
	return   numberCalled +" " +startTime +" "+endTime + "\n";
}
}
class sortbystart implements Comparator<CallLog> { 
	  
    // override the compare() method 
	
    public int compare(CallLog c1, CallLog c2) 
    {
//       if (c1.getStartTime().before( c2.getStartTime()) )
//           return 1; 
//       else if (c1.getStartTime().after(c2.getStartTime())) 
//            return -1; 
//       else
//            return 0; 
    return c1.getStartTime() .compareTo(c2.getStartTime());
    
    } 
} 
  
