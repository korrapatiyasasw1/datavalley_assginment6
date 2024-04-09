public class VowelCount {

    public static void main(String[] args) {
        String str = "Enter a string here"; // Replace with user input if needed

        int vowelCount = 0;
        boolean hasVowel = false;

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check for lowercase vowels
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
                hasVowel = true;
            }

            // Check for uppercase vowels (optional)
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelCount++;
                hasVowel = true;
            }
        }

        // Display results
        if (hasVowel) {
            System.out.println("The string contains " + vowelCount + " vowels.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }
    }
}