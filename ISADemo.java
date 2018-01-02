class Account{
	int id;
	String name;
	double balance;
void deposit(){
	System.out.println("Show Pan Card >50K Transaction");	
	}
	
	void roi() {
		System.out.println("2% Generic...");
	}
}
class SavingAccount extends Account{
 // Save 
	void withDraw() {
		System.out.println("50K Per Day Limit...");	
		}
	@Override
	void roi() {
		super.roi();
		System.out.println("ROI is 4% Rec...");
	}
}

class CurrentAccount extends Account{
	void withDraw() {
		System.out.println("No  Limit...");	
		}
	void odLimit() {
		System.out.println("OverDraft ...");
	}
	@Override
	void roi() {
		super.roi();
		System.out.println("ROI MUST BE PAY 6%");
	}
}

class AccountCaller{
	void caller(Account ac) {
		ac.deposit();
		ac.roi();
		System.out.println("*********************");
		if(ac instanceof SavingAccount) {
			/*SavingAccount sa = (SavingAccount) ac; //Downcasting
			sa.withDraw();
			sa.roi();*/
			((SavingAccount)ac).withDraw();
//			((SavingAccount)ac).roi();
		}
		else
		if(ac instanceof CurrentAccount) {
			CurrentAccount ca = (CurrentAccount) ac; //Downcasting
			ca.withDraw();
//			ca.roi();
			ca.odLimit();
		}
	}
}

public class ISADemo {

	public static void main(String[] args) {
		AccountCaller accountCaller = new AccountCaller();
		accountCaller.caller(new SavingAccount());  //Upcasting
		accountCaller.caller(new CurrentAccount());
		//SavingAccount sa = new Account();
		/*Account ac = new SavingAccount();  //Upcasting
		ac.roi();
		ac.deposit();
		*/
		//ac.withDraw();
		//int x = 100.20;
		//SavingAccount sa = new SavingAccount();
		// Type refVar = new Type();
		
		
		// TODO Auto-generated method stub
		/*SavingAccount sa = new SavingAccount();
		sa.withDraw();
		sa.deposit();
		sa.roi();
		System.out.println("******************************");
		CurrentAccount ca = new CurrentAccount();
		ca.withDraw();
		ca.deposit();
		ca.roi();
		ca.odLimit();
	*/
	}

}
