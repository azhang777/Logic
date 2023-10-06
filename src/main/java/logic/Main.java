package logic;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /**
     *
     * @param names
     * @return last index of an array by offsetting length by 1 since array index starts at 0.
     */
    public static int getLastIndex(String[] names) {
        int lastIndex = names.length - 1;

        return lastIndex;
    }

    /**
     *
     * @param names
     * @return second last index of an array by offsetting length by 2 since array index starts at 0.
     */
    public static int getSecondToLastIndex(String[] names) {
        int secondLastIndex = names.length - 2; //names.length is variable, we need to subtract 2 to get second last

        return secondLastIndex;
    }


    /**
     *
     * @param names
     * @return firstElement = names[0]. The first element of an array is always at index 0.
     */
    public static String getFirstElement(String[] names) {
        String firstElement = names[0]; //first element of any array is at index 0

        return firstElement;
    }

    /**
     *
     * @param names
     * @return lastElement = names[names.length - 1]. Since names.length - 1 will give us the last index.
     */
    public static String getLastElement(String[] names) {
        String lastElement = names[names.length - 1];

        return lastElement;
    }

    /**
     *
     * @param names
     * @return secondLastElement = names[names.length - 2]. Since names.length - 2 will give us the second last index.
     */
    public static String getSecondToLastElement(String[] names) {
        String secondLastElement = names[names.length - 2];

        return secondLastElement;
    }

    /**
     *
     * @param ints
     * @return iterate through the array and add it to the sum. After loop is complete, return the sum.
     */
    public static int getSum(int[] ints) {
        int sum = 0;

        for (int num : ints) {
            sum += num;
        }

        return sum;
    }

    /**
     *
     * @param ints
     * @return iterate through the array and add it to the sum. After looping is complete, divide the sum by the number
     * of elements using array.length to get average
     */
    public static int getAverage(int[] ints) {
        int average = 0;
        int sum = 0;

        for (int num : ints) {
            sum += num;
        }

        average = sum / ints.length;

        return average;
    }

    /**
     *
     * @param numbers
     * @return create a string builder that will extract odd numbers from array. Iterate through the array to find
     * odd numbers using %. If number is odd, concatenate it to the string builder. Return string builder after looping.
     */
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNums = "";

        for (int num : numbers) {
            if ((num % 2) == 1) {
                oddNums += num + " ";
            }
        }

        return oddNums;
    }

    /**
     *
     * @param numbers
     * @return create a string builder that will extract odd numbers from array. Iterate through the array to find
     * odd numbers using %. If number is even, concatenate it to the string builder. Return string builder after looping.
     */
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNums = "";

        for (int num : numbers) {
            if ((num % 2) == 0) {
                evenNums += num + " ";
            }
        }

        return evenNums;
    }

    /**
     *
     * @param names
     * @param element
     * @return loop through the array, if element is found in the array, return the true. If we exit the loop,
     * return false because we iterated through the entire loop and did not find the element.
     */
    public static boolean contains(String[] names, String element) {

        for (String name : names) {
            if (name.equals(element)) {
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param names
     * @param element
     * @return loop through the array, if element is found in the array, return the index of that array element. If we exit the loop,
     * return -1 because we iterated through the entire loop and did not find the element.
     */
    public static int getIndexByElement(String[] names, String element) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return i;
            }
        }

        return 0;
    }

    //Question 12

    /**
     *
     * @param start
     * @param end
     * we can use while/for loop to begin at start and finish at end. Use start to begin
     * and check if start is odd. Increment start until start laps end.
     */
    public static void printOddNumbersInRange(int start, int end) {
        String oddNums = "";

        while (start <= end) {
            if ((start % 2) != 0) {
                oddNums += start + " ";
            }
            start++;
        }

        System.out.println(oddNums);
    }

    //Question 13

    /**
     *
     * @param str
     * @param n
     * @return use a string builder. Loop by n and concatenate str to string builder
     * return string builder.
     */
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String newStr = "";

        for (int i = 0; i < n; i++) {
            newStr += str + " ";
        }

        return newStr;
    }

    //Question 14

    /**
     *
     * @param str
     * @param n
     * @return use substring method to grab the first three letters of str. Create str builder
     * to build with firstThreeInitial. Use loop to concatenate firstThreeInitial to newStr
     */
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThreeInitial = str.substring(0, 3);
        String newStr = "";

        for (int i = 0; i < n; i++) {
            newStr += firstThreeInitial;
        }

        return newStr;
    }

    //Question 15
    // Write a java method to count all the words in a string
    // whenever there is a space, a word is completed. There is a cat. 3 spaces -> 4 words.
    // The wizard of Oz is a book. 6 spaces -> 7 words.

    /**
     *
     * @param str
     * @return integer of words based on the spaces in a string + 1. If there are 3 spaces, there has to be 4 words.
     * Use regex to identify spaces " ". pattern and matcher allows us to find the spaces in str. Use while loop to
     * increment total words counter everytime matcher.find() works.
     */
    public static int wordsInAStringCounter(String str) {
        int totalWords = 0;
        String regex = " ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            totalWords++;
        }

        return totalWords + 1;
    }

    //Question 16
    //A, E, I, O, U, and sometimes Y

    /**
     *
     * @param str
     * @return integer of vowels based on regex [aeiouy] which covers (should) both capital and lowercase
     * Use pattern and matcher allows us to find the vowels in str. Use while loop to
     * increment total words counter everytime matcher.find() works.
     */
    public static int vowelsCounter(String str) {
        int counter = 0;
        String regex = "[aeiouy]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    //Question 17
    //Swap the first element in an array with the last element in an array and return

    /**
     *
     * @param stringArray
     * @return stringArray with first and last element swapped. Use temp variable to hold the value to prevent
     * it from being overridden. Then swap last element into the 0 index position. Then store the temp value in
     * the last index position.
     */
    public static String[] swap(String[] stringArray) {
        String temp = stringArray[0];
        stringArray[0] = stringArray[stringArray.length - 1];
        stringArray[stringArray.length - 1] = temp;

        return stringArray;
    }

    //Question 18

    /**
     * Given the following legend
     * <p>
     * f >> 7
     * s >> $
     * 1 >> !
     * a >> @
     * <p>
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     * <p>
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */
    /**
     *
     * @param str
     * @return convert str to char
     */
    public static String replaceCharacters(String str) {
        char[] charsOfStr = str.toCharArray();

        for (int i = 0; i < charsOfStr.length; i++) {
            switch (charsOfStr[i]) {
                case 'f', 'F' -> charsOfStr[i] = '7';
                case 's', 'S' -> charsOfStr[i] = '$';
                case '1' -> charsOfStr[i] = '!';
                case 'a', 'A' -> charsOfStr[i] = '@';
            }
        }

        return new String(charsOfStr);
    }

    //Question 19
    //   0     1    2     3     4    5   6
    //   1     2    3     4     5    6   7
    // " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String deliminator = " ";

        String[] words = stringInput.split(deliminator);

        for (int i = 0; i < words.length; i++) {
            if ((i+1) % 2 == 0) {
                words[i] = "Wu";
            }
            else if ((i+1) % 3 == 0) {
                words[i] = "Tang";
            }
        }
        String modifiedText = String.join(deliminator,words);
        //use string split method and deliminator to show when to split using the spaces to separate the word
        //take 2 before 3.
        return modifiedText;
    }


    // current element we are on is the sum of the past two elements
    // 0 1 1 2 3 5 8 13 21 34 55
    //Question 20
    //maxNumber is the max amount of elements.
    //maxNumber = 3
    //output is 1 1 2
    //maxNumber = 5
    //output is 1 1 2 3 5
    public static String createStringOfFibonnaciUpToMax(int maxNumber) {
        String builder = "";
        int previousNum = 1;
        int nextNum = 1;
        //the sum of the next number is the addition of the previous two.
        for (int i = 1; i <= maxNumber; i++) {
            builder += previousNum + " ";
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }
        return builder;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 8, 11};
        String[] names = {"Jenny", "Rocky", "Stephen", "Carol", "Kingsley", "swap0"};
        //System.out.println(numbers[1] * numbers[3]);
        System.out.println(getLastIndex(names)); //expected 4
        System.out.println(getSecondToLastIndex(names)); //expected 3
        System.out.println(getFirstElement(names)); //expected Jenny
        System.out.println(getLastElement(names)); //expected Kingsley
        System.out.println(getSecondToLastElement(names)); //expected Carol
        System.out.println(getSum(numbers)); //expected sum of 30
        System.out.println(getAverage(numbers)); //expected average of 6
        System.out.println(extractAllOddNumbers(numbers)); //expected 1, 11
        System.out.println(extractAllEvenNumbers(numbers)); //expected 4, 6, 8
        System.out.println(contains(names, "Carol")); //expected true
        System.out.println(getIndexByElement(names, "Stephen")); //expected 2
        printOddNumbersInRange(0, 10); //expected 1,3,5,7,9;
        System.out.println(printGivenStringTimesNumberGiven("Three", 3)); //expected Three Three Three;
        System.out.println(repeatFirstThreeLetters("Apple", 3)); //expected AppAppApp
        System.out.println(wordsInAStringCounter("The wizard of Oz is a book.")); //expected 7
        System.out.println(vowelsCounter("is this a list? years in the making")); //expected 10
        System.out.println(Arrays.toString(swap(names))); //{"swap0", "Rocky", "Stephen", "Carol", "Kingsley", "Jenny"};
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println(createStringOfFibonnaciUpToMax(5));
    }
}