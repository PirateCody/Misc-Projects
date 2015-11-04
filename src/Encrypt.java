import java.util.Scanner;


public class Encrypt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Gets the password
		System.out.print("Enter password: ");
		String password = input.nextLine();
		
		char[] letters = new char[password.length()];
		
		letters = password.toCharArray();
		
		encrypt(letters);
		
		print(letters);

		input.close();
		
	}
	
	//"password" used in the following methods != password that was input above
	public static char[] encrypt(char[] password){
		
		for(int a = 0; a < password.length; a++){
			
			if(a % 2 < 1)
			password[a] += 5;
			else if(a % 3 < 1)
			password[a] -= 4;
			else
			password[a] += 3;
			
		}
		
		return password;
		
	}
	
	public static char[] decrypt(char[] password){
		
		for(int a = 0; a < password.length; a++){
			
			if(a % 2 < 1)
			password[a] -= 5;
			else if(a % 3 < 1)
			password[a] += 4;
			else
			password[a] -= 3;
			
		}
		
		return password;
		
	}
	
	public static void print(char[] password){
		System.out.println(password);
	}
		
}


