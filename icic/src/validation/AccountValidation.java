package validation;

public class AccountValidation {

	public boolean checkAccNo(int accNO) {
		if (accNO < 0) {
			System.out.println("Invalid accunt number");
			return false;
		} else {
			return true;

		}
	}

	public boolean checkBalance(double balance) {
		if (balance <= 0) {
			System.out.println("Valid Balance");
			return false;
		} else if (balance > 10000) {
			System.out.println("Please show the proof");
			return false;
		} else {
			return true;
		}
	}
	
	public boolean checkAccHolderName(String accHolderName) {
		//priti 123 -- ascii A-Z 65-90 a - z, 97 - 122
		
		boolean valid = false;
		char ch;
		
		for(int i = 0; i < accHolderName.length(); i++) {
			ch = accHolderName.charAt(i);//return the ch
			if((ch >= 65 && ch <= 90) || (ch>=97 && ch <= 122)) {
				valid = true;
			}
			else {
				valid = false;
			}
			
		}
		if(valid == true) {
			System.out.println("Valid Name");
			return true;
		}
		else {
			System.out.println("Name is invalid");
			return false;
		}
		
	}
	
	public boolean checkAll(int accNO, String accHolderName, double balance) {
		if(!checkAccNo(accNO))
			return false;
		else if(!checkAccHolderName(accHolderName))
			return false;
		else if(!checkBalance(balance))
			return false;
		else
			return true;
		
	}

}
