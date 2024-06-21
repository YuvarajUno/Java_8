package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunInterface1 
{

	public static void main(String[] args) 
	{
		Function<String,Integer> fn1 = (a)->
		{
			return a.length();
		};
		
		
		
		BiFunction<String,String,Integer> fn2 = (a,b)->
		{
			return a.length()+b.length();
		};
		System.out.println(fn1.apply("yuvaraj"));
		System.out.println(fn2.apply("yuvaraj","Rengaraj"));
		
		
		Function<String,String> fn3 = (a)->
		{
			System.out.println("Yuvaraj");
			return "";
		};
		
		Function<String,String> fn4 = (a)->
		{
			System.out.println("Rengaraj");
			return "";
		};
		
		System.out.println(fn3.compose(fn4).apply("yuvaraj"));

	}

}
