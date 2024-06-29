package exception_handling_user_authentication_exercise;

import java.util.Scanner;

public class UserAuthenticator {

	static void authenticator(String un, String pw) throws UserAuthenticatorException {
		String username = "Fadi";
		String password = "PassWord";

		if (un.equals(username) && pw.equals(password)) {

			System.out.println("User name and Password are correct.");
			;
		} else {
			throw new UserAuthenticatorException("Invalid username or password.");
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter user name : ");

			String un = scanner.nextLine();

			System.out.println("Enter password : ");
			String pw = scanner.nextLine();

			authenticator(un, pw);
		} catch (UserAuthenticatorException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {

			scanner.close();
		}
	}

}
