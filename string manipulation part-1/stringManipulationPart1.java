import java.util.Scanner;
public class stringManipulationPart1{
	
	//Method to reverse a string
	public static String reverse(String value) {
		String reversed = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			reversed += value.charAt(i);
		}
		return reversed;
	}
	
	//Method to slice a string
	public static String slice(String value, int start, int end) {
		String sliced = "";
		for (int i = start; i < end; i++) {
			sliced += value.charAt(i);
		}
		return sliced;
	}
	
	//Method to find index of the char
	public static int indexOf(String value, char find) {
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == find) {
				return i;
			}
		}
		return -1;
	}
	
	//Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt the user for input
		System.out.print("Enter a string: ");
		String inputString = input.nextLine();
		
		System.out.print("Enter the start index for slicing: ");
		int start = input.nextInt();
		
		System.out.print("Enter the end index for slicing: ");
		int end = input.nextInt();
		
		System.out.print("Enter a character to find: ");
		char findChar = input.next().charAt(0);
		
		System.out.println();
		
		//use the methode and display results
		String reversed = reverse(inputString);
		System.out.println("Reversed String: " + reversed);
		
		String sliced = slice(inputString, start, end);
		System.out.println("Sliced String: " + sliced);
		
		int index = indexOf(inputString, findChar);
		System.out.println("Index of '" + findChar + "':" +index);
		
		input.close ();
	}
}
