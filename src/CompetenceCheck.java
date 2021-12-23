import java.util.Arrays;
import java.util.Random;

public class CompetenceCheck {

    //Leetspeek Translator
    public static void leetspeek() {
        //Asking for a text to encrypt
        System.out.println("Please enter your message for encryption");
        String inputWords = Scanning.scan.nextLine();

        StringBuilder translatedResult = new StringBuilder();
        for (int i = 0; i < inputWords.length(); i++) {
            char character = inputWords.charAt(i);
            character = Character.toLowerCase(character);
            //A => '@' B => '8' C => '(' D => 'D' E => '3' F => 'F' G => '6' H => '#' I => '!' J => '9' K => 'K' L => '1' M => 'M' N => 'N' O => '0' P => 'P' Q => 'Q' R => 'R' S => '$' T => '7' U => 'U' V => 'V' W => 'W' X => 'X' Y => 'Y' Z => '2'
            character = switch (character) {
                case 'a' -> '@';
                case 'b' -> '8';
                case 'c' -> '(';
                case 'd' -> 'D';
                case 'e' -> '3';
                case 'f' -> 'F';
                case 'g' -> '6';
                case 'h' -> '#';
                case 'i' -> '!';
                case 'j' -> '9';
                case 'k' -> 'K';
                case 'l' -> '1';
                case 'm' -> 'M';
                case 'n' -> 'N';
                case 'o' -> '0';
                case 'p' -> 'P';
                case 'q' -> 'Q';
                case 'r' -> 'R';
                case 's' -> '$';
                case 't' -> '7';
                case 'u' -> 'U';
                case 'v' -> 'V';
                case 'w' -> 'W';
                case 'x' -> 'X';
                case 'y' -> 'Y';
                case 'z' -> '2';
                default -> character;
            };
            /*
            switch (character) {
                case 'a':
                case 'A':
                    character = '@';
                    break;
                case 'b':
                    character = '8';
                    break;
                case 'c':
                    character = '(';
                    break;
                case 'd':
                    character = 'D';
                    break;
                case 'e':
                    character = '3';
                    break;
                case 'f':
                    character = 'F';
                    break;
                case 'g':
                    character = '6';
                    break;
                case 'h':
                    character = '#';
                    break;
                case 'i':
                    character = '!';
                    break;
                case 'j':
                    character = '9';
                    break;
                case 'k':
                    character = 'K';
                    break;
                case 'l':
                    character = '1';
                    break;
                case 'm':
                    character = 'M';
                    break;
                case 'n':
                    character = 'N';
                    break;
                case 'o':
                    character = '0';
                    break;
                case 'p':
                    character = 'P';
                    break;
                case 'q':
                    character = 'Q';
                    break;
                case 'r':
                    character = 'R';
                    break;
                case 's':
                    character = '$';
                    break;
                case 't':
                    character = '7';
                    break;
                case 'u':
                    character = 'U';
                    break;
                case 'v':
                    character = 'V';
                    break;
                case 'w':
                    character = 'W';
                    break;
                case 'x':
                    character = 'X';
                    break;
                case 'y':
                    character = 'Y';
                    break;
                case 'z':
                    character = '2';
                    break;
                default:
                    character = character;
                    break;
            }
            */
            translatedResult.append(character);
        }
        System.out.println(translatedResult);
    }

    //Selection sort
    public static void selection() {
        int[] arr = {24, 22, 21, 13, 15, 18, 11, 9, 3, 2, 8, 12, -1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17, 24, 22, 0, 21, 13, -15, 18, 11, 9, 3, 2, 8, 0, 12, 1, 5, 10, 23, 20, 6, 4, 19, 16, 7, 14, 17};

        for (int i = 0; i < arr.length - 1; i++) {

            int lowestNumber = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestNumber])
                    lowestNumber = j;
            }
            int temp = arr[lowestNumber];
            arr[lowestNumber] = arr[i];
            arr[i] = temp;

        }

        //Print array
        System.out.println(Arrays.toString(arr));
    }

    //Merge sort
    public static void merge() {
        //fill arr with random numbers from -50 to 100 with 50 different numbers

        Random random = new Random();
        int[] arr = random.ints(4, -50, 100).toArray();

        //Print array
        System.out.println("Unsorted\n" + Arrays.toString(arr));

        //sort(arr, 0, arr.length - 1);
        splitArray(arr, 0, arr.length - 1); //leftSide 0; rightSide last element of array

        //Print array
        System.out.println("\nSorted\n" + Arrays.toString(arr));

    }

    private static void splitArray(int[] arr, int leftSide, int rightSide) {
        if (leftSide < rightSide) { //termination condition for recursion
            int middlePoint = leftSide + (rightSide - leftSide) / 2;

            splitArray(arr, leftSide, middlePoint); //Recursion for left side
            splitArray(arr, middlePoint + 1, rightSide); //Recursion for right side

            sort(arr, leftSide, middlePoint, rightSide); // Sort
        }
    }

    private static void sort(int[] arr, int leftSide, int middlePoint, int rightSide) {
        //create temp array
        int[] leftSideArray = new int[middlePoint - leftSide + 1];
        int[] rightSideArray = new int[rightSide - middlePoint];

        //Way 2 by Alex with <3
        //int[] leftArray = Arrays.copyOfRange(arr, 0, arr.length / 2); //better for understanding
        //arr | 0 is incl. | arr.length / 2 is excl.
        //int[] rightArray = Arrays.copyOfRange(arr, arr.length / 2, arr.length); //better for understanding

        //copy data from arr to temp array
        for (int i = 0; i < leftSideArray.length; ++i) //sizeTempArray1
            leftSideArray[i] = arr[leftSide + i];
        for (int j = 0; j < rightSideArray.length; ++j) //sizeTempArray2
            rightSideArray[j] = arr[middlePoint + 1 + j];

        //counter number
        int leftIndex = 0;
        int rightIndex = 0;

        // Initial index of merged subarea array
        int originalIndex = leftSide;
        while (leftIndex < leftSideArray.length && rightIndex < rightSideArray.length) { //as long as it is on the correct place
            if (leftSideArray[leftIndex] <= rightSideArray[rightIndex]) { // check if number is smaller or bigger
                arr[originalIndex] = leftSideArray[leftIndex];
                leftIndex++;
            } else {
                arr[originalIndex] = rightSideArray[rightIndex];
                rightIndex++;
            }
            originalIndex++;
        }

        //copy remaining elements of leftSideArray
        while (leftIndex < leftSideArray.length) {
            arr[originalIndex] = leftSideArray[leftIndex]; //from temp left to the original
            leftIndex++;
            originalIndex++;
        }

        //copy remaining elements of rightSideArray
        while (rightIndex < rightSideArray.length) {
            arr[originalIndex] = rightSideArray[rightIndex]; //from temp right to the original
            rightIndex++;
            originalIndex++;
        }
    }

}

