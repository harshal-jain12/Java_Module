package module6;

public class TestAccount {

	public static void main(String[] args) {

		System.out.println("This is default constructor ");
		
		Account account = new Account();
		System.out.println("Account No " + account.getAccNo());
		System.out.println("Account Name " + account.getAccName());
		System.out.println("Account Balance  " + account.getAccBalance());
		System.out.println("This is default toString method" + account);
		

		System.out.println("===================================");
		System.out.println("This is paramitersized constructor");
		Account account1 = new Account(4561, "Shama Rama Yadav", 454611545);
		System.out.println("Account No " + account1.getAccNo());
		System.out.println("Account Name " + account1.getAccName());
		System.out.println("Account Balance  " + account1.getAccBalance());
		System.out.println("This is default toString method" + account1);

	}

}
