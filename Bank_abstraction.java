package OOps_Abstraction;

abstract class RBI 
{
	abstract void rules();
	abstract void lunchtime();
	abstract void Punchin();
	abstract void Punchout();
	void holiday()
	{
		System.out.println("Every sunday have a holiday");
	}
}


class SBI extends RBI
{

	void rules()
	{
		System.out.println("Banking rules ");
	}

	
	void lunchtime() 
	{
		System.out.println("When cround increasing ");
	}

	
	void Punchin() 
	{
		System.out.println("at 09.00");
	}

	void Punchout() 
	{
		System.out.println("At 04.00");
	}
	
}


class BOM extends RBI
{

	void rules()
	{
		System.out.println("Banking rules ");
	}

	
	void lunchtime() 
	{
		System.out.println("When cround increasing ");
	}

	
	void Punchin() 
	{
		System.out.println("at 09.00");
	}

	void Punchout() 
	{
		System.out.println("At 04.00");
	}
	
}

class UNION extends RBI
{

	void rules()
	{
		System.out.println("Banking rules ");
	}

	
	void lunchtime() 
	{
		System.out.println("When cround increasing ");
	}

	
	void Punchin() 
	{
		System.out.println("at 09.00");
	}

	void Punchout() 
	{
		System.out.println("At 04.00");
	}
	
}

public class Bank
{

	public static void main(String[] args) 
	{

		SBI b= new SBI();
		b.Punchin();
		b.Punchout();
		b.lunchtime();
		b.rules();
		b.holiday();
		
		BOM m = new BOM();
		m.Punchin();
		m.Punchout();
		m.lunchtime();
		m.rules();
		m.holiday();
		
		UNION u= new UNION();
		u.Punchin();
		u.Punchout();
		u.lunchtime();
		u.rules();
		u.holiday();
		
	}

}
