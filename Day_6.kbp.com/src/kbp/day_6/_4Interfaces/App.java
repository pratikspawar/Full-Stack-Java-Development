package kbp.day_6._4Interfaces;

public class App {
	public static void main(String[] args) {
		Criket ck =new Criket();
		FootBall fb=new FootBall();
		
		System.out.println(ck.getPractice());
		System.out.println(ck.getSalary());
		System.out.println(ck.getworkout());
		System.out.println(ck.getSalaryGrowth()+"\n\n");
		
		System.out.println(fb.getPractice());
		System.out.println(fb.getworkout());
		System.out.println(fb.getSalary());
		System.out.println(fb.getSalaryGrowth());
		
	}
}
/*
 interfaces:
 -used For 100% abstraction
 -use "Implenment " keyword for child class to implemt abstracat method Body
 -use "extends" Keyword for make interface inheritance
 */