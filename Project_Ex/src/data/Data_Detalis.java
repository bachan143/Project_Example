package data;

public class Data_Detalis
{
	private String label;
	private String date;
	private String time;
	private String sourse;
	private int event_Id;
	private String task_category;
	
	

    public void setLabel(String label) 
    {
        this.label = label;
    }
    public String getLabel()
	{
        return label;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getDate()
    {
    	return date;
    }
    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getTime()
    {
    	return time;
    }
    public void setSourse(String sourse)
    {
    	this.sourse=sourse;
    }
    public String getSourse()
    {
    	return sourse;
    }
    public void setEvent_Id(int event_Id)
    {
    	this.event_Id=event_Id;
    	
    }
	public int getEvent_Id()
	{
		return event_Id;
	}
	public void setTask_Category(String task_category)
	{
		this.task_category=task_category;
	}
	public String getTask_Category()
	{
		return task_category;
	}

	@Override
	public String toString() {
		return "\nData_Detalis [label=" + getLabel() + ", date=" +getDate() + ","
				+ " time=" + getTime() + ", sourse=" + getSourse()
				+ ", event_Id=" + getEvent_Id() + ", task_category=" +getTask_Category()  + "]";
	}
	
	

}
