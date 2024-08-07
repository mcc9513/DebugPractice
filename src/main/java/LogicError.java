public class LogicError {
    int[] numList;

    public static double average(int[] numList) {
        // Default sum
        int sum = 0;

        // Get array length
        int length = numList.length;

        // Sum of all values in array using for loop
        for (int i = 0; i < numList.length; i++) {
            sum += numList[i];
        }

        // Logic error was already in original code: Performing integer division instead of floating-point division
        // the division happens between integers, resulting in an integer, then it is cast to a double, giving an incorrect answer with new values
        double result = sum / length; // Error occurs on this line (Line 15)

        return result;
    }

    public static void main(String[] args) {
        int[] numList = {5, 2, 3, 4, 5}; //changed the 1 from the original code to a 5, causing a sum that doesn't even divide to 3.0
        System.out.println(average(numList));
    }
}
