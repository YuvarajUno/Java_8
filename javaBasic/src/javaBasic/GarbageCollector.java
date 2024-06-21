package javaBasic;

public class GarbageCollector {
	public void finalize()
	{
		System.out.println("This is GarbageCollector");
	}

	public static void main(String[] args) 
	{
		
		GarbageCollector collect = new GarbageCollector();
		collect = null;
		System.out.println("hello");
		System.gc();
		

	}

}
