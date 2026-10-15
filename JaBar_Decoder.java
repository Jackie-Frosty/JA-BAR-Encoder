import java.util.Scanner;
public class JaBar_Decoder {

	public static void main(String[] args) {
		//pre
		int decoding = 0;
		boolean cont = true;
		
		//entry
		System.out.println("*******************************************");
		System.out.println("*****entering JA-BAR decoding software*****");
		System.out.println("**version 1, last changed tues oct 13 2026*");
		System.out.println("*******************************************");
		
		//inputs
		
		Scanner one = new Scanner(System.in);
		
		System.out.println("Enter the encoded message");
		String encodedmsg = one.nextLine();
		
		System.out.println("Enter the first encrypter");
		int encrypter = one.nextInt();

		System.out.println("Enter the second encrypter");
		int s_encrypter = one.nextInt();
		
		//decode
		Scanner three = new Scanner(System.in);
		while (cont == true) {
			
		
			decrypt(decoding, encrypter, s_encrypter);
			System.out.println("Decrypt another number? y/n");
			String go = three.nextLine();
			
			if (go.equals("y")) {
				System.out.println("The full encoded message is " + encodedmsg);
					
			}	
			
			if (cont != true) {
				cont = false;
				
			}
		}
	}
	public static void decrypt(int decoding, int encrypter, int s_encrypter) {
		//pre
		int step1 = 0;
		Scanner two = new Scanner(System.in);
		//main
		System.out.println("Enter the next encoded number");
		decoding = two.nextInt();
		step1 = ((decoding/encrypter)-s_encrypter);
		
		if (step1 == 3){
			System.out.println("The number decodes to A");
		}
		else if (step1 == 4) {
			System.out.println("The number decodes to B");
		}
		else if (step1 == 2) {
			System.out.println("The number decodes to C");
		}
		else if (step1 == 6) {
			System.out.println("The number decodes to D");
		}
		else if (step1 == -9) {
			System.out.println("The number decodes to E");
		}
		else if (step1 == 8) {
			System.out.println("The number decodes to F");
		}
		else if (step1 == 7) {
			System.out.println("The number decodes to G");
		}
		else if (step1 == 10) {
			System.out.println("The number decodes to H");
		}
		else if (step1 == 11) {
			System.out.println("The number decodes to I");
		}
		else if (step1 == 1) {
			System.out.println("The number decodes to J");
		}
		else if (step1 == 13) {
			System.out.println("The number decodes to K");
		}
		else if (step1 == 14) {
			System.out.println("The number decodes to L");
		}
		else if (step1 == 15) {
			System.out.println("The number decodes to M");
		}
		else if (step1 == 16) {
			System.out.println("The number decodes to N");
		}
		else if (step1 == 12) {
			System.out.println("The number decodes to O");
		}
		else if (step1 == 18) {
			System.out.println("The number decodes to P");
		}
		else if (step1 == -1) {
			System.out.println("The number decodes to Q");
		}
		else if (step1 == -5) {
			System.out.println("The number decodes to R");
		}
		else if (step1 == -3) {
			System.out.println("The number decodes to S");
		}
		else if (step1 == 22) {
			System.out.println("The number decodes to T");
		}
		else if (step1 == 23) {
			System.out.println("The number decodes to U");
		}
		else if (step1 == 24) {
			System.out.println("The number decodes to V");
		}
		else if (step1 == 29) {
			System.out.println("The number decodes to W");
		}
		else if (step1 == 26) {
			System.out.println("The number decodes to X");
		}
		else if (step1 == 27) {
			System.out.println("The number decodes to Y");
		}
		else if (step1 == 100) {
			System.out.println("The number decodes to Z");
		}
	}
}
