public class LogicErrorFixed {
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

        //logic error was already there
        double result = (double) sum / length; //placed breakpoint at this line, observed the sum was 19 and the length is 5, which should have given an average of 3.8
        //added (double) to line above, causing the expression sum/length to be double
        return result;
    }

    public static void main(String[] args) {
        int[] numList = {5, 2, 3, 4, 5};
        System.out.println(average(numList));
    }
}
