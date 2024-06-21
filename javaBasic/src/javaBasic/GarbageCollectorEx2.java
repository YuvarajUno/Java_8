package javaBasic;

public class GarbageCollectorEx2 
{
	@Override
	protected void finalize()
	{
		System.out.println("I am GarbageCollector");
	}
	

	public static void main(String[] args) 
	{
		GarbageCollectorEx2 collect1 = new GarbageCollectorEx2();
		GarbageCollectorEx2 collect2 = new GarbageCollectorEx2();
		collect2 = collect1;
		System.out.println("Hello");
		System.gc();
		
		new GarbageCollectorEx2();
		System.gc();
		

	}

}
