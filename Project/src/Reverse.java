//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Reverse {
        public static void main(String[] args) {
            String originalString = "Hello, Java!";

            // Create a StringBuilder object with the original string
            StringBuilder stringBuilder = new StringBuilder(originalString);

            // Use the reverse() method to reverse the characters
            stringBuilder.reverse();

            // Convert the reversed StringBuilder back to a String
            String reversedString = stringBuilder.toString();

            System.out.println("Original String: " + originalString);
            System.out.println("Reversed String: " + reversedString);
        }
    }

