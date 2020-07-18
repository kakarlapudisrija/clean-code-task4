package task4.com.main.java.simple_compound_interest;

public class Compound_interest {
	public static double compound_Interest(double amount,double rate,double time)
	{
		return amount*Math.pow((1+rate/100.0),time)-amount;
	}

}
