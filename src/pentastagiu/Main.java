package pentastagiu;

import java.util.Arrays;

public class Main {
    public static void main(String[] argv) {
        int numBegin = 2;
        int numEnd = 100;
        int fibonaci = 20;
        System.out.println("for an input number " + numEnd + ", result is " + calculatedSum(numEnd));
        calculatedAvg(numBegin, numEnd);
        sumOfFibonaci(20);
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("The first and the last element of an int array are the same " + isSameFirstlastElementOfArray(arr1));
        System.out.println("Arrays are equal " + isEqualTwoArrays(arr1, arr2));
        int[] arr = concatenateTowArrays(arr1, arr2);
        System.out.println("A new array containing is ");
        System.out.print("[");
        for (int val : arr) {
            System.out.print(val + ", ");
        }
        System.out.println("]");
        minMaxAvgArrays(new int[]{13, 20, 14, 5, 2, 8});
        System.out.println(String.format("the index of a target element %d",indexOf(new int[]{13, 20, 14, 5, 2, 8}, 5)));
        calculatedEvenAndOdd(new int[]{13, 20, 14, 5, 2, 8});
        String base = "Hello java world";
        String target = "java";
        System.out.println(String.format("base String \"%s\" %s contains  the target test String \"%s\"", base, (isContained(base, target)?"":"not"), target));
        char ch = 'a';
        System.out.println(String.format("a character \'%c\' appears in a String \"%s\" %d time(s)", ch, base, countTargenChar(base, ch)));
        target = "orld";
        System.out.println(String.format("a string \"%s\" ends with another string \"%s\" ",base, target) + isContainedToEnds(base, target));
        System.out.println(String.format("the following alphabet encoding from Stirng \" %s\" is \"%s\"", base, alphabetIndex(base)));
        System.out.println(String.format("the following string \"%s\" the output is %s", base, duplicateLatters(base, '#')));
        String polindrom = "aerisirea";
        System.out.println(("Given the following string \"" + polindrom + "\" is " + (isPolindrome(polindrom) ? "" : "not ") + "a polindrome"));
    }

    private static boolean isPolindrome(String base) {
        int count = base.length() / 2;
        int len = base.length() - 1;
        for (int i = 0; i <= count; i++) {
            if (base.charAt(i) != base.charAt(len - i))
                return false;
        }
        return true;
    }

    private static String duplicateLatters(String base, char symb) {
        char ch = 0;
        StringBuilder sb = new StringBuilder();
        for (Character c : base.toCharArray()) {
            if (c.equals(ch)) {
                sb.append(symb);
                sb.append(c);
            } else {
                sb.append(c);
                ch = c;
            }
        }
        return sb.toString();
    }

    private static String alphabetIndex(String base) {
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for (Character c : base.toLowerCase().toCharArray()) {
            sb.append(c - ch);
        }
        return sb.toString();
    }

    private static boolean isContainedToEnds(String base, String target) {
        int count_target = target.length();
        String find = base.substring(base.length() - count_target);
        return isContained(find, target);
    }

    private static int countTargenChar(String base, char target) {
        int count = 0;
        for (Character c : base.toCharArray()) {
            if (c.equals(target))
                count++;
        }
        return count;
    }

    private static boolean isContained(String base, String target) {
        if (base.indexOf(target) > -1) {
            return true;
        }
        return false;
    }

    private static void calculatedEvenAndOdd(int[] ints) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                oddSum++;
            } else {
                evenSum++;
            }
        }
        System.out.println("Odd elements count " + oddSum);
        System.out.println("Even elements count " + evenSum);
    }

    private static int indexOf(int[] ints, int val) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == val)
                return i;
        }
        return -1;
    }

    private static void minMaxAvgArrays(int[] ints) {
        int min = ints[0], max = ints[0], sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
            if (max < ints[i]) {
                max = ints[i];
            }
            sum += ints[i];
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Avg : " + ((float) (sum) / ints.length));
    }

    private static int[] concatenateTowArrays(int[] arr1, int[] arr2) {
        int len = arr1.length;
        int[] arr = new int[len + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[len + i] = arr[i];
        }
        return arr;
    }

    private static boolean isEqualTwoArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    private static boolean isSameFirstlastElementOfArray(int[] arr1) {
        if (arr1.length <= 1)
            return false;
        return (arr1[0] == arr1[arr1.length - 1]);

    }

    private static double sumOfFibonaci(int num) {
        int sum = 0;
        System.out.println(String.format("The first %d Fibonacci numbers are: ", num));
        for (int i = 1; i <= num; i++) {
            int fib = fibonaci(i);
            sum += fib;
            System.out.print(fib + " ");
        }
        System.out.println();
        double avg = avg(sum, num);
        System.out.println("The average is " + avg);
        return avg;
    }

    public static int calculatedSum(int num) {
        return calculated(0, num);
    }

    public static int calculated(int begin, int end) {
        int sum = 0;
        while (end >= begin) {
            sum += end;
            end--;
        }
        return sum;
    }

    public static double calculatedAvg(int begin, int end) {
        int sum = calculated(begin, end);
        System.out.println("Sum for range " + begin + " to " + end + " : " + sum);
        double avg = avg(sum, end - (begin == 0 ? begin : begin - 1));
        System.out.println("Average for range " + begin + " to " + end + " : " + avg);
        return avg;
    }

    public static double avg(int num, int count) {
        return (double) num / count;
    }

    public static int fibonaci(int num) {
        if (num <= 1)
            return num;
        return fibonaci(num - 1) + fibonaci(num - 2);
    }
}
