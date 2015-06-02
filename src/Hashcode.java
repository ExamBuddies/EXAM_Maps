import java.sql.Date;


public class Hashcode
{
	String tabel[] = new String[7]; 
	String s1; 
	Date date; 
	public Hashcode(String s)
	{
		s1 = s; 
	}
	public int hashcode(String s)
	{
//		return s.hashCode(); 
		int h = 0; 
		for(int i = 0; i<s.length(); i++) 
		{
			h = 31*h + s.charAt(i); 
			if(h<0);
		}
		return h; 
	}
	public int index(String k)
	{
		return(hashcode(k) % tabel.length);
	}
	public String getValue(String key)
	{
		return tabel[index(key)]; 
	}
	public void setValue(String key, String value)
	{
		tabel[index(key)]= value; 
	}
}
