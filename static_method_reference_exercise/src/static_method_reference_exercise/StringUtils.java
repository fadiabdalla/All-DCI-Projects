package static_method_reference_exercise;

public class StringUtils {
	

	static boolean isPalindrome(String s) {
		// Initializing an empty string to store the reverse
        // of the original s
        String rev = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (s.equalsIgnoreCase(rev)) {
            ans = true;
        }
        return ans;
    
	}

}
