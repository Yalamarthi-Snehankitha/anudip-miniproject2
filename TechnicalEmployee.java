package miniproject2;

public class TechnicalEmployee extends Employee
{
	public int checkIns;
	public TechnicalEmployee(String name)
	{
		// default base salary 75000
		super(name,75000.00);
		checkIns=0;
	}
	
	public String employeeStatus()
	{
		// should return like this "1 Kasey has 10 successful check ins"
		return toString()+" has "+checkIns+" successful check ins";
	}
	public void setCheckIn()
	{
		checkIns++;
	}


}
