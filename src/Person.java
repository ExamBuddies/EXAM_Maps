
public class Person {

	private String name; 
	private int age; 
	private String cpr; 
	
	public Person(int age, String name, String cpr)
	{
		
		this.name = name;
		this.age = age; 
		this.cpr = cpr; 
		
	}
	public void setAge(int age)
	{
		this.age = age; 
	}
	public int getAge()
	{
		return age; 
	}
	public void setName(String name)
	{
		this.name = name; 
	}
	public String getName()
	{
		return name; 
	}
	public void setCpr(String cpr)
	{
		this.cpr = cpr; 
	}
	public String getCpr()
	{
		return cpr; 
	}
	public String toString()
	{
		return "Name: " + name + "\nAge: " + age + "\nCPR: " + cpr;   
	}
}
