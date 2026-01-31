package session15;

class Bank {
	
	double getRateofInterest()
	{
		return 0.0;
	}
}

class Axis extends Bank {
	
	double getRateofInterest()
	{
		//change body only, Note parent method
		return 5.0;
	}
}

class ICICI extends Bank {
	
	double getRateofInterest() //method overridden : method definition is same as parent class
	{
		//change body only, Note parent method
		return 6.0;
	}
}

class HDFC extends Bank {
	
	double getRateofInterest() //method overridden : method definition is same as parent class
	{
		//change body only, Note parent method
		return 7.0;
	}
}

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank objBank = new Bank();
		System.out.println("Parent bank rate of interest : " + objBank.getRateofInterest());
		
		Axis objAxis = new Axis();
		System.out.println("Axis bank rate of interest: " + objAxis.getRateofInterest());
		
		ICICI objICICI = new ICICI();
		System.out.println("ICICI bank  rate of interest:  " + objICICI.getRateofInterest());
		
		HDFC objHDFC = new HDFC();
		double ratofInterest = objHDFC.getRateofInterest();
		System.out.println("HDFC bank  rate of interest:  " + ratofInterest);	

	}

}
