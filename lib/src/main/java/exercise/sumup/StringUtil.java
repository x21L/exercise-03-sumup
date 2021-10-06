package exercise.sumup;

public class StringUtil {

	public static void main(String[] args) {
		String[] spam = Library.SPAM.split(" ");
		String[] noSpam = Library.NO_SPAM.split(" ");
		/*
		 * Your console dialog here
		 */
	}
	
	/**
	 * checks if a String is a palindrome.
	 * Some examples are: "Anna", "noon", "radar", "no lemon no melon", 
	 * "never odd or even", "Eva, can I see bees in a cave?"
	 * 
	 * @param input element to check for a palindrome
	 * @return true if it is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String input) {
		return false;
	}
	
	/**
	 * Checks if a password is strong and suitable for your website.
	 * 
	 * @param password to check
	 * @return true if is strong enough, false otherwise
	 */
	public static boolean isStrongPassword(String password) {
		return false;
	}
	
	
	/**
	 * Checks if the message is spam.
	 * 
	 * @param message to check. The message is split in a String array where one element is one word.
	 * An example of the array would be {this, is, a, message}.
	 * @return true if it is spam, false otherwise
	 */
	public static boolean isSpam(String[] message) {
		return false;
	}
}
