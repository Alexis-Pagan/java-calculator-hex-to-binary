package convert;

/*
 * AUTHOR : ALEXIS.I
 * PROGRAM: HEXADECIMAL CONVERSION TO BINARY
 * PURPOSE: EDUCATIONAL 
 * DATE: 3 SEPTEMBER 2017
 * PLACE: PUERTO RICO, VEGA ALTA
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexToBinaryConversion {

	private static Pattern pattern;

	private static Matcher matcher;

	private static Scanner hex = new Scanner(System.in);

	public static void main(String[] args) {

		String hexNum = getUserInput(); // CALLING METHOD

		String[] convertedNumber = converter(hexNum); // CALLING METHOD

		System.out.println("\nBinary version of: " + hexNum + " equals: \n");
		for(int i=0; i<convertedNumber.length; i++) {
			
			System.out.println(i + ": " + convertedNumber[i]); // DISPLAY RESULT TO USER
		}
	}

	private static String getUserInput() {

		System.out.println("Enter Hex Number to Convert: \n");

		String hexdecimal = hex.next().toUpperCase(); // PROMPT USER TO ENTER HEXADECIMAL NUMBER

		pattern = Pattern.compile("^[a-zA-Z0-9]+$"); // REGEXP

		matcher = pattern.matcher(hexdecimal); // MATCH THE EXPRESSION

		try {
			if(!matcher.matches()) {
				throw new InvalidInputByUser("No valid data"); // VALIDATION FOR TESTING PURPOSES
			}
		}catch(InvalidInputByUser e) {
			throw new InvalidInputByUser("No valid data processed");

		}

		return hexdecimal;
	}

	private static String[] converter(String hexN) {

		String[] decN = new String[hexN.length()];
		String y = "";
		for(int n=0; n<decN.length; n++) {

			for(int z=0; z<hexN.length(); z++) {
				char x = hexN.charAt(z);
				y = String.valueOf(x); // Use Wrapper Class String to convert Char to String

				// THIS SECTION PROVIDES CONVERSION MECANISM
				
				if(y.equals("A")) {
					decN[z] = "1010";
				}

				if(y.equals("B")) {
					decN[z] = "1011";
				}

				if(y.equals("C")) {
					decN[z] = "1100";
				}

				if(y.equals("D")) {
					decN[z] = "1101";
				}

				if(y.equals("E")) {
					decN[z] = "1110";
				}

				if(y.equals("F")) {
					decN[z] = "1111";
				}
				
				if(y.equals("0")) {
					decN[n] = "0000";
				}

				if(y.equals("1")) {
					decN[z] = "0001";
				}

				if(y.equals("2")) {
					decN[z] = "0010";
				}

				if(y.equals("3")) {
					decN[z] = "0011";
				}

				if(y.equals("4")) {
					decN[z] = "0100";
				}

				if(y.equals("5")) {
					decN[z] = "0101";
				}

				if(y.equals("6")) {
					decN[z] = "0110";
				}

				if(y.equals("7")) {
					decN[z] = "0111";
				}

				if(y.equals("8")) {
					decN[z] = "1000";
				}

				if(y.equals("9")) {
					decN[z] = "1001";
				}
			}
			
			if(!y.matches("^[a-fA-F0-9]+$")) {
				System.out.println("Enter a hexadecimal from a to b and 0 to 9");
				break;
			}
		}
		
		return decN; // RETURN RESULTED ARRAY WITH BINARY NUMBERS
	}
}
