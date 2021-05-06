package lamba_eg;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction{
	public String run(String str);
}

@FunctionalInterface
interface Drawable
{
	public void draw(int w);
}

public class Lambda_User {
	public static void main(String[] args)
	{
		/*ArrayList <Integer> numbers=new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(12);
		numbers.add(8);
		numbers.add(7);
//		numbers.forEach((x) -> {System.out.println(x);});
		Consumer<Integer> method = (n) -> {System.out.println(n);};
		numbers.forEach(method);*/
		
		/*StringFunction exclaim =(s)->s+"!";
		StringFunction ask =(s)->s+"?";
		
		stringFormated("Hello", exclaim);
		stringFormated("Why", ask);*/
		
		int width = 10;
		/*Drawable dr = new Drawable() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("Drawing:" + width);
			}
		};*/
		
		Drawable dr = (w)-> {System.out.println("Drawing:" + w);};
		
		dr.draw(width);
	}
	public static void stringFormated(String s, StringFunction format)
	{
		System.out.println(format.run(s));
	}
}
