import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        // create a Scanner object to read input from the user
        Scanner myObj = new Scanner(System.in);

        // use a while loop to keep reading input from the user
        while (myObj.hasNext()) {
            String IP = myObj.next();
            // print whether the given IP matches the pattern defined in MyRegex class
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

    // define a separate method to check if the given IP address is valid or not
    public static boolean ifIpValid(String userIP) {
        String[] numbersString = userIP.split("\\.");
        int[] numbersInt = new int[numbersString.length];
        // loop through each segment of the IP address
        for (int i = 0; i < numbersString.length; i++) {
            try {
                // convert each segment to integer and check if it's within valid range
                numbersInt[i] = Integer.parseInt(numbersString[i]);
                if (numbersInt[i] < 0 || numbersInt[i] > 255)
                    return false;
            } catch (NumberFormatException e) {
                // if any segment is not a valid integer, return false
                return false;
            }
        }
        // if there are not exactly 4 segments in the IP address, return false
        if (numbersInt.length != 4) {
            return false;
        }
        // otherwise, return true
        return true;
    }
}

// define a separate class to encapsulate the regular expression pattern for IP addresses
class MyRegex {
    String pattern;

    // constructor to initialize the pattern string with a regular expression
    public MyRegex() {
        pattern = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    }

    // method to check if a given string matches the pattern defined in the constructor
    public boolean isIpCorrect(String s) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        return m.matches();
    }
}
