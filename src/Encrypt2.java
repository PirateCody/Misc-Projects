import java.util.Scanner;

/*
 * 1. Accept password
 * 2. Accept encrypt or decrypt
 * 3. Accept key - Will it be an int, char or string?
 * 4. Encrypt/Decrypt
 * 5. Print result
 * */

public class Encrypt2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			char[] password = getPassword();
			boolean encrypt = chooseEnOrDe();
			int key = getKey();
			
			if(encrypt == true)
				encrypt(password, key);
			else if (encrypt == false)
				decrypt(password, key);
			
			System.out.println(password);
			
		}
		
		

	
	public static boolean chooseEnOrDe(){
		System.out.print("Encrypt or Decrypt?: ");
		char enOrDe = input.nextLine().charAt(0);
		
		boolean encrypt = false;
		switch(enOrDe){
			case 'e': case 'E': encrypt = true; break;
			case 'd': case 'D': encrypt = false; break;
			default: System.out.print("Invalid Input!"); System.exit(0);
		}
		
		return encrypt;
		
	}
	
	public static int getKey(){
		System.out.print("Enter the key (1-25): ");
		int key = input.nextInt();
		
		if(key > 25){
			System.out.println("Key too large!"); 
			System.exit(0);
		}
		else if(key < 1){
			System.out.println("Key too small!"); 
			System.exit(0);
		}
		
		return key;
		
	}
	
	public static char[] getPassword(){
		System.out.print("Enter phrase: ");
		String toBeEncrypted = input.nextLine();
		char[] password = toBeEncrypted.toCharArray();
		return password;
	}
	
	public static char[] encrypt(char[] password, int key){
		
		for(int a = 0; a < password.length; a++){
	
			password[a] += key;
			
		}
		
		return password;
	}
	
	public static char[] decrypt(char[] password, int key){
		
		for(int a = 0; a < password.length; a++){
			
			password[a] -= key;
			
		}
		
		return password;
		
	}
	

}
