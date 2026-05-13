class StringNotPalindromeException extends Exception {

    StringNotPalindromeException(String msg) {
        super(msg);
    }
}

class StringCannotBeEmpty extends Exception {

    StringCannotBeEmpty(String msg) {
        super(msg);
    }
}

public class PalindromeCheck {

    public static void main(String args[]) {

        try {

            // Check if string is empty
            if (args.length == 0 || args[0].isEmpty()) {
                throw new StringCannotBeEmpty(
                        "String cannot be empty");
            }

            String str = args[0];
            String rev = "";

            // Reverse the string
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            // Check palindrome
            if (str.equals(rev)) {

                System.out.println("String is Palindrome");
                System.out.println("Length = " + str.length());

            } else {

                throw new StringNotPalindromeException(
                        "String is Not Palindrome");
            }

        }

        catch (StringCannotBeEmpty e) {
            System.out.println(e.getMessage());
        }

        catch (StringNotPalindromeException e) {
            System.out.println(e.getMessage());
        }
    }
}
