
public class TestHashcode
{
	public static void main(String [] args)
	{
		Hashcode h = new Hashcode("Test"); 
		String key = "Java"; 
		h.setValue(key, "Kildetoft"); 
		System.out.println(h.index(key));
		
//		Hashcode h = new Hashcode(); 
//		System.out.println(h.hashCode());
//		System.out.println(h.hashcode("Arne"));
//		System.out.println(h.hashcode("Anre"));
//		System.out.println(("Arne").hashCode());
//		
//		Hashcode h1 = new Hashcode(); 
//		Hashcode h2 = new Hashcode(); 
//		Hashcode h3 = h2; 
//		
//		System.out.println(h1.hashCode());
//		System.out.println(h2.hashCode());
//		System.out.println(h1.equals(h2));
	}
}
