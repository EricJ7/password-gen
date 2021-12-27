import java.util.Scanner;
import java.util.Random;

public class passwordGen {

		Random rand = new Random(); 

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the password: ");
		int passLen = input.nextInt();
		System.out.println(passGeneration(passLen));
		
	}//main
	
	static char[] passGeneration(int passLen) {
		
		//every possible number value in base 10, every character, etc
		System.out.println(passLen + " character password: ");
		String characters = "abcdefghijklmnopqrstuvwxyz";
		String charsCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "123456790";
		String symbols = "!@#$%^&*?";
		
		String passSymbols = charsCap + characters + numbers + symbols;
		//random number called rand
		Random rand = new Random();
		
		//creates array of characters (passwords), with length specified by user 
		char[] password = new char[passLen];
		for(int index = 0; index < passLen; index++) {
			// adds random characters from passSymbols 
			password[index] = passSymbols.charAt(rand.nextInt(passSymbols.length()));
		}
		
		return password;

	}
}
