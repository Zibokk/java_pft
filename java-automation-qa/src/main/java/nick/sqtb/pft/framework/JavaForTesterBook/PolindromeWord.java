package nick.sqtb.pft.framework.JavaForTesterBook;

import org.testng.annotations.Test;

public class PolindromeWord {


// Exercise:
// "Using your favorite programming language:" +
//        " Write a method that checks to see if a given word is a palindrome. Example palindromes: 'noon' and 'racecar'."

    // Wrong Solution First Try
//    public static void main(String[] args) {
//
//        String x = "noon";
//
//        if (x == "Nick") {
//            System.out.println("False");
//        } else if (x == "noon" || x == "racecar") {
//            System.out.println("True");
//        } else {
//            System.out.println("Error");
//        }
//
//    }


    @Test
    public static void main(String[] args) {
        System.out.println(testMain("noon"));

        //Reverse Integer the simple solution
//        int r = 0;
//        int n = 123;
//        while (n != 0) {
//            r = r * 10 + n % 10;
//            n /= 10;
//        }
//        System.out.println(r);

        //Reverse Integer using string method
//        System.out.println(getReverseInt(123));
//        int i = 45632;
//        System.out.println( Integer.parseInt(new StringBuffer(String.valueOf(i)).reverse().toString() ) );

        // Reverse String using reverse method
//        String n = "Nick";
//        System.out.println(new StringBuffer(String.valueOf(n)).reverse().toString());

        // Best solution for String reverse
        String n = "Nick Test";
        String reverse = new StringBuilder(n).reverse().toString();
        System.out.println(reverse);

        //Reverse String with Math logic
//        String n = "Nick";
//        int len = n.length() -1;
//
//        for (int i = 0; i <= len ; i++) {
//            int res = len - i;
//
//            System.out.print(n.charAt(res));
//
//        }

        // Reverse String by words
        String s = "Test Nick String S";

        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");

        for (int j = words.length-1; j >= 0; j--) {
            stringBuilder.append(words[j]).append(' ');
        }
        System.out.println("Reverse words: " + stringBuilder);

    }

//    public static int getReverseInt(int x) {
//        int resultNumber = 0;
//        int value = 459888;
//
//        for (int i = value; i != 0; i /= 10) {
//            resultNumber = resultNumber * 10 + i % 10;
//        }
//        return resultNumber;

//        int result = 0;
//
//        while (x != 0){
//            try {
//                result = Math.multiplyExact(result, 10);
//                result = Math.addExact(result, x % 10);
//                x /= 10;
//            } catch (ArithmeticException e) {
//                result = 0; // Exception handling
//                break;
//            }
//        }
//
//        return result;

//    }

    // Not bad solution 2nd try
//    public static boolean testMain(String s) {
//
//        int head = 0;
//        int tail = s.length() - 1;
//
//        while (head < tail) {
//            if (s.charAt(head) != s.charAt(tail)) {
////                System.out.println("False");
//                return false;
//            }
//            head++;
//            tail--;
//        }
////        System.out.println("True");
//        return true;
//    }


    // Great Solution 3rd try

    public static boolean testMain(String s) {

        int len = s.length();
        for (int i = 0; i < len / 2 ; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
