package abstractfact;

abstract class BankAccount {
	
	protected int id;
	protected float balance;
	abstract public float calculateIntrest();
	
	
	public BankAccount(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
}

class CurrentAccount extends BankAccount{
	
	public CurrentAccount(int id, float balance) {
		super(id, balance);
	}


	@Override
	public float calculateIntrest() {
		// TODO Auto-generated method stub
		return (balance * 0.07f);
	}
	
}

class SavingAccount extends BankAccount{
	
	
	
	public SavingAccount(int id, float balance) {
		super(id, balance);
	}

	@Override
	public float calculateIntrest() {
		// TODO Auto-generated method stub
		return (balance * 0.07f);
	}
	
}

class LoanAccount extends BankAccount {

	
	
	public LoanAccount(int id, float balance) {
		super(id, balance);
	}

	
	@Override
	public float calculateIntrest() {
		// TODO Auto-generated method stub
		return (balance * 0.07f);
	}
	
}

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Account\n");
		CurrentAccount currentAccount = new CurrentAccount(12, 1000);
		System.out.println(currentAccount.calculateIntrest());
		System.out.println("Saving Account\n");
		SavingAccount savingAccount = new SavingAccount(20, 10000);
		System.out.println(savingAccount.calculateIntrest());;
		System.out.println("Loan Account\n");
		LoanAccount loanAccount = new LoanAccount(10, 2000);
		System.out.println(loanAccount.calculateIntrest());

	}

}
