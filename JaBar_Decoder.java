import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class JaBar_Decoder {

	public static void main(String[] args) {
		//pre
		int decoding = 0;
		boolean cont = true;
		Scanner one = new Scanner(System.in);
		List<String> message = new ArrayList<>();
		int step1 = 0;
		
		//entry
		System.out.println("*********************************************");
		System.out.println("******entering JA-BAR decoding software******");
		System.out.println("**version 2, last changed thurs oct 15 2026**");
		System.out.println("*********************************************");
		
		//inputs
		
		
		
		System.out.println("Enter the encoded message");
		String encodedmsg = one.nextLine();
		
		System.out.println("Enter the first encrypter");
		int encrypter = one.nextInt();

		System.out.println("Enter the second encrypter");
		int s_encrypter = one.nextInt();
		
		//decode
		
		/**
		while (cont == true) {
			
		
			decrypt(decoding, encrypter, s_encrypter);
			System.out.println("Decrypt another number? y/n");
			String go = one.nextLine();
			
			if (go.equals("y")) {
				System.out.println("The full encoded message is " + encodedmsg);
					
			}	
			
			if (cont != true) {
				cont = false;
				
			}
		
		}
		**/
		
		//first one decoding 
		System.out.println("Enter the first encoded number");
		decoding = one.nextInt();
		
		step1 = ((decoding/encrypter)-s_encrypter);
		
		if (step1 == 3){
			message.add("A");
		}
		else if (step1 == 4) {
			message.add("B");
		}
		else if (step1 == 2) {
			message.add("C");
		}
		else if (step1 == 6) {
			message.add("D");
		}
		else if (step1 == -9) {
			message.add("E");
		}
		else if (step1 == 8) {
			message.add("F");
		}
		else if (step1 == 7) {
			message.add("G");
		}
		else if (step1 == 10) {
			message.add("H");
		}
		else if (step1 == 11) {
			message.add("I");
		}
		else if (step1 == 1) {
			message.add("J");
		}
		else if (step1 == 13) {
			message.add("K");
		}
		else if (step1 == 14) {
			message.add("L");
		}
		else if (step1 == 15) {
			message.add("M");
		}
		else if (step1 == 16) {
			message.add("N");
		}
		else if (step1 == 12) {
			message.add("O");
		}
		else if (step1 == 18) {
			message.add("P");
		}
		else if (step1 == -1) {
			message.add("Q");
		}
		else if (step1 == -5) {
			message.add("R");
		}
		else if (step1 == -3) {
			message.add("S");
		}
		else if (step1 == 22) {
			message.add("T");
		}
		else if (step1 == 23) {
			message.add("U");
		}
		else if (step1 == 24) {
			message.add("V");
		}
		else if (step1 == 29) {
			message.add("W");
		}
		else if (step1 == 26) {
			message.add("X");
		}
		else if (step1 == 27) {
			message.add("Y");
		}
		else if (step1 == 100) {
			message.add("Z");
		}
		
		//second one decoding
		while (cont=true) {
		System.out.println("Full encoded message is "+encodedmsg);
		System.out.println("Enter another number to keep decoding, or enter (2222) to decrypt");
		decoding = one.nextInt();
		
		if (decoding == (2222)) {
			cont=false;
			System.out.println("decrypting...");
			System.out.println(message);
			System.out.println("Thank you for using the JA-BAR decoder");
			break;
		}
		
		else {
		step1 = ((decoding/encrypter)-s_encrypter);
		
		if (step1 == 3){
			message.add("A");
		}
		else if (step1 == 4) {
			message.add("B");
		}
		else if (step1 == 2) {
			message.add("C");
		}
		else if (step1 == 6) {
			message.add("D");
		}
		else if (step1 == -9) {
			message.add("E");
		}
		else if (step1 == 8) {
			message.add("F");
		}
		else if (step1 == 7) {
			message.add("G");
		}
		else if (step1 == 10) {
			message.add("H");
		}
		else if (step1 == 11) {
			message.add("I");
		}
		else if (step1 == 1) {
			message.add("J");
		}
		else if (step1 == 13) {
			message.add("K");
		}
		else if (step1 == 14) {
			message.add("L");
		}
		else if (step1 == 15) {
			message.add("M");
		}
		else if (step1 == 16) {
			message.add("N");
		}
		else if (step1 == 12) {
			message.add("O");
		}
		else if (step1 == 18) {
			message.add("P");
		}
		else if (step1 == -1) {
			message.add("Q");
		}
		else if (step1 == -5) {
			message.add("R");
		}
		else if (step1 == -3) {
			message.add("S");
		}
		else if (step1 == 22) {
			message.add("T");
		}
		else if (step1 == 23) {
			message.add("U");
		}
		else if (step1 == 24) {
			message.add("V");
		}
		else if (step1 == 29) {
			message.add("W");
		}
		else if (step1 == 26) {
			message.add("X");
		}
		else if (step1 == 27) {
			message.add("Y");
		}
		else if (step1 == 100) {
			message.add("Z");
		}
		
		}
		}
	}
	
	public static void decrypt(int decoding, int encrypter, int s_encrypter) {
		//pre
		/**
		int step1 = 0;
		Scanner two = new Scanner(System.in);
		//main
		System.out.println("Enter the next encoded number");
		decoding = two.nextInt();
		step1 = ((decoding/encrypter)-s_encrypter);
		**/
		
	}
}
