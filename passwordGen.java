import java.util.Scanner;
import java.util.Random;

public class passwordGen {

	
		Random rand = new Random(); 
			
		//random int from 0 - 52 (characters)
		//private int randInt = rand.nextInt(52);
			
		//random int from 0 - 7 (symbols)
		//private int randIntSym = rand.nextInt(7);
			
		//random int from 0 - 8 (numbers)
		//private int randIntNum = rand.nextInt(8);
			
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the password: ");
		int passLen  = input.nextInt();
		System.out.println(passGeneration(passLen));
		
	}//main
	
	//returns password of type char
	static char[] passGeneration(int passLen) {
		
		//every possible number value in base 10, every character, etc
		System.out.println(pLen + " character password: ");
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
