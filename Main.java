import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class Main {
//    public static void main(String[] args) {
//
////IP address is a string in the form "A.B.C.D", +
//// where the value of A, B, C, and D may range from 0 to 255.
//// Leading zeros are allowed.
//// The length of A, B, C, or D can't be greater than 3.
//
////        String[] ipHackerRank = {"000.12.12.034", "121.234.12.12", "23.45.12.56", "00.12.123.123123.123", "122.23", "Hello.IP"};
////        for(String ip : ipHackerRank){
////            System.out.println(ifIPIsCorrectMethod(ip));
////        }
//        String s= "122.23";
//       Pattern p = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
//        Matcher m = p.matcher(s);
//        System.out.println(m.matches());
//    }


class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
    public static boolean ifIPIsCorrectMethod(String userIP){
        String[] numbersString = userIP.split("\\.");
        int[] numbersInt = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            try{
                numbersInt[i] = Integer.parseInt(numbersString[i]);
                if(numbersInt[i]<0 || numbersInt[i]>255)
                    return false;
            }
            catch (NumberFormatException e){
                return false;
            }
        }
        if(numbersInt.length!=4){
            return false;
        }
        return true;
    }
}
    class MyRegex {
        String pattern;

        public MyRegex() {
            pattern = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        }

        public boolean isIpCorrect(String s) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(s);
            return m.matches();
        }
    }


