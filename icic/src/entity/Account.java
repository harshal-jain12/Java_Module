package entity;
						
public class Account { //pojo
	
	private double balance;
	private int accNO;
	private String accHolderName;
	
	public Account() {
		balance = 0.0;
		accNO = 0;
		accHolderName = null;
		
	}
	
	
	public Account(double balance, int accNO, String accHolderName) {
		super();
		this.balance = balance;
		this.accNO = accNO;
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accNO=" + accNO + ", accHolderName=" + accHolderName + "]";
	}
	

}
