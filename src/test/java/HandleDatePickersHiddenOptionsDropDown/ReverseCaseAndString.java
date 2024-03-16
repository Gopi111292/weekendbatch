package HandleDatePickersHiddenOptionsDropDown;
public class ReverseCaseAndString {
    public static void main(String[] args) {
        String input = "Welcome to UST";
        String output = reverseCaseAndString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    private static String reverseCaseAndString(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (Character.isUpperCase(c)) {
                    reversedWord.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    reversedWord.append(Character.toUpperCase(c));
                } else {
                    reversedWord.append(c);
                }
            }

            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }
}
