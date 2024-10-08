package userinterface;

import entity.Account;
import operation.AccountOperation;
import java.util.Scanner;
import validation.AccountValidation;


public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account1 = new Account();
		Account account2 = new Account();
		
		AccountOperation accountOperation = new AccountOperation();
		AccountValidation accountValidation = new AccountValidation();
		Account account = new Account();
		int ch;
		String choise;
		

		do {
			System.out.println("============Welcome to ICIC Bank===============");
			System.out.println("1. Accept Details");
			System.out.println("2. Display Details ");
			System.out.println("3. Withraw Amount");
			System.out.println("4. Deposit Amount");
			System.out.println("5. Transfer Amount ");
			System.out.println("6. Check Balance ");
			System.out.println("7. Update Balance ");
			System.out.println("8. Exit ");

			System.out.println("\nEnter your Choise:  ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Accept Details ");
				System.out.println("Enter accNO, holder name, Balance ");
				int accNO = sc.nextInt();
				String accHolderName = sc.next();
				double balance = sc.nextDouble();
				//validatin the i/ps
				
				boolean result2 = accountValidation.checkAll(accNO, accHolderName, balance);
				if(result2 == true) {
					System.out.println("All inputs valid");
					
					account1.setAccNO(accNO);
					account1.setAccHolderName(accHolderName);
					account1.setBalance(balance);
				}else {
					System.out.println("invalid inputs______________");
				}
				
				break;
				
			case 2:
				System.out.println("Display Detials");
				System.out.println("Account Number is " +account1.getAccNO());
				System.out.println("Account Holder Name is " +account1.getAccHolderName());
				System.out.println("Account Balance is " +account1.getBalance());
				break;
				
			case 3:
				System.out.println("Withdraw Amount ");
				System.out.println("Please Enter some amount");
				double amount = sc.nextDouble();
				boolean result = accountOperation.withdraw(account1, amount);
				if(result == true) {
					System.out.println("Withdraw is successful");
					System.out.println("the new balance is " + account1.getBalance());
				}
				else {
					System.out.println("Withdraw is failed");
					System.out.println("Don't give amount in negative");
				}
				break;
				
			case 4:
				System.out.println("Deposit Amount");
				System.out.println("Please Enter Amount for Deposti ");
				amount = sc.nextDouble();
				result = accountOperation.deposit(account1, amount);
				if(result == true) {
					System.out.println("Deposit is successful");
					System.out.println("the new balance is " + account1.getBalance());
				}
				else {
					System.out.println("Deposit is failed");
					System.out.println("Don't give amount in negative");
				}
				break;
				
			case 5:
				System.out.println("Transfer Money");
				
				System.out.println("Accept Details ");
				System.out.println("Enter accNO, holder name, Balance ");
				accNO = sc.nextInt();
				accHolderName = sc.next();
				balance = sc.nextDouble();
				//validatin the i/ps
				
				result2 = accountValidation.checkAll(accNO, accHolderName, balance);
				if(result2 == true) {
					System.out.println("All inputs valid");
					
					account2.setAccNO(accNO);
					account2.setAccHolderName(accHolderName);
					account2.setBalance(balance);
				}else {
					System.out.println("invalid inputs______________");
				}
				
				
				System.out.println("---------------------");
				System.out.println("Please Enter the Amount for transfer ");
				System.out.println("Enter transfer amount: ");
				amount = sc.nextDouble();
				System.out.println("the old balance of Account 1 " + account1.getBalance());
				System.out.println("the old balance of Account 2 " + account2.getBalance());
				result = accountOperation.transfer(account1, account2, amount);
				
				if(result == true) {
					System.out.println("Transfer  is successful");
					System.out.println("the new balance Account 1 " + account1.getBalance());
					System.out.println("the new balance Account 2 " + account2.getBalance());
				}
				else {
					System.out.println("Transfer is failed");
				}
				break;
				
			case 6:
				System.out.println("Check Balance");
//				System.out.println("Please Enter your account no : (it be 1 or 2 )" );
//				int no = sc.nextInt();
					System.out.println("Balance is = " + account1.getBalance());
				
				break;
			case 7:
				System.out.println("Update Blance ");
				System.out.println("Enter the new balance");
				balance = sc.nextDouble();
				account1.setBalance(balance);
				System.out.println("Set value is " + account1.getBalance());
				System.out.println(account1);
				break;
			case 0:
				System.out.println("Thank you for Visting: ");
				System.exit(0);

			}
			System.out.println("Do you want to continue? (Y/N)");
			choise = sc.next();
			
		} while (choise.equalsIgnoreCase("Y"));
		sc.close();
		System.out.println("Thank you for Visting: ");

	}

}
