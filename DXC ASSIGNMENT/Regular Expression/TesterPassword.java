package DXC;

public class TesterPassword {
	
	
	public static boolean checkPasswordValidity(String password) {
		boolean flag = false;
		String regex = "^(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[@#$%]).{8,20}$";
		if (password.matches(regex)) {
		flag = true;

		}
		return flag;
		 }
		 public static void main(String[] args) {

		 //Change the value of password for testing your code with different passwords
		 String password = "PassW0rd";
		 System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" :"invalid!"));
		}
		}