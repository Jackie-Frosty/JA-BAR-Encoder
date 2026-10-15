import java.util.Scanner;
public class JaBar_Encoder {

	public static void main(String[] args) {
		//pre
		String unencrypted = "something has gone wrong";
		char chara = 'j';
		boolean en1v=false;
		boolean en2v=false;
		int encrypter = 1;
		int s_encrypter = 2;
		int charnum = 0;
		
		//entry
		System.out.println("*******************************************");
		System.out.println("*****entering JA-BAR encoding software*****");
		System.out.println("**version 1, last changed tues oct 13 2026*");
		System.out.println("*******************************************");
		
		//inputs
		
		//to encode
		/**
		boolean validEn = false;
		while (validEn == false){
			System.out.println("What message would you like to encode?");
			
			unencrypted = one.nextLine();
			
			if (unencrypted.length() >30) {
				System.out.println("Message must be 30 or less characters");
			}
			else if (unencrypted.length()<=30) {
				validEn=true;
		**/	
				
			
		System.out.println("What message would you like to encode?");
		Scanner one = new Scanner(System.in);
		unencrypted = one.nextLine();
	
		
		
		//encrypters
		Scanner two = new Scanner(System.in); //theres two deal with it
		
		while (en1v==false) {
			System.out.println("Enter your encrypter, must be an integer and cannot be zero");
			encrypter = two.nextInt();
			if (encrypter != 0) {
				en1v=true;
			}
			else {
				System.out.println("Encrypter 1 cannot equal zero and cannot be a decimal");
			}
			System.out.println("");
		}
		/**
		while (en2v==false) {
			System.out.println("Enter your second encrypter, must be an integer");
			s_encrypter = two.nextInt();
			if (s_encrypter > -6 && s_encrypter < 4) {
				en2v=true;
			}
			else {
				System.out.println("Encrypter 2 must be between -5 and 3");
			}
		}
		
		**/
		
		System.out.println("Enter your second encrypter, must be an integer");
		s_encrypter = two.nextInt();
		
		
		//preparing
		int unenLength=(unencrypted.length());
		String unencryptedL=(unencrypted.toLowerCase());
		unencryptedL=(unencryptedL.trim());
		
		//output
		while (charnum<unencryptedL.length()) {
			chara=unencryptedL.charAt(charnum);
			encrypt(chara, encrypter, s_encrypter);
			charnum++;
		}
		
		
		
		//testing
		/**
		System.out.println(unencrypted+" encrypter is "+encrypter + ", encrypter 2 is" + s_encrypter);
		
		System.out.println(unencryptedL);
		System.out.println(chara);
		**/

	}
	
	public static void encrypt(char chara, int encrypter, int s_encrypter) {
		if(chara == 'a') {
			System.out.print((3+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'b') {
			System.out.print((4+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'c') {
			System.out.print((2+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'd') {
			System.out.print((6+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'e') {
			System.out.print((-9+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'f') {
			System.out.print((8+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'g') {
			System.out.print((7+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'h') {
			System.out.print((10+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'i') {
			System.out.print((11+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'j') {
			System.out.print((1+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'k') {
			System.out.print((13+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'l') {
			System.out.print((14+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'm') {
			System.out.print((15+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'n') {
			System.out.print((16+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'o') {
			System.out.print((12+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'p') {
			System.out.print((18+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'q') {
			System.out.print((-1+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'r') {
			System.out.print((-5+s_encrypter)*encrypter+" ");
		}
		else if(chara == 's') {
			System.out.print((-3+s_encrypter)*encrypter+" ");
		}
		else if(chara == 't') {
			System.out.print((22+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'u') {
			System.out.print((23+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'v') {
			System.out.print((24+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'w') {
			System.out.print((29+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'x') {
			System.out.print((26+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'y') {
			System.out.print((27+s_encrypter)*encrypter+" ");
		}
		else if(chara == 'z') {
			System.out.print((100+s_encrypter)*encrypter+" ");
		}
		else if(chara == ' ') {
			System.out.print("  ");
		}

		else {
			System.out.print("");
		}
	}
		
}
