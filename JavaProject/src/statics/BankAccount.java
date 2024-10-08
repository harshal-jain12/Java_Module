package statics;

public class BankAccount {
	
	private int accNo;
	private double balance;
	private static int idNum = 0;
	
	public BankAccount() {
		accNo = idNum++;
		balance = 0;
	}

	public BankAccount(int accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}

	public static int getIdNum() {
		return idNum;
	}
		
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		
		BankAccount bankAccount1 = new BankAccount();
		System.out.println(bankAccount1.getIdNum());
		

		BankAccount bankAccount2 = new BankAccount();
		System.out.println(bankAccount2);
		

		BankAccount bankAccount3 = new BankAccount(23, 6000);
		System.out.println(bankAccount3);
		
	}

}
